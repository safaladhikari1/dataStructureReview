package main.java.com.example;

import java.util.Iterator;

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
		
		System.out.println("Is Empty: ");
		System.out.println(testList.isEmpty());
		
		System.out.println("Testing addAll(): ");
		ArrayList<String> testList2 = new ArrayList<>();
		testList2.addAll(testList);
		System.out.println(testList2.toString());
		
		System.out.println("Testing Iterator: ");
		Iterator<String> testList2Iterator = testList2.iterator();
		
		while(testList2Iterator.hasNext()) {
			System.out.println(testList2Iterator.next());
		}
		

	}

}
