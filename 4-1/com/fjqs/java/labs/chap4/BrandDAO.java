/*
    �N���X��        �FBrandDAO
    �\�[�X�t�@�C�����FBrandDAO.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BrandDAO {

    private Connection con;                 // �R�l�N�V����
    
    // �R���X�g���N�^
    public BrandDAO(Connection con) {
        this.con = con;
    }
    
    // �����ꗗ�擾
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

    // �w������擾
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
}
