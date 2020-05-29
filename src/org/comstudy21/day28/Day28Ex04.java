package org.comstudy21.day28;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Day28Ex04 {
	
	public static void test(String[] args) throws IOException {
		//업캐스팅 1
		InputStream in = System.in;  // 보통 in으로 쓰는데 그냥 바꿔보는거임
		//FileOutputStream의 부모가 OutputStream이기도 하다.
		OutputStream out = System.out; // printstream은 outputstream 자손이라서 저절로 업케스팅.앞에 (Outputstream) 생략
		
		//FileInputStream의 부모가 InputStream이기도 하다.
		//키보드입력 --> 화면 출력.
		System.out.print("데이터 입력>> ");
		//2
		int data = 0;
		while((data = System.in.read())!= -1) {
			//3
			out.write(data);  //print는 print스트림에있어서
		}
	
	}
	// 데이터를 입력해서 택스트 파일에 넣는 법.
	public static void main(String[] args) throws IOException {
		// 여기서 데이터입력을 하면 파일에 데이터가 들어갑니다.
		// 저장 및 불러오기 기능을 추가할 수 있습니다.
		//업캐스팅 1
		InputStream in = System.in;  // 보통 in으로 쓰는데 그냥 바꿔보는거임
		//FileOutputStream의 부모가 OutputStream이기도 하다.
//		OutputStream out = System.out; // printstream은 outputstream 자손이라서 저절로 업케스팅.앞에 (Outputstream) 생략
		OutputStream out = new FileOutputStream("test_io.txt"); // printstream은 outputstream 자손이라서 저절로 업케스팅.앞에 (Outputstream) 생략
		// 상대경로 -- 바로들어가는것 // 절대 경로 c드라이브 통해서 들어가는 것.
		//FileInputStream의 부모가 InputStream이기도 하다.
		//키보드입력 --> 화면 출력.
		System.out.print("데이터 입력>> ");
		//2
		int data = 0;
		while((data = System.in.read())!= -1) {
			//3
			out.write(data);  //print는 print스트림에있어서
		}
			out.close(); // 파일 입출력이 끝나면 파일을 닫아주세요.
	}
}


