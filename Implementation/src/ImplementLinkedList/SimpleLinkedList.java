package ImplementLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Set;
import java.util.stream.LongStream;

public class SimpleLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int a){
			this.data=a;
			this.next=null;
		}
		
	}
	
	public  SimpleLinkedList insert(SimpleLinkedList list,int data) {
		Node newNode = new Node(data);
		newNode.next=null;
		
		if(list.head==null)
			list.head= newNode;
		else {
			Node currentNode= list.head;
			while(currentNode.next!=null) {
				currentNode= currentNode.next;
				
			}
			currentNode.next = newNode;
			
		}
		
		return list;
	}
	
	public static void printList(SimpleLinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
	
	public static void main(String[] args) {
		
		SimpleLinkedList list = new SimpleLinkedList();
		list = list.insert(list, 1);
		list = list.insert(list, 2);
		list = list.insert(list, 3);
		list = list.insert(list, 4);
		list = list.insert(list, 5);
		list = list.insert(list, 6);
		printList(list);
				
		String s1 = "1 2 3 -4 5";
		int a = -4;
		Set<String> set = new HashSet<String>();
		char[] dis = s1.trim().toCharArray();
		int[] num = new int[10];
		long h=12;
		num[0]=(int)h;
		
		for(int i=0;i<s1.length();i++) {
			set.add(Character.toString(s1.charAt(i)));
		}
		System.out.println(set);
		String[] s2 = s1.split(" ");
		LongSummaryStatistics longSummaryStatistics 
        = new LongSummaryStatistics();
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<s2.length;i++) {
			longSummaryStatistics.accept(Integer.parseInt(s2[i]));
		}
		System.out.println(String.valueOf(longSummaryStatistics.getMax()) + " "+ String.valueOf(longSummaryStatistics.getMin()));
		String result="";
		for(String s:set) {
			result= result.concat(s);
		}

		System.out.println(result);
		
		
		List<Integer> list2 = new ArrayList<Integer>();
	    long num1 = 547325;
	    while(num1>0){
	      int digit = (int)num1%10;
	      num1=num1/10;
	      list2.add(digit);
	      
	    }
	    
	    int[] reverse = new int[list2.size()];
	 
	    int i=0;
	    for(Integer l:list2) {
	    	reverse[i] = l;
	    	i++;
	    }
	    System.out.println("vajajfvsk");
	    System.out.println(Integer.parseInt("11111111",2)); 
	    System.out.println(String.valueOf(1));
	    String str = ":~)";
	    boolean b = str.contains(":");
	    Arrays.asList(reverse);
		
	}

	private static String String(char c) {
		// TODO Auto-generated method stub
		String s = Character.toString(c);
		return null;
	}

}
