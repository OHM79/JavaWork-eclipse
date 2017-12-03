/*
 *   クラス名        ：Reservation
 *   ソースファイル名：Reservation.java
 *   著作権表示      ：Copyright 2015 Fujitsu Kyushu Systems Limited
 */

// 予約クラス
class Reservation {
	
	// 空室状況
	boolean rooms[] = {true, false, false, true, false};
	
	// 空室状況確認
	void check() {
		String message = "現在";	// 表示メッセージ
		int count = 0;				// 空室数
		
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i]) {
				message += "、" + (i + 1) + "号室";
				count++;
			}
		}
		
		if(count != 0) {
			message += "が空いています。";
		}
		else {
			message += "空室はありません。";
		}
		
		System.out.println(message);
	}
	
	// 予約する
	void reserv(int no) {
		if(rooms[no-1]) {
			rooms[no-1] = false;
			System.out.println( no + "号室を予約しました。");
		}
		else {
			System.out.println( no + "号室は空いていません。");
		}
	}
	
	// 予約をキャンセルする
	void cancel(int no) {
		if(!rooms[no-1]) {
			rooms[no-1] = true;
			System.out.println( no 
				+ "号室の予約を取り消しました。");
		}
		else {
			System.out.println( no 
				 + "号室は予約されていません。");
		}
	}
}

