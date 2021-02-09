package ex01;
import java.util.Scanner;
import java.lang.*;
public class exam006
{

   public static void main(String[] args){
     Scanner scn = new Scanner(System.in);      
     System.out.println("½Ð¿é¤J¼Æ¦r");
     int n;
     boolean yesorno=false;  
     while(scn.hasNext()){
         yesorno=false;         
         n=scn.nextInt();  
         for(int i=2;i<n;i++){
           if(n%i==0){
        	   yesorno = true;
              System.out.println("It¡¦s largest factor is X"  );
              break;
            }        
         }
         if(yesorno == false){    
            System.out.println("It¡¦s a prime number");
         }
      }
   }
}