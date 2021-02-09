package test02;

public class test25 {
	
	public static void main(String[] args) {
		int [] num = {9,4,1,6,7,3,8,2,5};
		System.out.println("the original array-");
		print_array(num);
		quick_sort(num,0,num.length-1);
		System.out.println("the sorted array-");
		print_array(num);
	}
	static void swap(int[] arr ,int a ,int b){
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
	static int partition(int[] arr , int front , int end ) {
		int pivot = arr[end];
		int i = front -1;
		for(int j =front; j<end; j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		i++;
		swap(arr,i,end);
		return i ;
	}
	static void print_array(int[] arr) {
		for(int i :arr) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	static void quick_sort(int[] arr , int front, int end) {
		if(front < end ) {
			int pivot = partition(arr,front,end);
			quick_sort(arr,front,pivot -1);
			quick_sort(arr, pivot+1,end);
		}else {
			return;
		}
	}
    }
