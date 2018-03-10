/*
 *   �N���X��        �FInsertBranch
 *   �\�[�X�t�@�C�����FInsertBranch.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fjqs.java.labs.chap7.UserException;

public class InsertBranch {

	public static void main(String args[]) {

		// �h���C�o�N���X
		String driver = "com.mysql.jdbc.Driver";
		// �f�[�^�x�[�X��URL
		String url = "jdbc:mysql://localhost:3306/fjqs_DB";
		// �f�[�^�x�[�X�̃��[�U
		String  user  = "root";
		// �p�X���[�h
		String  pass  = "password";

		Connection con = null;      // �R�l�N�V����
		PreparedStatement stmt = null;      // �X�e�[�g�����g
		ResultSet res = null;      // ���ʃZ�b�g

		// �x�X���
		String branchCode = "";    		// �x�X�R�[�h
		String address     = "";			// �Z��
		String tel = "";    		// �d�b�ԍ�
		int total = 0;    		// ���z�B����

		// �R�}���h���C������p�����^���擾
		if (args.length == 3) {
			branchCode = args[0];
			address = args[1];
			tel = args[2];
		} else {
			System.out.println("�x�X�R�[�h�A�Z���A�d�b�ԍ�����͂��Ă�������");
			System.exit(-1);
		}

		try {
			// �h���C�o�̃��[�h
			Class.forName(driver);

			// �R�l�N�V�����̎擾
			con = DriverManager.getConnection(url, user, pass);

			// �I�[�g�R�~�b�g����
			con.setAutoCommit(false);

			String getBranchSql = "select * from branch;";

			// �x�X�e�[�u��������擾
			stmt = con.prepareStatement(getBranchSql);
			res = stmt.executeQuery();

			while (res.next()) {
				String getCode = res.getString("CODE");
				if (getCode.equals(branchCode)) {
					String msg = "���͂��ꂽ�x�X�R�[�h�͊��ɓo�^����Ă��܂��B";
					throw new UserException(msg);
				}
			}

			String insertBranchSql = "Insert Into branch Values(?, ?, ?, ?)";
			// �x�X�e�[�u���֑}��
			stmt = con.prepareStatement(insertBranchSql);
			stmt.setString(1, branchCode);
			stmt.setString(2, address);
			stmt.setString(3, tel);
			stmt.setInt(4, 0);

			// �V�K�󒍂̒ǉ�
			int num = stmt.executeUpdate();

			if (num == 0) {
				String msg = "�x�X�̐V�K�ǉ��Ɏ��s���܂���";
				throw new UserException(msg);
			}

			// �g�����U�N�V�������R�~�b�g����
			con.commit();

			System.out.println("�x�X��񂪓o�^����܂����B");
			System.out.println("--------�x�X���----------");
			System.out.println("�x�X�R�[�h		: " + branchCode);
			System.out.println("�Z��			: " + address);
			System.out.println("�d�b�ԍ�		: " + tel);
			System.out.println("���z�B����		: " + 0); // �V�K�̂��ߖ��z�B��0
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				con.rollback();		// �g�����U�N�V���������[���o�b�N����
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		} catch (UserException e) {
			try {
				con.rollback();		// �g�����U�N�V���������[���o�b�N����
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			System.out.println(e.getMessage());
		} finally {
			try {
				if (res != null) {
					res.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
