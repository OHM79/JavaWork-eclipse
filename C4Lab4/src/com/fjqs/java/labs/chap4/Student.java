/*
 *   �N���X��        �Fcom.fjqs.java.labs.chap4.Student
 *   �\�[�X�t�@�C�����FStudent.java
 *   ���쌠�\��      �FCopyright 2015 Fujitsu Kyushu Systems Limited
 */

package com.fjqs.java.labs.chap4;

// ���k�N���X
public class Student implements StudentInterface {

    private String name;         // ���O
    private String grade;        // �w�N
    
    // �R���X�g���N�^
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    
    // ���O�\��
    public void printName() {
        System.out.println(name + "�ł�");
    }
    
    // �w�N�\��
    public void printGrade() {
        System.out.println(grade + "�ł�");
    }
}

