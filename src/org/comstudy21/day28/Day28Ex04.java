package org.comstudy21.day28;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Day28Ex04 {
	
	public static void test(String[] args) throws IOException {
		//��ĳ���� 1
		InputStream in = System.in;  // ���� in���� ���µ� �׳� �ٲ㺸�°���
		//FileOutputStream�� �θ� OutputStream�̱⵵ �ϴ�.
		OutputStream out = System.out; // printstream�� outputstream �ڼ��̶� ������ ���ɽ���.�տ� (Outputstream) ����
		
		//FileInputStream�� �θ� InputStream�̱⵵ �ϴ�.
		//Ű�����Է� --> ȭ�� ���.
		System.out.print("������ �Է�>> ");
		//2
		int data = 0;
		while((data = System.in.read())!= -1) {
			//3
			out.write(data);  //print�� print��Ʈ�����־
		}
	
	}
	// �����͸� �Է��ؼ� �ý�Ʈ ���Ͽ� �ִ� ��.
	public static void main(String[] args) throws IOException {
		// ���⼭ �������Է��� �ϸ� ���Ͽ� �����Ͱ� ���ϴ�.
		// ���� �� �ҷ����� ����� �߰��� �� �ֽ��ϴ�.
		//��ĳ���� 1
		InputStream in = System.in;  // ���� in���� ���µ� �׳� �ٲ㺸�°���
		//FileOutputStream�� �θ� OutputStream�̱⵵ �ϴ�.
//		OutputStream out = System.out; // printstream�� outputstream �ڼ��̶� ������ ���ɽ���.�տ� (Outputstream) ����
		OutputStream out = new FileOutputStream("test_io.txt"); // printstream�� outputstream �ڼ��̶� ������ ���ɽ���.�տ� (Outputstream) ����
		// ����� -- �ٷε��°� // ���� ��� c����̺� ���ؼ� ���� ��.
		//FileInputStream�� �θ� InputStream�̱⵵ �ϴ�.
		//Ű�����Է� --> ȭ�� ���.
		System.out.print("������ �Է�>> ");
		//2
		int data = 0;
		while((data = System.in.read())!= -1) {
			//3
			out.write(data);  //print�� print��Ʈ�����־
		}
			out.close(); // ���� ������� ������ ������ �ݾ��ּ���.
	}
}


