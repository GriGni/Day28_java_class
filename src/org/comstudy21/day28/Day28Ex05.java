package org.comstudy21.day28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day28Ex05 {
	// ��Ŭ�����ܿ� �ִ� ���� �����о���� fileInputStream�� "��Ŭ�������� �ִ� ���Ϸ� ����."
	public static void main(String[] args) throws IOException {
		//������ ������ �о�ͼ� ȭ�鿡 ����Ѵ�.
		//1
		FileInputStream input = new FileInputStream("C:\\Users\\Kosmo_09\\Documents\\news.txt"); //������ ���� ��.
		//2 out�� ���� �ʿ䰡 ����.
		//3 �о���� ��Ʈ
		int data = 0;
		while((data = input.read()) != -1) {
			System.out.write(data);
		}
		// ���� ����� ������
		input.close();
	}
}
