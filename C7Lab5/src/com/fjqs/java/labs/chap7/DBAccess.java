/*
 *   クラス名        ：com.fjqs.java.labs.chap7.DBAccess
 *   ソースファイル名：DBAccess.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap7;

import java.sql.*;
import java.util.*;

// データベース操作クラス
public class DBAccess {
	
    private Connection con;		// コネクション
    private Statement stmt;		// ステートメント
    private ResultSet  res;		// 結果セット
	
    // コンストラクタ(コネクションの取得)
    public DBAccess(Connection con) {
		this.con = con;
    }
    
    // 支店情報取得
    public HashMap findBranchByCode(String cd) throws UserException {
    	HashMap<String,Object> ret = new HashMap<String,Object>();
    	try {
	    	stmt = con.createStatement();
    		String sql = "Select * from Branch "
    			                     + "Where Code = '" + cd + "'";
        	res = stmt.executeQuery(sql);
        	if(res.next()) {
        		ret.put("code"   , res.getString("CODE"));
        		ret.put("address", res.getString("ADDRESS"));
        		ret.put("tel"    , res.getString("TEL"));
        		ret.put("total"  , res.getInt("TOTAL"));
        	}
        	else {
                String msg = "支店コード '" + cd + "' に対応する"
                                     + "支店情報が見つかりませんでした";
                throw new UserException(msg);
            }
        }
        catch(SQLException e) {
        	throw new UserException(e.getMessage());
        }
        finally {
        	try {
        		if(res != null) {
        			res.close();
        		}
        		if(stmt != null) {
        			stmt.close();
        		}
        	}
        	catch(SQLException e) {
        		e.printStackTrace();
        	}
        }
        return ret;
    }
    
    // 配送車情報取得
    public HashMap findDeliveryVanByAreaCode(String cd)
    										 throws UserException {
    	HashMap<String,Object> ret = new HashMap<String,Object>();
    	try {
	    	stmt = con.createStatement();
    		String sql = "Select * from Delivery_Van "
                    		      + "Where AreaCode = '" + cd + "'";
        	res = stmt.executeQuery(sql);
        	if(res.next()) {
        		ret.put("code"      , res.getString("CODE"));
        		ret.put("areacode"  , res.getString("AREACODE"));
        		ret.put("undelivery", res.getInt("UNDELIVERY"));
        	}
        	else {
                String msg = "地区コード '" + cd + "' に対応する"
                                  + "配送車情報が見つかりませんでした";
                throw new UserException(msg);
            }
        }
        catch(SQLException e) {
        	throw new UserException(e.getMessage());
        }
        finally {
        	try {
        		if(res != null) {
        			res.close();
        		}
        		if(stmt != null) {
        			stmt.close();
        		}
        	}
        	catch(SQLException e) {
        		e.printStackTrace();
        	}
        }
        return ret;
    }
	
	// 配達情報取得
    public HashMap findDeliverysByOrderNo(int no)
    					     throws UserException {
    	HashMap<String,Object> ret = new HashMap<String,Object>();
    	try {
    		stmt = con.createStatement();
    		String sql = "Select * from Deliverys "
    				              + "Where OrderNo = " + no + " ";
        	res = stmt.executeQuery(sql);
        	if(res.next()) {
        		ret.put("no", res.getInt("ORDERNO"));
        		ret.put("areacode", res.getString("AREACODE"));
        		ret.put("sname", res.getString("SENDERNAME"));
        		ret.put("saddress", res.getString("SENDERADDRESS"));
        		ret.put("rname", res.getString("RECIPIENTNAME"));
        		ret.put("raddress", res.getString("RECIPIENTADDRESS"));
        		ret.put("odate", res.getDate("ORDERDATE"));
        		java.sql.Date cDate = res.getDate("CMPDATE");
        		if(cDate != null) {
        			ret.put("cdate", cDate);
        		}
        		ret.put("state", res.getInt("STATE"));
        	}
        	else {
                String msg = "伝票番号 '" + no + "' に対応する"
                           + "配達情報が見つかりませんでした";
                throw new UserException(msg);
            }
        }
        catch(SQLException e) {
        	throw new UserException(e.getMessage());
        }
        finally {
        	try {
        		if(res != null) {
        			res.close();
        		}
        		if(stmt != null) {
        			stmt.close();
        		}
        	}
        	catch(SQLException e) {
        		e.printStackTrace();
        	}
        }
        return ret;
    }
}
