package namoosori.elephant.datastructure.list.list;

import namoosori.elephant.datastructure.stack.facade.MyStringStack;

public class MyStringLinkedStack implements MyStringStack{

	private Node top;
	private int stackSize;
	
	private class Node{
		
		private String element;
		private Node next;
		
		Node(String element){
			
			this.element = element;
			this.next = null;
		}
	}
	
	public MyStringLinkedStack() {
		
		this.top = null;
		this.stackSize = 0;
	}

	@Override
	public String push(String element) {
		// 추가할 노드 생성
		Node node = new Node(element);
		node.next = top;
		top = node;
		stackSize++;
		return null;
	}

	@Override
	public String pop() {
		// peek을 이용한 삭제
		String remove = peek();
		top = top.next;
		stackSize--;
		return remove;
	}

	@Override
	public String peek() {
		// top값 관리
		return top.element;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return stackSize;
	}

	@Override
	public int search(String element) {
		// TODO Auto-generated method stub
		for(int i=0; i<stackSize; i++) {
			Node node = new Node(Integer.toString(i));
			if(node.element.equals(element)) {
				return i; 
			}
		}
		return -999;
	}
	
	
}
