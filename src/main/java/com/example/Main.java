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
		System.out.println("After change: ");
		testList.add(1, "d");
		for (int i = 0; i < testList.size(); i++) {
			System.out.println(testList.get(i));
		}
		// System.out.println(testList.size());

	}

}
