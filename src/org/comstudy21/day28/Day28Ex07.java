package org.comstudy21.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Day28Ex07 {
	
	public static void main(String[] args) throws IOException {
		
		//inputstream, buffered�� �ص��� 
		//���Ͼȿ� �ִ� ���� �����ϱ�
		InputStream in = new FileInputStream("test_io.txt");
		//
		FileOutputStream out = new FileOutputStream("data.txt");
		int data = 0;
		while((data = in.read()) != -1) {
			out.write(data);
		}
		
		System.out.println("���� ���� �Ϸ�!");
		in.close();
		out.close();
		
		
//		//1.���� ���
//		String fileName = "test2.txt";
//		File test2File = new File(fileName);
//		
//		test2File.createNewFile();
//		//�����ϰ� ���� test ���� ����
				
	}
}
