package test02;

import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		  int[] aNum = { 2, 190, 28, 31, 67, 1, 64, 151, 22 };
			System.out.print(" before¡G");
			for (int i = 0; i < aNum.length; i++)
				System.out.print("  " + aNum[i]);
			System.out.println();
			int n = aNum.length;
			int t;
			for (int i = n - 2; i >= 0; i--) { 
				for (int j = 0; j <= i; j++) {
					if (aNum[j] > aNum[j + 1]) {
						t = aNum[j];
						aNum[j] = aNum[j + 1];
						aNum[j + 1] = t;
					}
				}
			}
			System.out.print(" after¡G");
			for (int i = 0; i < aNum.length; i++)
				System.out.print("  " + aNum[i]);
			System.out.println();
			Scanner scn = new Scanner(System.in);
			System.out.print(" Please enter a number¡G ");
			int sNum = scn.nextInt();
			int num = -1, low = 0, high = aNum.length - 1, midNum = 0;
			do {
				midNum = (low + high) / 2;
				if (aNum[midNum] == sNum) {
					num = midNum;
					break;
				}
				if (aNum[midNum] > sNum)
					high = midNum - 1;
				else
					low = midNum + 1;
			} while (low <= high);
			if (num == -1)
				System.out.println("Sorry, we cannot find the value ");
			else
				System.out.println(" The value has been found, and it's index is " + (num + 1));
	        }
	}


