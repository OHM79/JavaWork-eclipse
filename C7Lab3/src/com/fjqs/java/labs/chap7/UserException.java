/*
 *   クラス名        ：com.fjqs.java.labs.chap7.UserException
 *   ソースファイル名：UserException.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap7;

public class UserException extends Exception {

    // コンストラクタ
    public UserException() {
        super();
    }
    
    // 任意のエラーメッセージを設定する
    public UserException(String message) {
        super(message);
    }
}
