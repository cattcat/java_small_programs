package test02;

import java.text.NumberFormat;
import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
		System.out.println("請輸入用水度數：");
		Scanner snc = new Scanner(System.in);
		double fee = snc.nextInt();
		double price = 0.0;
		if (fee <= 1000 && fee>=1) {
			price = fee*1 ;}
					else if 
				    (fee <=2000 )
					{fee =  ((fee- 1000) *0.9) +1000;
					}else if ( fee >= 2001 && fee <= 3000)
					{fee =  ((fee- 2000) *0.9) + 1900 ;
					}else if ( fee >= 3001)
					{fee =  ((fee-3000)*0.7)+ 2700;}
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits( 0 ); 

			System.out.printf("需付費用:"+  nf.format(fee) );
			snc.close();
		}
	}


