package org.comstudy21.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day28Ex02 {
	
	
	public static void main(String[] args) throws IOException {
		//Input through the bufferedReader
		//������ ���۵帮���� �����ش�. �� ���ϰ� ������ش�. ���� ��Ʈ���� �׳� �ȴ�.
		//2
		InputStreamReader isr = new InputStreamReader(System.in);
		//1
		BufferedReader in = new BufferedReader(isr); //file�� fileReader keyborard inputstreamReader
		//3
		System.out.print("�����Է�>> ");
		//4 �׸��� ���̿� �ͼ���
		String name = in.readLine();
		System.out.print("�ּ��Է�>> ");
		String address = in.readLine();
		System.out.print("�����Է�>> ");
		Integer age = Integer.parseInt(in.readLine());// ���ڿ� ���·� �Է��� �޾�?
		
		System.out.printf("%s, %s\n",name, address);
		System.out.println("10�� �� ����: " + (age + 10));
	}	
	
}
