package ex01;

public class exam002 {

	public static void main(String[] args) {
		int[] num = new int[]{23,31,89,78,13,2,54};
		int[] a = bubblesort(num);
		for(int t:a){
			System.out.print(t+",");
		}
	}
    static int[] bubblesort(int[] input){	
		int length = input.length;
	    int temp;
	    for(int i=0;i<length;i++){   	
	    	for(int j=0;j<length-1;j++){	   
	    	   if(input[j]>input[j+1]){ 		   
	    		  temp = input[j];
	    		  input[j] = input[j+1];
	    		  input[j+1] = temp;		
	    	   }
	    	} 	
	    }
		return input;
     }
}

