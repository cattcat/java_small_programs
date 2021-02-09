package test02;

public class test17 {

	public static void main(String[] args) {
		int[] score = new int [] {25,60,70,90,45,65,59};
		int pass = 0;
		for(int s:score) {
			if(s>=60) {
				pass++;
			}
		}
		System.out.print("A" + pass);
		System.out.print("B" + pass);
		System.out.print("C" + pass);
		System.out.print("D" + pass);
		System.out.print("E" + pass);
		
	}

}
