package test02;
import java.util.Scanner;
public class test07 {

	public static void main(String[] args) {
		final String id_rs = "user";
		final String pw_rs = "AbC123456789";
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�JID�G");
		String id_s = scn.next();
		System.out.println("�п�J�K�X�G");
		String pw_s = scn .next();
		if(id_s.equalsIgnoreCase(id_rs) && pw_s.equals(pw_rs)) {
		System.out.println("�n�J���\�A�w��^�ӡI");
		}else{
		System.out.println("�b�� or �K�X���~�I�Ъ`�N�j�p�g");
		}
		scn.close();
		}
}


