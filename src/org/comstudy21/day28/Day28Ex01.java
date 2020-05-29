package org.comstudy21.day28;

import java.io.IOException;
import java.util.Scanner;

public class Day28Ex01 {

	//1
	static String gets() {
		//2
		String s = null; // 문자열은 널값
		//3
		byte[] by = new byte[255];
		
		try {
			System.in.read(by);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 255글자를 넣을 수 있는 배열 넣기
		
		s = new String(by).trim();
		return s;
	}
	
	
	public static void main(String[] args) {
		String name = null;
		String address = null;
		String phone =null;
		
		System.out.print("이름입력>>");
		name = gets();
		System.out.print("주소입력>>");
		address = gets();
		System.out.print("전화번호입력>>");
		phone = gets();
		System.out.printf("%s, %s, %s\n", name, address, phone);
	}
	static Scanner scan = new Scanner(System.in);
	
	public static void test3(String[] args) {
		String name = null;
		String address = null;
		String phone =null;
		
		System.out.print("이름입력>>");
		name = scan.next();
		System.out.print("주소입력>>");
		if(scan.hasNextLine()) {		
			scan.nextLine();//버퍼를 비워야한다. 하는 코드임.
		}
		address = scan.nextLine();
		System.out.print("전화번호입력>>");
		phone = scan.next();
		System.out.printf("%s, %s, %s\n", name, address, phone);
	}
	
	public static void test1(String[] args) throws IOException {
		// 배열로 입력하기
		//byte stream
		//1
		byte[] by = new byte[255]; // 255글자를 쓸수 있게 만든것이다.
		//2
		System.out.print("키보드 입력>> ");
		//3
		System.in.read(by);
		//4
//		System.out.write(by,0,10); // byte를 write로 출력(by, 0글자부터, 10글자까지 작성가능)
		//입력된 것을 문자열로 바꿀 수 있다.
		//4-1 
		String str = new String(by).trim(); //문자열 생성  trim()을 추가하면 255글자라고 안나오고 작성한 글자 수만큼 나온다. trim 나온 것 까지 잘라
		System.out.println(str.length());
		System.out.println(str);
	}
	
	
	public static void test(String[] args) throws IOException {
		//한글짜씩 읽고 한글짜씩 출력되는
		//1
		int ch = 0;
		
		System.out.print("키보드입력>> ");
		//2 (2번 작성하고 throws ioException) 
		while((ch=System.in.read()) != -1) { //ctrl + z
							//3
			System.out.print((char)ch); 
		}
		
	}
}
