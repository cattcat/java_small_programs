package test02;

public class test23 {
	public static void main(String[] args) { 
		int a = 26;
		int b = 37;
		int m1[][]= {{26,37}};
		double[][] m2 = {{2.1,5.3,7.2,4.8,6.9}}; 
		System.out.println(max1(m1));
		System.out.println(max2(m2)); 
		} 
		public static int max1(int[][] m){ 
			int max = -1; 
			for(int i=0; i<m.length; i++){ 
				for(int j=0; j<m[i].length; j++){ 
					if(m[i][j] > max){ 
					max = m[i][j]; 
					} 
				} 
		} 
			return max; 
		} 
		public static double max2(double[][] m){ 
			double max = -1; 
			for(int i=0; i<m.length; i++){ 
				for(int j=0; j<m[i].length; j++){ 
					if(m[i][j] > max){ 
					max = m[i][j]; 
					} 
				} 
		} 
		return max; 
		} 
} 
