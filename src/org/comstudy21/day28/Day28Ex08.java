package org.comstudy21.day28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day28Ex08 {
	
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner scan = new Scanner(new File("data.txt")).useDelimiter("\n"); //useDelimiter�� ������ ���ڴ�. �Ⱦ��� ����Ʈ���� �����̽����̴�.
		Scanner scan = new Scanner(new File("data.txt")).useDelimiter("��"); //useDelimiter�� ������ ���ڴ�. �Ⱦ��� ����Ʈ���� �����̽����̴�.
		
		//������
		while(scan.hasNext()) {
			System.out.print(scan.next());
		}
		
	}
}
