package ImplementLinkedList;

public class TestString {

	public static void main(String[] args) {
		String s= "124,567,2345,124,6346,2";
		String[] s1 = s.split("");
		String[] s2 = {} ;
		 String[] temp = {};
		 int[] temp1 = new int[temp.length];
		int k=0,j=0,n=0,n1=0;
		int num = s1.length;
		while(num>0) {
			if(s.charAt(k)==','||s.charAt(k)=='\0') {
				num--;
				k++;
				continue;
			}
			else {
				s2[j]=s1[k];
			j++;
			k++;
			}
			num--;
		}
		int number = 0;
		for(int i =0;i<s2.length-1;i++) 
				if(s2[i]!=s2[i+1]) 
					temp[n++]=s2[i];
		temp[n++] = s2[s2.length-1];   
		for(int i =0;i<s2.length-1;i++) {
			if(Integer.parseInt(s2[i])!=Integer.parseInt(s2[i+1])) 
				temp1[n1++]=Integer.parseInt(s2[i]);
		}
	temp1[n1++] = Integer.parseInt(s2[s2.length-1]); 
		System.out.println(n);
		for(int l=0;l<temp1.length;l++) {
			System.out.print(temp1[l]+" ");
		}
	}

}
