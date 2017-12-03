/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.Employee
 *   �\�[�X�t�@�C�����FEmployee.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// �]�ƈ��N���X
public class Employee implements EmployeeInterface {

    private String name;            // ���O
    private String description;     // �E��
    private int annualIncome;       // �N��
    
    // �R���X�g���N�^
    public Employee(String name, String description,
                                                 int annualIncome) {
        this.name = name;
        this.description = description;
        this.annualIncome = annualIncome;
    }
    
    // ���O�\��
    public void printName() {
        System.out.println(name + "�ł�");
    }
    
    // �E��\��
    public void printDescription() {
        System.out.println(description + "������Ă��܂�");
    }
    
    // �N���\��
    public void printAnnualIncome() {
        System.out.println("�N���́A " + annualIncome + " �~�ł�");
    }
}

