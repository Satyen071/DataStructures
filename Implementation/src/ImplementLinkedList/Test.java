package ImplementLinkedList;

public class Test {

	public static void main(String[] args) {
		int[] arr = {198, 34, 3, 97, 9, 76, 45, 8};
		int[] result  = new int[20];
		int num ;
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			num = arr[i];
			
		while(num>0) {
			 int d = num%10;
			 num = num/10;
			 result[j] = d;
			 j++;
			}
		}
		int first =result[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for(int k=1;k<result.length;k++) {
			if (result[k] > first) 
	            first = result[k]; 
		}
		for(int k=0;k<result.length;k++) {
			if (result[k] <= first&&result[k]>second) 
	            second = result[k]; 
		}
		
		for(int k=0;k<result.length;k++) {
			if (result[k]<second&&result[k]>third) 
	            third = result[k]; 
		}
		System.out.print(first+" "+second+" "+third+"\n");
		int num1  = first*100+second*10+third*1;
		if(num1%2==0)
		System.out.println(num1);

	}

}
