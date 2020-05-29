package org.comstudy21.day28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day28Ex03 {
// 텍스트 파일안에 있는 내용을 읽게 만드는 법.
	public static void main(String[] args) throws IOException {	
		//2
		FileReader fileReader = new FileReader("test_io.txt");
		//1		
		BufferedReader in = new BufferedReader(fileReader);
		
		String str = null;
		while((str = in.readLine()) != null){
			System.out.println(str);
		}
	}
	
}
