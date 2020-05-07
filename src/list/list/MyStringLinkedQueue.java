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
		// �߰��� ��� ����
		Node node = new Node(element);
		node.next = null; // �ʱ�ȭ
		
		// ��������� rear, front ��� ����
		if(empty()) {
			rear = node;
			front = node;
		} else {
		// �ƴϸ� �������� ��� �߰�
			rear.next = node;
            rear = node;
		}
		arraySize++;
		return true;
	}

	@Override
	public String peek() {
		// �� ���� �� ����
		return front.element.toString();
	}

	@Override
	public String poll() {
		// ������ �� ��������.
		String element = peek();
		// front ����
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
