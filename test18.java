package test02;

public class test18 {

	public static void main(String[] args) {
	int  nums []= new int [] {32,24,11,48,15};
	int  sorted_num []= new int [nums.length];
	int min_v = -1;
	int min_index = 0;
	int count = 0 ;
	
	do {
		if  (nums[count]!=-1) {
			min_v = nums[count];
			break;
		}else {
			count++;
		}
	}while(min_v == -1 & count < nums.length);
	
	for(int i = 0; i<nums.length; i++) {
		if(nums[i]==-1) {
			continue;
		}
		else if (min_v > nums[i]) {
			min_v = nums[i];
			min_index = i ;
		}
	}
	nums[min_index] = -1 ;
	//sorted_num[x] = min_v;
	System.out.println(nums);
	}

}
