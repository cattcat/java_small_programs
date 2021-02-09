package test02;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String msg = "座號\t計概\t程設\t總分\n" ;
		int score = 0 ;
		int sum = 0 ;
		int no = 0 ;
		int sub = 0 ;
		
		while (no!=-1) {
			System.out.print("請輸入學生座號(輸入-1結束成績輸入): ");
			no = scn.nextInt();
			if(no!=-1) {
				msg += no +"號\t";
				sum = 0;
			    sub = 0;
			while(++sub<=2) {
				System.out.print("請輸入"+no+"號"+(sub==1 ?"計概":"程設")+"分數");
				score = scn.nextInt();
				msg += score + "\t";
				sum += score;
			    }
			}
			msg += sum +"\n";
		}
		System.out.println(msg);
		scn.close();
	}

}
