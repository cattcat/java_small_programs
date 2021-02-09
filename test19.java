package test02;

public class test19 {

	public static void main(String[] args) {
		int[] a = {32,24,89,11,48,15};
        int i , j , l ,m ;
        System.out.print("original : ");
        for( i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for( i = 0 ; i <a.length ; i++){
            for( j = 0 ; j < a.length-1 ; j++) 
                if(a[j] > a[j+1]){
                m = a[j+1];
                a[j+1] = a[j];
                a[j] = m ;
                }
            System.out.print(" Th" + ( i + 1 ) + "-time : ");
            for(l = 0 ; l < a.length ; l++){
                System.out.print(a[l] + " ");
            }
            System.out.println();
        }
	}
}

