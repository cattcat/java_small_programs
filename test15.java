package test02;

public class test15 {

	public static void main(String[] args) {
		int level_num = 6;
		black_1: for (int i =0 ; i<level_num; i++) {
			for (int j = 0; j<level_num; j++) {
				if(j>i) {
					System.out.println("");
					continue black_1;
				}
				System.out.println("*");
			}
		}

	}

}
