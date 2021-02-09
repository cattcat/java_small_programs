package test02;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		System.out.println("請輸入月份：");
		Scanner snc = new Scanner(System.in);
		int month = snc.nextInt();
	     if(month < 0 || month > 12) {
	            System.out.println("輸入錯誤!!請重新輸入。");
	            }else {
	     
		String ss = "";
		switch(ss = month>5 && month<10?"Y":"N" ) {
		case "Y":

		System.out.println("這時段是夏月");
		break;
		case "N":

		System.out.println("這時段是非夏月");
		break;
		}		
	            }
	}
}

