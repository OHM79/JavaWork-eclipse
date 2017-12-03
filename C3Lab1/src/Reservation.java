/*
 *   �N���X��        �FReservation
 *   �\�[�X�t�@�C�����FReservation.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

// �\��N���X
class Reservation {
	
	// �󎺏�
	boolean rooms[] = {true, false, false, true, false};
	
	// �󎺏󋵊m�F
	void check() {
		String message = "����";	// �\�����b�Z�[�W
		int count = 0;				// �󎺐�
		
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i]) {
				message += "�A" + (i + 1) + "����";
				count++;
			}
		}
		
		if(count != 0) {
			message += "���󂢂Ă��܂��B";
		}
		else {
			message += "�󎺂͂���܂���B";
		}
		
		System.out.println(message);
	}
	
	// �\�񂷂�
	void reserv(int no) {
		if(rooms[no-1]) {
			rooms[no-1] = false;
			System.out.println( no + "������\�񂵂܂����B");
		}
		else {
			System.out.println( no + "�����͋󂢂Ă��܂���B");
		}
	}
	
	// �\����L�����Z������
	void cancel(int no) {
		if(!rooms[no-1]) {
			rooms[no-1] = true;
			System.out.println( no 
				+ "�����̗\����������܂����B");
		}
		else {
			System.out.println( no 
				 + "�����͗\�񂳂�Ă��܂���B");
		}
	}
}

