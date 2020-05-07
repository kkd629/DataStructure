package namoosori.elephant.datastructure.list.list;


import namoosori.elephant.datastructure.iterator.MyStringIterator;
import namoosori.elephant.datastructure.iterator.logic.MyIteratorLogic;
import namoosori.elephant.datastructure.iterator.logic.MyStringIteratorLogic;
import namoosori.elephant.datastructure.list.facade.MyStringList;

public class MyStringLinkedList implements MyStringList {

	private Node head;
	private Node tail;
	private int size = 0;

	static class Node {	
		private Object data;
		private Node next;
		
		public Node(Object data) {	
			this.data = data;
			this.next = null;
		}
	}
	
	@Override
	public int size() {
		// 
		return size;
	}

	@Override
	public boolean empty() {
		// 
		boolean isEmpty;
		if(size == 0) {
			isEmpty = true;
		} else {
			isEmpty = false;
		}
		return isEmpty;
	}

	@Override
	public boolean contains(String element) {
		// 
		for(int i = 0; i < size-1; i++) {
			Node node = new Node(i);
			if(node.data.equals(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public MyStringIterator iterator() {
		// 
		String[] elementsArray = new String[size];
		for(int i=0; i<size; i++) {
			elementsArray[i] = (String) get(i);
		}
		MyStringIterator iterator = new MyStringIteratorLogic(elementsArray);
	    return iterator;
	}

	@Override
	public void add(String element) {
		// 
		Node node = new Node(element);
		
		node.next = head;
		head = node;

		size++;
		if(head.next == null) {
			tail = head;
		}
	}

	@Override
	public void add(int index, String element) {
		// 
		if(index == 0) {
			add(element);
		} else {
			Node node1 = getNode(index-1);
			Node node2 = node1.next;
			Node newNode = new Node(element);
			node1.next = newNode;
			newNode.next = node2;
			
			size ++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}

	public Node getNode(int index) {
		Node node = head;
		for(int i=0; i<index; i++) {
			node = node.next;
		}
		return node;
	}
	
	@Override
	public Object get(int index) {
		// 
		return getNode(index).data;
	}

	@Override
	public void remove(String element) {
		// TODO Auto-generated method stub
		for(int i=0; i<size-1; i++) {
			Node node = new Node(i);
			if(node.data.equals(element)) {
				
			}
		}
	}

	public void removeFirst() {
		
		Node node = head;
		head = node.next;
		node = null;
		size--;
	}
	
	public void removeLast() {
		remove(size-1);
	}
	
	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		if(index == 0) {
			System.out.println(size);
			removeFirst();
		} else {
			System.out.println(size);
			Node temp = getNode(index-1);
			Node deleteNode = temp.next;
			temp.next = temp.next.next;
			if(deleteNode == tail) {
				tail = temp;
			}
			deleteNode = null;
			size--;
		}
	}

	@Override
	public void addAll(MyStringList sourceList) {
		// TODO Auto-generated method stub
		String[] elementsArray = new String[size];
		for(int i=size; i<sourceList.size(); i++) {
			elementsArray[size] = sourceList.toString();
		}
		size += sourceList.size();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		while(true) {
			if(size > 0) {
				removeFirst();
			}
		}
	}

	@Override
	public String[] toArray() {
		// TODO Auto-generated method stub
		String[] elementsArray = new String[size];
		for(int i=0; i<size; i++) {
			elementsArray[i] = (String) get(i);
		}
	    return elementsArray;
	}
}
