/*
    �N���X��        �FConnectionManager
    �\�[�X�t�@�C�����FConnectionManager.java
    ���쌠�\��      �FCopyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {//Singleton�̃p�^�[����K�p

    // ���C���X�^���X
    private static ConnectionManager instance = null;
    
    // �R���X�g���N�^
    private ConnectionManager() {
    }
    
    // �C���X�^���X�����A�擾
    public static ConnectionManager getInstance() {
        if (instance==null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    // �R�l�N�V�����擾
    public synchronized Connection getConnection() 
                                  throws ClassNotFoundException, SQLException {
        Connection con = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String user   = "root";
        String pass   = "password";
        String url    = "jdbc:mysql://localhost:3306/fjqs_DB";
        
        Class.forName(driver);
        con = DriverManager.getConnection(url,user,pass);
        return con;
    }
}
