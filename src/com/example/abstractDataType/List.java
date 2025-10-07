package com.example.abstractDataType;

public interface List<T> {
	
	public int size();
	public T get(int index);
	public int indexOf(T value);
	public boolean isEmpty();
	public boolean contains(T value);
	public void add(T value);
	public void add(int index, T value);
	public void addAll(List<T> other);
	public void remove(int index);
	public void set(int index, T value);
	public void clear();
}
