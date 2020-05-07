package namoosori.elephant.datastructure.list.array;

import namoosori.elephant.datastructure.iterator.MyStringIterator;
import namoosori.elephant.datastructure.iterator.logic.MyStringIteratorLogic;
import namoosori.elephant.datastructure.list.facade.MyStringList;

public class MyStringArrayList implements MyStringList{

	private int capacity;
	private String[] elements;
	int length = 0;
	
	public MyStringArrayList(int capacity) {

		this.capacity = capacity;
		this.elements = new String[capacity];
	}
	
	@Override
	public int size() {
		// 
		return length;
	}
	
	public void newCapacity() {
	    String[] newElements = new String[capacity + capacity];
	    System.arraycopy(elements, 0, newElements, 0, capacity);
	    this.elements = newElements;
	}

	@Override
	public boolean empty() {
		// 
		if(length == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean contains(String element) {
		// 
		for(int i=0; i<length-1; i++) {
			if(elements[i].equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public MyStringIterator iterator() {
		// TODO Auto-generated method stub
		String[] elementsArray = new String[length];
	    System.arraycopy(elements, 0, elementsArray, 0, length);
	    MyStringIterator iterator = new MyStringIteratorLogic(elementsArray);
	    return iterator;
	}

	@Override
	public void add(String element) {
		// 
		if(capacity == length) {
			newCapacity();
		}

		elements[length] = element;
		length++;
	}

	public void shiftRightFrom(int index) {
		//
		for(int i = length; i > index; i--) {
			elements[i] = elements[i-1];
		}
	}
	
	@Override
	public void add(int index, String element) {
		// 
		if(capacity == length) {
			newCapacity();
		}
		if(index == 0) {
			add(element);
		} else {
			length++;
			shiftRightFrom(index);
			elements[index] = element;
			
		}
	}

	@Override
	public String get(int index) {
		// 
		return elements[index];
	}

	public void shiftLeftTo(int index) {
		//
		for(int i=index; i<length; i++) {
			elements[i] = elements[i+1];
		}
	}
	
	@Override
	public void remove(String element) {
		// 
		for(int i=0; i<length-1; i++) {
			if(elements[i].equals(element)) {
				elements[i] = null;
				shiftLeftTo(i);
			}
		}
		length--;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		elements[index] = null;
		shiftLeftTo(index);
		length--;
	}

	@Override
	public void addAll(MyStringList sourceList) {
		// TODO Auto-generated method stub
		if(capacity == length) {
			newCapacity();
		}
		for(int i=length; i<sourceList.size(); i++) {
			elements[length++] = sourceList.toString();
			length++;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int i=0; i<length-1; i++) {
			elements[i] = null;
		}
		length=0;
	}

	@Override
	public String[] toArray() {
		// TODO Auto-generated method stub
		String[] stringArray = new String[length];
	    System.arraycopy(stringArray, 0, elements, 0, length);
	    return elements;
	}

}
