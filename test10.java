package test02;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���{�G");
		int a1 = scn.nextInt();
		System.out.println("�п�J�Ʀr��ܨ��ء]1-�۱j�B2-�����B3-�_��/�϶��^�G");
		int car1 = scn.nextInt();
		System.out.println("�п�J�Ʀr��ܥh�^�]1-��{�B2-�h�^�^�G");
		int goback1 = scn.nextInt();
		double money = 0;
	if (goback1 == 1) {
			if(car1 == 1) {
				money = a1 * 2.27;
			}else {
			if (car1 == 2) {
				money = a1 *1.75;
			}else {
				if(car1 == 3) {
				money = a1 *1.46;
				}
			}
		}
	}else {
		if(car1 == 1) {
			money = (a1 *2)* 2.27 *0.9;
		}else {
		if (car1 == 2) {
			money = (a1 *2) *1.75 *0.9;
		}else {
			if(car1 == 3) {
			money = (a1 *2) *1.46 *0.9;
			}
		}
	}
  }
	System.out.println("���B���G" + money);
 }
}
