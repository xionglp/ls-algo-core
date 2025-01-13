package com.ls;

public class Main {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList(); 
//		list.add(11);
//		list.add(22);
//		list.add(33);
//		list.add(44);
//		list.add(55);
//		
//		for (int i = 0; i < 30; i++) {
//			list.add(i);
//		}
//		
//		System.out.println(list);
		
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(20);
		ints.add(30);
		ints.add(40);
		ints.add(50);
		System.out.println(ints);
		
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(new Person(10, "jack"));
		list.add(new Person(20, "rose"));
		list.add(null);
		list.add(new Person(30, "james"));
		System.out.println(list);
		
//		list.clear();
//		
//		//提醒JVM进行垃圾回收
//		System.gc();
		
		
	}

}
