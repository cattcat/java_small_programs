package test02;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String msg = "�y��\t�p��\t�{�]\t�`��\n" ;
		int score = 0 ;
		int sum = 0 ;
		int no = 0 ;
		int sub = 0 ;
		
		while (no!=-1) {
			System.out.print("�п�J�ǥͮy��(��J-1�������Z��J): ");
			no = scn.nextInt();
			if(no!=-1) {
				msg += no +"��\t";
				sum = 0;
			    sub = 0;
			while(++sub<=2) {
				System.out.print("�п�J"+no+"��"+(sub==1 ?"�p��":"�{�]")+"����");
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
