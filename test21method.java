package test02;

import java.util.Scanner;

public class test21method {

	 static int fac(int n){
		if(n == 1){
			return 1;
		}
		else{
			return n*fac(n-1);
		}
	}	 
	 public void method(int n ){

	    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ʀr:"); 
		int num = scn.nextInt();
		//System.out.print("�п�J�Ʀr2:"); 
		//int num2 = scn.nextInt();
		int ans = fac(num);
		//int ans2 = fac(num2);
		//int ans3 = fac(num-num2);
		System.out.println(num+"��������"+ans); 
		//System.out.println("��������"+ans/ans2*ans3); 
	}
}
