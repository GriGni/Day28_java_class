package org.comstudy21.day28;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class People implements Serializable{
	private static final long serialVersionUID=1L; // 객체 직렬화
	private String name;
	private String phone;

	public People(){};

	People(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", phone=" + phone + "]";
	}
}

public class Day28Ex090 {

	static ArrayList<People> list = new ArrayList<People>();
	static {			
		list.add(new People("kim", "010-1111-1111"));
		list.add(new People("lee", "010-2222-2222"));
		list.add(new People("park", "010-3333-3333"));
		list.add(new People("kang", "010-4444-4444"));
	}
	static File file = new File("people_list.data");
	
	//저장하는 곳 //파일로
	private void storeData() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		try {
			oos.writeObject(list);
		} finally {
			oos.close();
		}
		System.out.println("객체 리스트 쓰기 완료!");
	}
	
	private void readData() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		try {
			ArrayList<People> newlist = (ArrayList<People>) ois.readObject();
			for(People p : newlist) {	
				System.out.println("파일에서 객체 불러오기 성공!");
			}			
		} finally {
			ois.close();
		}
		
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//저장하는 쪽
		Day28Ex090 ex = new Day28Ex090();
		ex.storeData();
		ex.readData();

	}

}
