package ImplementLinkedList;

import java.util.HashMap;

public class TestCountWords {

	public static void main(String[] args) {
		String str="hello hello hello";
		char[] words = new char[str.length()];
		int space=0,m=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '||(str.charAt(i)==','&&str.charAt(i+1)==' ')||str.charAt(i)=='.')
				space++;
			words[i] = str.charAt(i);
//			System.out.print(str.charAt(i));
		}
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]);
		}
		 char[][] p = new char[50][100];
		 char[][] ptr = new char[50][100];
		 for (int i = 0, j = 0, k = 0;j < words.length;j++)
		    {
		       
				if ((words[j] == ' ')||(words[j] == 44)||(words[j] == 46))  
		        {    
		            p[i][k] = '\0';
		            i++;
		            k = 0;
		        }        
		        else
		             p[i][k++] = words[j];
		    }
		 int k=0,count=0;
		 for(int i = 0;i<space;i++) {
			 for(int j =0;j<space;j++)
				 if(i==j) {
					 ptr[k]=String.copyValueOf(p[i]).toCharArray();
					 System.out.println(ptr[k]);
					 k++;
					 count++;
					 System.out.println("count is: "+count);
					 break;
					 
				 }else {
					 String str1 = new String(ptr[j]);
					 String str2 = new String(p[i]);
					 if(str1.compareToIgnoreCase(str2)!=0) 
						 continue;
					 else
						 break;
						 
				 }
			 
		 }
		 int c=0;
		 System.out.println("space " + space);
		 for(int i = 0;i<count;i++) {
			 String s1 = new String(ptr[i]);
			 String s2 = null;
			 for (int j = 0;j <= space;j++)
		        {
				 	s2 = new String(p[j]);
				 	if(s1.compareToIgnoreCase(s2)==0)
					 c++;
		        }
			 System.out.println(c+" times -> "+s1.toString());
		        c = 0;		 
		 }
//	     HashMap<String, Integer> res = new HashMap<String, Integer>();
//	     str = str.replace(",", "");
//	     String el [] = str.trim().split("\\s+");
//	     for (String s : el) {
//	    	 if(s.length()>=3) {
////	    		 s = s.replace(',', ' ');
//	    		 int count = 0;
//	    		 if (res.containsKey(s)) {
//	             count = res.get(s);
//	         	}
//	         res.put(s, count + 1);
//	    	 }
//	     }
//	     for (String keys : res.keySet()) {
//	         System.out.printf("%s : %d%n", keys, res.get(keys));
//	     }

	}

}
