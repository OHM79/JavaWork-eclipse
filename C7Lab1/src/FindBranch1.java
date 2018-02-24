/*
 *   �N���X��        �FFindBranch1
 *   �\�[�X�t�@�C�����FFindBranch1.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// �x�X��񌟍��N���X
public class FindBranch1 {

	public static void main(String args[]) {

		// �h���C�o�N���X
		String driver = "com.mysql.jdbc.Driver";
		// �f�[�^�x�[�X��URL
		String url = "jdbc:mysql://localhost:3306/fjqs_DB";
		// �f�[�^�x�[�X�̃��[�U
		String  user  = "root";
		// �p�X���[�h
		String pass = "password";

		Connection con = null;               // �R�l�N�V����
		PreparedStatement stmt = null;     			 // �X�e�[�g�����g
		ResultSet res = null;               // ���ʃZ�b�g

		String code = "";            		 // �x�X�R�[�h
		if (args.length == 1) {
			code = args[0];
		}
		else {
			System.out.println("�x�X�R�[�h���w�肵�Ă�������");
			System.exit(-1);
		}

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT * FROM BRANCH WHERE CODE = ?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, code);
			res = stmt.executeQuery();

			if(res.next()){
				String cod = res.getString("CODE");
				String address = res.getString("ADDRESS");
				String tel = res.getString("TEL");
				String TOTAL = res.getString("TOTAL");

				System.out.println("--------�x�X���----------");
				System.out.println("�x�X�R�[�h		:" + cod);
				System.out.println("�Z��			:" + address);
				System.out.println("�d�b�ԍ�		:" + tel);
				System.out.println("���z�B����		:" + TOTAL);
			} else {
				System.out.println("�x�X�R�[�h '" + code + "' �ɑΉ�������͌�����܂���ł����B");
			}

		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
