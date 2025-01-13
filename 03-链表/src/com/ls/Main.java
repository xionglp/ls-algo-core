package com.ls;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(20);
		list.add(0, 10);
		list.add(30);
		System.out.println(list.size());
		list.add(list.size(), 40);
		
		int aaa = list.remove(1);
		System.out.println(aaa);
		
		// [10, 30, 40]
		System.out.println(list); 
		
	}

}
