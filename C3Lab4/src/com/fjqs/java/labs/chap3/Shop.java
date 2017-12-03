/*
 *   �N���X��        �FShop
 *   �\�[�X�t�@�C�����FShop.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

// Shop�N���X���p�b�P�[�W�����Ă��������B

// �X�N���X
public class Shop {
	
	private Vegetable list[];		// ��舵�����i
	
	// ����������
	public Shop() {
		list = new Vegetable[4];
		
		list[0] = new Vegetable("�g�}�g", "pac", 250, 10);
		list[1] = new Vegetable("�Ȃ�", "pac", 300, 12);
		list[2] = new Vegetable("�卪", "�{", 150, 7);
		list[3] = new Vegetable("���^�X", "��", 200, 5);
	}
	
	// �w������
	public void buy(String name, int quantity) {
		Vegetable goods = null;
		
		// ���i����
		for(Vegetable veg : list) {
			if(name.equals(veg.getName())) {
				goods = veg;
				break;
			}
		}
		
		if(goods != null) {
			if(goods.getStock() == 0){
				System.out.println("�\���󂠂�܂���B" + name
								 + "�͔���؂ꒆ�ł��B");
			}
			else if(goods.getStock() < quantity) {
				System.out.println("�\���󂠂�܂���B" + name
								 + "�͍݌ɂ�����܂���B");
			}
			else {
				goods.setStock(goods.getStock() - quantity);
				System.out.println("���肪�Ƃ��������܂��B�����"
				+ (goods.getPrice() * quantity) + "�~�ł��B");
			}
		}
		else {
			System.out.println("�\���󂠂�܂���B" + name
							 + "�́A�����Ă���܂���B");
		}
	}
}

