package ex01;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		System.out.println("叫块ざ 100 - 999 俱计 :");
		Scanner abc = new Scanner(System.in);
			int aa = abc.nextInt();
			if (100 < aa && aa > 999) {
				System.out.println("计岿粇");	
			}
	        int bb = aa%10;
	        int cc = aa/10%10;
	        int dd = aa/100%10;
        System.out.println(aa+"–计㎝"+ (dd + cc + bb));
        System.out.println(aa+"–计縩"+ (dd * cc * bb));
        System.out.println(aa+"–计畉"+ (dd - cc - bb));
		abc.close();
	}

}
