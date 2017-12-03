/*
    クラス名        ：ConnectionManager
    ソースファイル名：ConnectionManager.java
    著作権表示      ：Copyright 2013 Fujitsu Kyushu Systems Limited
*/

package com.fjqs.java.labs.chap4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {//Singletonのパターンを適用

    // 自インスタンス
    private static ConnectionManager instance = null;
    
    // コンストラクタ
    private ConnectionManager() {
    }
    
    // インスタンス生成、取得
    public static ConnectionManager getInstance() {
        if (instance==null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    // コネクション取得
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
