package test02;
import java.util.Scanner;
public class test07 {

	public static void main(String[] args) {
		final String id_rs = "user";
		final String pw_rs = "AbC123456789";
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入ID：");
		String id_s = scn.next();
		System.out.println("請輸入密碼：");
		String pw_s = scn .next();
		if(id_s.equalsIgnoreCase(id_rs) && pw_s.equals(pw_rs)) {
		System.out.println("登入成功，歡迎回來！");
		}else{
		System.out.println("帳號 or 密碼錯誤！請注意大小寫");
		}
		scn.close();
		}
}


