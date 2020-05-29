package org.comstudy21.day28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day28Ex05 {
	// 이클립스외에 있는 파일 내용읽어오기 fileInputStream에 "이클립스내에 있는 파일로 가능."
	public static void main(String[] args) throws IOException {
		//파일의 내용을 읽어와서 화면에 출력한다.
		//1
		FileInputStream input = new FileInputStream("C:\\Users\\Kosmo_09\\Documents\\news.txt"); //절대경로 들어가는 법.
		//2 out은 만들 필요가 없당.
		//3 읽어오는 파트
		int data = 0;
		while((data = input.read()) != -1) {
			System.out.write(data);
		}
		// 파일 입출력 마무리
		input.close();
	}
}
