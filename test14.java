package test02;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		System.out.print("�п�J���: ");
		Scanner snc = new Scanner(System.in);
       int num = snc.nextInt();
       int factor = 0;
       boolean prm_or_not =true ;
       snc.close();
       int test_start = (num-1)/2;
       int count =1;
       for (int i=test_start;i>=2 ; i++) {
    	   if(num%i==0) {
    		   prm_or_not=false;
    		   factor = i;
    		   break;
    	   }
    	   count++;
       }
       if(prm_or_not) {
    	   System.out.print("�O���");
       }else {
    	   System.out.print("���O���,�̤j�]����"+factor);
       }
       System.out.print(count);
	}
}
