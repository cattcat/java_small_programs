package test02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		    int n = 1;
		    int t = 1;
		    int n_t=1;
		    int fn =1;
		    int ft =1;
		    int fn_t =1;	   
		    do {
		    	System.out.print("請輸入1~15之間的整數n: ");
		    	n = scn.nextInt();
		    }while(n <0 && n >15);
		    do {
		    	System.out.print("請輸入1~15之間的整數t: ");
		    	t = scn.nextInt();
		    }while(n <0 && n >15);
		    n_t = n - t ;
		    scn.close();
		    do {
		    	fn = fn*n;
		    	n--;
		    }while(n>0);
		    do {
		    	ft=ft*t;
		    	t--;
		    }while(t>0);
		    do {
		    	fn_t = fn_t*n_t;
		    	n_t--;
		    }while(n_t>0);
		    do 
		    
		 
		    System.out.print("組合數為 :"+n+t)
		      }
}

