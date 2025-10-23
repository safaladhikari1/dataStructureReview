package main.java.com.example;

import main.java.com.example.structure.ArrayList;

public class Main {

	public static void main(String args[]) {
		ArrayList<String> testList = new ArrayList<>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		System.out.println("Before change: ");
		for (int i = 0; i < testList.size(); i++) {
			System.out.println(testList.get(i));
		}
		System.out.println("After Add: ");
		testList.add(1, "d");
		for (int i = 0; i < testList.size(); i++) {
			System.out.println(testList.get(i));
		}
		System.out.println("After Remove: ");
		testList.remove(1);
		for(int i=0; i < testList.size(); i++) {
			System.out.println(testList.get(i));
		}
		System.out.println(testList.isEmpty());
		System.out.println(testList);
		
		ArrayList<String> testList2 = new ArrayList<>();
		//testList2.addAll(testList);

	}

}
