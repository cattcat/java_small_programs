package test02;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		System.out.println("�п�J����G");
		Scanner snc = new Scanner(System.in);
		int month = snc.nextInt();
	     if(month < 0 || month > 12) {
	            System.out.println("��J���~!!�Э��s��J�C");
	            }else {
	     
		String ss = "";
		switch(ss = month>5 && month<10?"Y":"N" ) {
		case "Y":

		System.out.println("�o�ɬq�O�L��");
		break;
		case "N":

		System.out.println("�o�ɬq�O�D�L��");
		break;
		}		
	            }
	}
}

