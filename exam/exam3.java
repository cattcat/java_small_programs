package ex01;

import java.text.NumberFormat;
import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		System.out.println("叫块肈计");
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
			System.out.printf("Θ罿:"+  sco );
			if (sco <= 59 && sco>=0) {
				System.out.println("单E");
			}
			else if (sco <=69) {
				System.out.println("单D");
			}
			else if (sco <=79) {
				System.out.println("单C");
			}
			else if (sco <=89) {
				System.out.println("单B");
			}
			else if (sco <=100) {
				System.out.println("单A");
			}
			snc.close();
	}
}
