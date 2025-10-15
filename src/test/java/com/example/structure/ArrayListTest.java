package test.java.com.example.structure;

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
	
	

}
