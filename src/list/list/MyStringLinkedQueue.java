package namoosori.elephant.datastructure.list.list;

import namoosori.elephant.datastructure.queue.facade.MyStringQueue;

public class MyStringLinkedQueue implements MyStringQueue{

	private class Node{
		
		String element;
		private Node next;
		
		public Node(String element) {
			
			this.element = element;
			this.next = null;
		}
	}
	
	private Node front;
	private Node rear;
	private int capacity;
	private int arraySize;
	
	public MyStringLinkedQueue(int capacity) {
		
		this.front = null;
		this.rear = null;
		this.capacity = capacity;
		this.arraySize = 0;
	}
	
	@Override
	public boolean offer(String element) {
		// 추가할 노드 생성
		Node node = new Node(element);
		node.next = null; // 초기화
		
		// 비어있으면 rear, front 모두 노드로
		if(empty()) {
			rear = node;
			front = node;
		} else {
		// 아니면 마지막에 노드 추가
			rear.next = node;
            rear = node;
		}
		arraySize++;
		return true;
	}

	@Override
	public String peek() {
		// 맨 앞의 값 리턴
		return front.element.toString();
	}

	@Override
	public String poll() {
		// 삭제할 값 가져오기.
		String element = peek();
		// front 삭제
		front = front.next;
		
		if(front == null) {
			rear = null;
		} 
		arraySize--;
		return element;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return arraySize;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return (arraySize == 0);
	}

}
