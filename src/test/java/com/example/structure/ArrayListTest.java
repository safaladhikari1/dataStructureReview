package test.java.com.example.structure;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.com.example.structure.ArrayList;

public class ArrayListTest {
	
	private ArrayList<String> list;
	
	private ArrayList<String> createList() {
		return new ArrayList<>();
	}
	
	@Before
	public void setup() {
		list = createList();
	}
	
	@Test
	public void testAdd() {
		String[] testList = {"a", "b", "c"};
		
		for(int i=0; i < testList.length; i++) {
			list.add(testList[i]);
		}
		
		for(int i=0; i < testList.length; i++) {
			Assert.assertEquals("Items added to the list is discoverable with contains()", true, list.contains(testList[i]));
		}
	}
	
	@Test
	public void sizeTest() {
		String[] elementsToAdd = {"a", "b", "c"};
		
		for(int i=0; i < elementsToAdd.length; i++) {
			list.add(elementsToAdd[i]);
		}
		
		Assert.assertEquals("List should have size 3 after three calls to add()", 3, list.size());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void getNegativeIndexTest() {
		list.get(-1);
	}
	
	@Test
	public void removeTest() {
		String[] elementsToAdd = {"a", "b", "c"};
		
		for(int i=0; i < elementsToAdd.length; i++) {
			list.add(elementsToAdd[i]);
		}
		
		System.out.println(list.toString());
		
		for(int i=0; i < elementsToAdd.length; i++) {
			list.remove(elementsToAdd[i]);
		}
		
		Assert.assertEquals("List size should be 0 after removing all elements", 0, list.size());
		
	}
	
	@Test
	public void getNoSuchElementremoveTest() {
		String[] elementsToAdd = {"a", "b", "c"};
		
		for(int i=0; i < elementsToAdd.length; i++) {
			list.add(elementsToAdd[i]);
		}
		
		String[] elementsToRemove = {"d", "e", "f"};
		for(int i=0; i < elementsToAdd.length; i++) {
			try {
				list.remove(elementsToRemove[i]);
				
				Assert.fail("No exception is thrown when removing an element that doesn't exist: " + elementsToRemove[i]);
			} catch (NoSuchElementException e) {
				
			}
		}
	}
	
}
















