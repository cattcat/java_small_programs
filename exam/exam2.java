package ex01;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		System.out.println("叫块Θ罿");
		Scanner snc = new Scanner(System.in);
		int op = snc.nextInt();
		if ( op >= 101 && op < 0) {
			System.out.println("计岿粇");	
		}
		else if (op <= 59 && op>=0) {
			System.out.println("单E");
		}
		else if (op <=69) {
			System.out.println("单D");
		}
		else if (op <=79) {
			System.out.println("单C");
		}
		else if (op <=89) {
			System.out.println("单B");
		}
		else if (op <=100) {
			System.out.println("单A");
		}
		snc.close();
	}
}
