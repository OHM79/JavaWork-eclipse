
/*
 *   �N���X��        �FRegist
 *   �\�[�X�t�@�C�����FRegist.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import com.fjqs.java.labs.chap7.UserException;

public class Regist {

	public static void main(String args[]) {

		// �h���C�o�N���X
		String driver = "com.mysql.jdbc.Driver";
		// �f�[�^�x�[�X��URL
		String url = "jdbc:mysql://localhost:3306/fjqs_DB";
		// �f�[�^�x�[�X�̃��[�U
		String user = "root";
		// �p�X���[�h
		String pass = "password";

		Connection con = null;      // �R�l�N�V����
		PreparedStatement stmt = null;      // �X�e�[�g�����g
		ResultSet res = null;      // ���ʃZ�b�g

		// ���t���
		Calendar cal = Calendar.getInstance();
		java.sql.Date date = new java.sql.Date(cal.getTime().getTime());

		// �x�X���
		String code = "";             // �x�X�R�[�h
		int total = 0;				// ���z�B����

		// �z���ԏ��
		String areaCode = "";             // �n��R�[�h
		int undelivery = 0;				// �z���ԏ��

		// �z�B���
		int orderNo = 1;				// �ԍ�
		String sName = "";				// ���o�l���O
		String sAddress = "";				// ���o�l�Z��
		String rName = "";				// ���l���O
		String rAddress = "";				// ���l�Z��
		java.sql.Date orderDate = date;

		if (args.length == 5) {
			areaCode = args[0];
			sName = args[1];
			sAddress = args[2];
			rName = args[3];
			rAddress = args[4];
		} else {
			System.out.println("�n��R�[�h�A���o�l�����A���o�l�Z���A"
					+ "���l�����A���l�Z�����w�肵�Ă�������");
			System.exit(-1);
		}

		try {
			// �h���C�o�̃��[�h
			Class.forName(driver);

			// �R�l�N�V�����̎擾
			con = DriverManager.getConnection(url, user, pass);

			// �I�[�g�R�~�b�g����
			con.setAutoCommit(false);

			String getDelivery_van = "select * from delivery_van Where AREACODE = ?;";

			// �z���ԃe�[�u��������擾
			stmt = con.prepareStatement(getDelivery_van);
			stmt.setString(1, areaCode);
			res = stmt.executeQuery();
			String targetCode;		// �擾�����z���Ђ̎x�X�R�[�h
			int targetUndelivery;	// �z���Ԃ̖��z�B��
			if (res.next()) {
				targetCode = res.getString("CODE");
				targetUndelivery = res.getInt("UNDELIVERY");
				targetUndelivery++; // �z���Ԃ̔z�B�������̂��߂ɉ��Z
			} else {
				String msg = "���͂��ꂽ�n��R�[�h�ɑΉ������񂪌�����܂���ł����B";
				throw new UserException(msg);
			}

			// �x�X�e�[�u������x�X�R�[�h�ƈ�v������̂��擾
			String getBranchSql = "select * from branch Where CODE = ?;";
			// �x�X�e�[�u��������擾
			stmt = con.prepareStatement(getBranchSql);
			stmt.setString(1, targetCode);
			res = stmt.executeQuery();

			int branchUndeliveryTotal;
			if (res.next()) {
				branchUndeliveryTotal = res.getInt("TOTAL");
				branchUndeliveryTotal++; // �x�X���Ƃ̖��z�B�������̂��߂ɉ��Z
			} else {
				String msg = "���͂��ꂽ�x�X�R�[�h�̂��̂��擾�o���܂���ł����B";
				throw new UserException(msg);
			}

			// �z�B�e�[�u���ɉ����̐������邩���ׂ�
			String getDeliverysSql = "select count(*) as DeliverCount  from deliverys";
			stmt = con.prepareStatement(getDeliverysSql);
			res = stmt.executeQuery();

			int DeliverCount;
			if (res.next()) {
				DeliverCount = res.getInt("DeliverCount");
				DeliverCount++; // �V�����z�B���̎󒍔ԍ��̂��߂ɉ��Z
			} else {
				String msg = "�z�B�����̍��v���擾�ł��܂���ł����B";
				throw new UserException(msg);
			}

			// �z�B�e�[�u���ɐV�K�z�B����ǉ�
			String insertBranchSql = "Insert Into deliverys Values(?,?,?,?,?,?,?,?,?)";
			stmt = con.prepareStatement(insertBranchSql);
			stmt.setInt(1, DeliverCount);
			stmt.setString(2, areaCode);
			stmt.setString(3, sName);
			stmt.setString(4, sAddress);
			stmt.setString(5, rName);
			stmt.setString(6, rAddress);
			stmt.setDate(7, orderDate);
			stmt.setString(8, null);
			stmt.setInt(9, 0);

			// �V�K�z�B���̒ǉ�
			int num = stmt.executeUpdate();
			if (num == 0) {
				String msg = "�z�B���̐V�K�ǉ��Ɏ��s���܂���";
				throw new UserException(msg);
			}

			// �z���ԃe�[�u���̖��z�B�����̉��Z
			String updateVanSql = "Update delivery_van Set UNDELIVERY =? where AREACODE = ? ";
			stmt = con.prepareStatement(updateVanSql);
			stmt.setInt(1, targetUndelivery);
			stmt.setString(2, areaCode);

			int num2 = stmt.executeUpdate();
			if (num2 == 0) {
				String msg = "�z���Ԃ̃e�[�u���̖��z�B���̉��Z�Ɏ��s���܂���";
				throw new UserException(msg);
			}

			// �z���ԃe�[�u���̖��z�B�����̉��Z
			String updateBranchSql = "Update branch Set TOTAL =? where CODE = ? ";
			stmt = con.prepareStatement(updateBranchSql);
			stmt.setInt(1, branchUndeliveryTotal);
			stmt.setString(2, targetCode);

			int num3 = stmt.executeUpdate();
			if (num3 == 0) {
				String msg = "�z�B���̐V�K�ǉ��Ɏ��s���܂���";
				throw new UserException(msg);
			}

			// �g�����U�N�V�������R�~�b�g����
			con.commit();
			System.out.println("�z�B��񂪐V�K�ɍ쐬����܂����B");

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
