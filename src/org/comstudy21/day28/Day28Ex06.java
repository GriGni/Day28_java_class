package org.comstudy21.day28;

import java.io.File;
import java.io.IOException;

public class Day28Ex06 {

	public static void main(String[] args) throws IOException {
		//파일 경로 1
		String pathName = "data.txt";
//		String pathName = "내문서 경로에 파일을 만들 수 있다.";
		File file = new File(pathName);
		
		//2		
		if(file.exists()) {
			System.out.println("파일이 존재합니다.");
			if(file.delete()) {
				System.out.println("파일 삭제 성공!");
			}
		}else {
			System.out.println("파일이 부재합니다.");
			//파일이 없으면 파일 만들기
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}
		}
		
	}
}
//test io의 내용을 복사해서 test2에 붙여라
//test2를 만들고 안에 내용을 복사해서 test2에 붙이기
//복사한다는 의미는 안에 출력된 내용을 담아서 test2에 넣는 것.ㄴ