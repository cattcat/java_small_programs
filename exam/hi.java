package ex01;

import java.util.Scanner;

public class hi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入姓名:");
		String strName = scn.next();
		System.out.println("hi!"+ strName + "歡迎來到java世界!");
		scn.close();
	}

}
