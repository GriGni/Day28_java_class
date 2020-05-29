package org.comstudy21.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day28Ex02 {
	
	
	public static void main(String[] args) throws IOException {
		//Input through the bufferedReader
		//리더를 버퍼드리더로 덮어준다. 더 편리하게 만들어준다. 문자 스트림이 그냥 된다.
		//2
		InputStreamReader isr = new InputStreamReader(System.in);
		//1
		BufferedReader in = new BufferedReader(isr); //file은 fileReader keyborard inputstreamReader
		//3
		System.out.print("성명입력>> ");
		//4 그리고 아이오 익셉션
		String name = in.readLine();
		System.out.print("주소입력>> ");
		String address = in.readLine();
		System.out.print("나이입력>> ");
		Integer age = Integer.parseInt(in.readLine());// 문자열 형태로 입력을 받아?
		
		System.out.printf("%s, %s\n",name, address);
		System.out.println("10년 후 나이: " + (age + 10));
	}	
	
}
