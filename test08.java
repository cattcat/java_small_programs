package test02;
import java.text.NumberFormat;
import java.util.Scanner;
public class test08 {

	public static void main(String[] args) {
		System.out.println("�п�J�Τ��׼ơG");
		Scanner snc = new Scanner(System.in);
		double money = snc.nextInt();
		double price = 0.0;
		if (money >= 51) {
			price = 12.075;}
			else if 
				    (money >=1 && money<=10)
					{price = 7.35 ;
					}else if ( money<=30)
					{price = 9.45;
					}else if ( money<=50)
					{price = 11.55;}
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits( 0 ); 
			System.out.printf("�ثe�C��:"+ price + "��");
			money = money * price;
			System.out.printf("�ݥI���O:"+  nf.format(money) );
			snc.close();
		}
	}