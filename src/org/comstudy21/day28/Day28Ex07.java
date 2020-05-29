package org.comstudy21.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Day28Ex07 {
	
	public static void main(String[] args) throws IOException {
		
		//inputstream, buffered로 해도됨 
		//파일안에 있는 내용 복사하기
		InputStream in = new FileInputStream("test_io.txt");
		//
		FileOutputStream out = new FileOutputStream("data.txt");
		int data = 0;
		while((data = in.read()) != -1) {
			out.write(data);
		}
		
		System.out.println("파일 복제 완료!");
		in.close();
		out.close();
		
		
//		//1.파일 경로
//		String fileName = "test2.txt";
//		File test2File = new File(fileName);
//		
//		test2File.createNewFile();
//		//생성하고 이제 test 내용 복사
				
	}
}
