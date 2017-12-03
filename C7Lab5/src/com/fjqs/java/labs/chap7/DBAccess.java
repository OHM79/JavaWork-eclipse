/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap7.DBAccess
 *   �\�[�X�t�@�C�����FDBAccess.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap7;

import java.sql.*;
import java.util.*;

// �f�[�^�x�[�X����N���X
public class DBAccess {
	
    private Connection con;		// �R�l�N�V����
    private Statement stmt;		// �X�e�[�g�����g
    private ResultSet  res;		// ���ʃZ�b�g
	
    // �R���X�g���N�^(�R�l�N�V�����̎擾)
    public DBAccess(Connection con) {
		this.con = con;
    }
    
    // �x�X���擾
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
                String msg = "�x�X�R�[�h '" + cd + "' �ɑΉ�����"
                                     + "�x�X��񂪌�����܂���ł���";
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
    
    // �z���ԏ��擾
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
                String msg = "�n��R�[�h '" + cd + "' �ɑΉ�����"
                                  + "�z���ԏ�񂪌�����܂���ł���";
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
	
	// �z�B���擾
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
                String msg = "�`�[�ԍ� '" + no + "' �ɑΉ�����"
                           + "�z�B��񂪌�����܂���ł���";
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
