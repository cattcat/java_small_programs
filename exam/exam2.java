package ex01;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		System.out.println("�п�J���Z�G");
		Scanner snc = new Scanner(System.in);
		int op = snc.nextInt();
		if ( op >= 101 && op < 0) {
			System.out.println("�ƭȿ��~");	
		}
		else if (op <= 59 && op>=0) {
			System.out.println("���Ŭ��GE");
		}
		else if (op <=69) {
			System.out.println("���Ŭ��GD");
		}
		else if (op <=79) {
			System.out.println("���Ŭ��GC");
		}
		else if (op <=89) {
			System.out.println("���Ŭ��GB");
		}
		else if (op <=100) {
			System.out.println("���Ŭ��GA");
		}
		snc.close();
	}
}
