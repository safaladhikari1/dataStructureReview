package main.java.com.example;

import main.java.com.example.structure.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> testList = new ArrayList<>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		System.out.println("Before change: ");
		System.out.println(testList.toString());
		
		System.out.println("After Add: ");
		testList.add(1, "d");
		System.out.println(testList.toString());
		
		System.out.println("After Remove: ");
		testList.remove("a");
		System.out.println(testList.toString());
		System.out.println(testList.isEmpty());
		
		ArrayList<String> testList2 = new ArrayList<>();
		//testList2.addAll(testList);
		//System.out.println(testList2.toString());

	}

}
