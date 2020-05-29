package org.comstudy21.day28;

import java.io.IOException;
import java.util.Scanner;

public class Day28Ex01 {

	//1
	static String gets() {
		//2
		String s = null; // ���ڿ��� �ΰ�
		//3
		byte[] by = new byte[255];
		
		try {
			System.in.read(by);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 255���ڸ� ���� �� �ִ� �迭 �ֱ�
		
		s = new String(by).trim();
		return s;
	}
	
	
	public static void main(String[] args) {
		String name = null;
		String address = null;
		String phone =null;
		
		System.out.print("�̸��Է�>>");
		name = gets();
		System.out.print("�ּ��Է�>>");
		address = gets();
		System.out.print("��ȭ��ȣ�Է�>>");
		phone = gets();
		System.out.printf("%s, %s, %s\n", name, address, phone);
	}
	static Scanner scan = new Scanner(System.in);
	
	public static void test3(String[] args) {
		String name = null;
		String address = null;
		String phone =null;
		
		System.out.print("�̸��Է�>>");
		name = scan.next();
		System.out.print("�ּ��Է�>>");
		if(scan.hasNextLine()) {		
			scan.nextLine();//���۸� ������Ѵ�. �ϴ� �ڵ���.
		}
		address = scan.nextLine();
		System.out.print("��ȭ��ȣ�Է�>>");
		phone = scan.next();
		System.out.printf("%s, %s, %s\n", name, address, phone);
	}
	
	public static void test1(String[] args) throws IOException {
		// �迭�� �Է��ϱ�
		//byte stream
		//1
		byte[] by = new byte[255]; // 255���ڸ� ���� �ְ� ������̴�.
		//2
		System.out.print("Ű���� �Է�>> ");
		//3
		System.in.read(by);
		//4
//		System.out.write(by,0,10); // byte�� write�� ���(by, 0���ں���, 10���ڱ��� �ۼ�����)
		//�Էµ� ���� ���ڿ��� �ٲ� �� �ִ�.
		//4-1 
		String str = new String(by).trim(); //���ڿ� ����  trim()�� �߰��ϸ� 255���ڶ�� �ȳ����� �ۼ��� ���� ����ŭ ���´�. trim ���� �� ���� �߶�
		System.out.println(str.length());
		System.out.println(str);
	}
	
	
	public static void test(String[] args) throws IOException {
		//�ѱ�¥�� �а� �ѱ�¥�� ��µǴ�
		//1
		int ch = 0;
		
		System.out.print("Ű�����Է�>> ");
		//2 (2�� �ۼ��ϰ� throws ioException) 
		while((ch=System.in.read()) != -1) { //ctrl + z
							//3
			System.out.print((char)ch); 
		}
		
	}
}
