package namoosori.elephant.datastructure.list.array;

import namoosori.elephant.datastructure.queue.facade.MyStringQueue;

public class MyStringArrayQueue implements MyStringQueue{

	private int front;
	private int rear;
	private int capacity;
	private String[] elements;
	
	public MyStringArrayQueue(int capacity) {
		
		this.front = 0;
		this.rear = -1;
		this.capacity = capacity-1;
		this.elements = new String[capacity];
	}
	
	@Override
	public boolean offer(String element) {
		// rear�� ���� ������ �ٽ� ó������
		if(rear == capacity-1) {
			rear = -1;
		}
		
		//element �߰�
		elements[++rear] = element;
		return true;
	}

	@Override
	public String peek() {
		// front �� ��ȯ
		return elements[front];
	}

	@Override
	public String poll() {
		// front ���� ã�ƿ���
		String element = peek();
		// front�� ����
		front++;
		
		// ������ �������� front�� 0����
		if(front == capacity) {
			front = 0;
		}
		return element;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return rear-front+1;
	}

	@Override
	public boolean empty() {
		// 
		return (front == rear+1) || (front+capacity-1 == rear);
	}

}
