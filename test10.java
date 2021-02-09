package test02;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入里程：");
		int a1 = scn.nextInt();
		System.out.println("請輸入數字選擇車種（1-自強、2-莒光、3-復興/區間）：");
		int car1 = scn.nextInt();
		System.out.println("請輸入數字選擇去回（1-單程、2-去回）：");
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
	System.out.println("金額為：" + money);
 }
}
