package org.comstudy21.day28;

import java.io.File;
import java.io.IOException;

public class Day28Ex06 {

	public static void main(String[] args) throws IOException {
		//���� ��� 1
		String pathName = "data.txt";
//		String pathName = "������ ��ο� ������ ���� �� �ִ�.";
		File file = new File(pathName);
		
		//2		
		if(file.exists()) {
			System.out.println("������ �����մϴ�.");
			if(file.delete()) {
				System.out.println("���� ���� ����!");
			}
		}else {
			System.out.println("������ �����մϴ�.");
			//������ ������ ���� �����
			if(file.createNewFile()) {
				System.out.println("���� ���� ����!");
			}
		}
		
	}
}
//test io�� ������ �����ؼ� test2�� �ٿ���
//test2�� ����� �ȿ� ������ �����ؼ� test2�� ���̱�
//�����Ѵٴ� �ǹ̴� �ȿ� ��µ� ������ ��Ƽ� test2�� �ִ� ��.��