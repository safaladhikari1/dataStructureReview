package main.java.com.example.structure;

import main.java.com.example.abstractDataType.List;

// TODO
// Add unit tests
// Review Iterators

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

		if (capacity < 0) {
			throw new IllegalArgumentException("capacity: " + capacity);
		}

		typeData = (T[]) new Object[capacity];
		size = 0;
	}

	public void add(T value) {
		ensureCapacity(size + 1);
		typeData[size] = value;
		size++;
	}

	public void add(int index, T value) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}

		ensureCapacity(size + 1);

		for (int i = size; i >= index + 1; i--) {
			typeData[i] = typeData[i - 1];
		}

		typeData[index] = value;
		size++;
	}

	@SuppressWarnings("unchecked")
	public void ensureCapacity(int capacity) {
		if (capacity > typeData.length) {
			int newCapacity = typeData.length * 2 + 1;

			if (capacity > newCapacity) {
				newCapacity = capacity;
			}

			T[] newTypeData = (T[]) new Object[newCapacity];

			for (int i = 0; i < size; i++) {
				newTypeData[i] = typeData[i];
			}

			typeData = newTypeData;
		}
	}
	
	public void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(index + " is out of bound.");
		}
	}

	public T get(int index) {
		checkIndex(index);
		return typeData[index];
	}

	public int size() {
		return size;
	}
	
	public int indexOf(T value) {
		for(int i=0; i < size; i++) {
			if(typeData[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean contains(T value) {
		return indexOf(value) >= 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void clear() {
		for(int i=0; i<size; i++) {
			typeData[i] = null;
		}
		
		size = 0;
	}
	
	public void remove(int index) {
		checkIndex(index);
		
		for(int i=index; i<size - 1; i++) {
			typeData[i] = typeData[i + 1];
		}
		
		typeData[size - 1] = null;
		size--;
	}
	
	public void set(int index, T value) {
		checkIndex(index);
		typeData[index] = value;
	}
	
	public void addAll(List<T> other) {
		for(T data : other) {
			add(data);
		}
	}
	
	@Override
	public String toString() {
		if(size == 0) {
			return "[]";
		} else {
			String result = "[";
			result += typeData[0];
			for(int i=1; i < size; i++) {
				result += ", " + typeData[i];
			}
			
			result += "]";
			
			return result;
		}
	}
	
	

}
