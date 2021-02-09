package test02;
import java.util.Scanner;

public class TEST06 {

	public static void main(String[] args) {
		System.out.println("請輸入消費金額：");
		Scanner snc = new Scanner(System.in);
		double total_cost = snc.nextInt();
		if (total_cost > 1000) {
			total_cost = (total_cost - 1000 )* 0.9 + 1000;
		}
		System.out.println("優惠金額為："+ total_cost);
		snc.close();
	}
}
