package ex01;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		System.out.println("�п�J�@�Ӥ��� 100 - 999 ����� :");
		Scanner abc = new Scanner(System.in);
			int aa = abc.nextInt();
			if (100 < aa && aa > 999) {
				System.out.println("�ƭȿ��~");	
			}
	        int bb = aa%10;
	        int cc = aa/10%10;
	        int dd = aa/100%10;
        System.out.println(aa+"���C��ƩM�G"+ (dd + cc + bb));
        System.out.println(aa+"���C��ƿn�G"+ (dd * cc * bb));
        System.out.println(aa+"���C��Ʈt�G"+ (dd - cc - bb));
		abc.close();
	}

}
