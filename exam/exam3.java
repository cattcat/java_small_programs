package ex01;

import java.text.NumberFormat;
import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		System.out.println("�п�J�D�ơG");
		Scanner snc = new Scanner(System.in);
		double sco = snc.nextInt();
		double ab = 0.0;
				if (sco <= 10 && sco>=1) 
					{	sco = sco*6; }
				else if (sco <=20 )
					{sco =  ((sco- 10) *2) +60;
				}else if ( sco >= 21 && sco <= 40)
					{sco =  ((sco- 20) *1) + 80 ;
				}else if ( sco >= 40)
					{sco = 100;}
			System.out.printf("���Z��:"+  sco );
			if (sco <= 59 && sco>=0) {
				System.out.println("���Ŭ��GE");
			}
			else if (sco <=69) {
				System.out.println("���Ŭ��GD");
			}
			else if (sco <=79) {
				System.out.println("���Ŭ��GC");
			}
			else if (sco <=89) {
				System.out.println("���Ŭ��GB");
			}
			else if (sco <=100) {
				System.out.println("���Ŭ��GA");
			}
			snc.close();
	}
}
