
/*
 *   �N���X��        �FFindBranch2
 *   �\�[�X�t�@�C�����FFindBranch2.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// �x�X�E�z���Ԍ����N���X
public class FindBranch2 {

	public static void main(String args[]) {

		// �h���C�o�N���X
		String driver = "com.mysql.jdbc.Driver";
		// �f�[�^�x�[�X��URL
		String url = "jdbc:mysql://localhost:3306/fjqs_DB";
		// �f�[�^�x�[�X�̃��[�U
		String user = "root";
		// �p�X���[�h
		// String pass = "password";
		String pass = "11yatuyorosi9";

		Connection con = null; // �R�l�N�V����
		PreparedStatement stmt1 = null; // �X�e�[�g�����g�i�x�X�p�j
		PreparedStatement stmt2 = null; // �X�e�[�g�����g�i�z���ԗp�j
		ResultSet res1 = null; // ���ʃZ�b�g�i�x�X�p�j
		ResultSet res2 = null; // ���ʃZ�b�g�i�z���ԗp�j

		String code = ""; // �x�X�R�[�h
		if (args.length == 1) {
			code = args[0];
		} else {
			System.out.println("�x�X�R�[�h���w�肵�Ă�������");
			System.exit(-1);
		}

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * from BRANCH as bra Where bra.CODE = ?;";
			stmt1 = con.prepareStatement(sql);
			stmt1.setString(1, code);
			res1 = stmt1.executeQuery();

			if (res1.next()) {
				String cod = res1.getString("CODE");
				String address = res1.getString("ADDRESS");
				String tel = res1.getString("TEL");
				String TOTAL = res1.getString("TOTAL");

				System.out.println("--------�x�X���----------");
				System.out.println("�x�X�R�[�h		: " + cod);
				System.out.println("�Z��			: " + address);
				System.out.println("�d�b�ԍ�		: " + tel);
				System.out.println("���z�B����		: " + TOTAL);
				try {
					sql = "SELECT * FROM delivery_van WHERE CODE = ?;";
					stmt2 = con.prepareStatement(sql);
					stmt2.setString(1, code);
					res2 = stmt2.executeQuery();

					System.out.println("\n--------�z���ԏ��----------");
					System.out.println("�x�X�R�[�h	�n��R�[�h	���z�B�ו�");
					while (res2.next()) {
						String vanCod = res2.getString("CODE");
						String vanAddress = res2.getString("AREACODE");
						String uni = res2.getString("UNDELIVERY");
						System.out.printf("%s		%s		%s\n", vanCod, vanAddress, uni);
					}
				} catch (Exception e) {
					System.out.println(e);
				}
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