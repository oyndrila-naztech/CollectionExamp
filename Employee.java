package Stdcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Employee {

	
	
	public static void main(String[] args) {
		
		int id;
		String name;
		String salary,dept;
		String[] data1  = {"1","oyndrila","10000","cse"};
		String[] data2  = {"2","mondira","1000","cse"};
		String[] data3  = {"1","oyndrila","10000","cse"};
		ArrayList list = new ArrayList();
		
		
//		for(int i = 0 ;i<data1.length;i++)
//		{
//			
//			list.add(data1[i]);
//			
//		}
//		list.addAll(data1,data2);
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
//		ArrayList list2 = new ArrayList();
//		for(int i = 0 ;i<data1.length;i++)
//		{
//			
//			list2.add(data2[i]);
//			
//		}
//		System.out.println(list.size());
//		System.out.println(list2.size());
//		
//		System.out.println(list2);
//		//ArrayList list3 = new ArrayList();
//		
//		list2.addAll(list);
//		System.out.println(list2);
//		LinkedList<String>li = new LinkedList<>();
//		li.add("1");
//		li.add("2");
//		li.add("3");
//		li.add("4");
//		System.out.println(li.subList(1, 3));
//		li.subList(1, 3).clear();
//		System.out.println(li);
//		li.addAll(li);
//		System.out.println(li);
//		
//		String[] bkash = {"1","2","3","4"};
//		String[] paypal = {"5","6","7","8"};
//		LinkedList<String>li2 = new LinkedList<>();
//		for(int i=0 ;i<bkash.length;i++ ) 
//		{
//		li2.add(bkash[i]);
//		}
//		System.out.println(li2);
//		LinkedList<String>li3 = new LinkedList<>();
//		for(int i=0 ;i<paypal.length;i++ ) 
//		{
//		li3.add(paypal[i]);
//		}
//		System.out.println(li3);
//		li2.addAll(li3);
//		System.out.println(li2);
//		LinkedList<String>li4 = new LinkedList<>();
//		li4.addAll(li2.subList(4, 8));
//		System.out.println(li4);
//		//linked list to array
//		String[] a =li4.toArray(new String[li4.size()]);
//		System.out.println(a[0]);
		
		Stack<String>stc = new Stack<>(); 
		stc.push("1");
		stc.push("2");
		stc.push("3");
		System.out.println(stc);
		stc.pop();
		System.out.println(stc);
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q);
		q.peek();
		System.out.println(q);
		Set<Integer> st = new HashSet<Integer>();
		st.add(2);
		st.add(2);
		System.out.println(st);
	}
//	public void removeinformation(int from,int to,LinkedList<String>li) {
//		//li.subList(from, to);
//	}
	
	
}
