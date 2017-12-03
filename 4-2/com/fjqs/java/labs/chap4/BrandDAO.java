/*
    クラス名        ：BrandDAO
    ソースファイル名：BrandDAO.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BrandDAO {

    private Connection con;                 // コネクション
    
    // コンストラクタ
    public BrandDAO(Connection con) {
        this.con = con;
    }
    
    // 銘柄一覧取得
    public ArrayList<Brand> findAll() throws SQLException {
        ArrayList<Brand>   ret = new ArrayList<Brand>();
        PreparedStatement stmt = null;
        ResultSet          res = null;
        
        try {
            String sql = "Select * from Brand";
            stmt = con.prepareStatement(sql);
            res = stmt.executeQuery();
            
            while (res.next()) {
                Brand brd = new Brand(
                    res.getString("BRAND_NO"),
                    res.getString("BRAND_NAME"),
                    res.getInt("PRESENT_PRICE")
                );
                ret.add(brd);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            try{
                res.close();
                stmt.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    // 指定銘柄取得
    public Brand findBrand(String brandNo) throws SQLException {
        Brand              ret = null;
        PreparedStatement stmt = null;
        ResultSet          res = null;
        
        try {
            String sql = "Select * from Brand where BRAND_NO=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,brandNo);
            res  = stmt.executeQuery();
            
            if (res.next()) {
                ret = new Brand(
                    res.getString("BRAND_NO"),
                    res.getString("BRAND_NAME"),
                    res.getInt("PRESENT_PRICE")
                );
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            try{
                res.close();
                stmt.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }
    
    // 銘柄登録
    public boolean insertBrand(Brand newObj) throws SQLException {
        boolean            ret = false;
        PreparedStatement stmt = null;
        
        try {
            String sql = "Insert into Brand values(?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,newObj.getNumber());
            stmt.setString(2,newObj.getName());
            stmt.setInt(3,newObj.getPresentPrice());

            int count  = stmt.executeUpdate();
            
            if (count==1) {
                ret = true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            try{
                stmt.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    // 銘柄削除
    public boolean deleteBrand(String brandNo) throws SQLException {
        boolean            ret = false;
        PreparedStatement stmt = null;
        
        try {
            String sql = "Delete from Brand where BRAND_NO=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,brandNo);

            int count  = stmt.executeUpdate();
            
            if (count==1) {
                ret = true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            try{
                stmt.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    // 現在値更新
    public boolean updatePresentPrice(Brand obj) throws SQLException {
        boolean            ret = false;
        PreparedStatement stmt = null;
        
        try {
            String sql = "Update Brand set PRESENT_PRICE=? where BRAND_NO=?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getPresentPrice());
            stmt.setString(2,obj.getNumber());

            int count  = stmt.executeUpdate();
            
            if (count==1) {
                ret = true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            try{
                stmt.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }
}
