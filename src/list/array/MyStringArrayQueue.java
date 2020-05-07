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
		// rear가 끝에 닿으면 다시 처음으로
		if(rear == capacity-1) {
			rear = -1;
		}
		
		//element 추가
		elements[++rear] = element;
		return true;
	}

	@Override
	public String peek() {
		// front 값 반환
		return elements[front];
	}

	@Override
	public String poll() {
		// front 값을 찾아오고
		String element = peek();
		// front는 증가
		front++;
		
		// 끝까지 지웠으면 front를 0으로
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
