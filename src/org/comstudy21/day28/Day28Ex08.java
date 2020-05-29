package org.comstudy21.day28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day28Ex08 {
	
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner scan = new Scanner(new File("data.txt")).useDelimiter("\n"); //useDelimiter를 행으로 끊겠다. 안쓰면 디폴트값은 스페이스바이다.
		Scanner scan = new Scanner(new File("data.txt")).useDelimiter("년"); //useDelimiter를 행으로 끊겠다. 안쓰면 디폴트값은 스페이스바이다.
		
		//구분자
		while(scan.hasNext()) {
			System.out.print(scan.next());
		}
		
	}
}
