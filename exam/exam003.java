package ex01;

import java.util.Scanner;

public class exam003 {
    public static final String abc = "abcdefghijklmnopqrstuvwxyz";
    
    public static String encryption(String pText, int sKey)
    {
    	pText = pText.toLowerCase();
        String cText = "";
        for (int i = 0; i < pText.length(); i++)
        {
            int a = abc.indexOf(pText.charAt(i));
            int b = (sKey + a) % 26;
            char c = abc.charAt(b);
            cText += c;
        }
        return cText;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入想加密的字串: ");
        String message1 = new String();
        message1 = scn.next();
        System.out.println("加密結果為:"+encryption(message1, 3));
        scn.close();
    }
}