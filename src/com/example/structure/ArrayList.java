package com.example.structure;

import com.example.abstractDataType.List;

// Review https://dev.java/learn/

public class ArrayList<T> implements List<T> {
	
	public static final int DEFAULT_CAPACITY = 10;
	
	private T[] typeData;
	private int size;
	
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		
		if(capacity < 0) {
			throw new IllegalArgumentException("capacity: " + capacity);
		}
		
		typeData = (T[]) new Object[capacity];
		size = 0;
	}
	
	public void add(T value) {
		typeData[size] = value;
		size++;
	}
	
	public int size() {
		return size;
	}

}
