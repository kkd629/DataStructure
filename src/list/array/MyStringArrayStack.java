package namoosori.elephant.datastructure.list.array;

import namoosori.elephant.datastructure.stack.facade.MyStringStack;

public class MyStringArrayStack implements MyStringStack{
	
	private int top;
	private int max;
	private String[] elements;
	
	public MyStringArrayStack(int max) {
		
		this.top = -1;
		this.max = max;
		this.elements = new String[max];
	}

	@Override
	public String push(String element) {
		// 
		if(top == max) {
			return "스택 오버!!";
		}
		return elements[++top] = element;
	}

	@Override
	public String pop() {
		// 
		if(empty()) {
			System.out.println("스택 empty!!");
		}
		return elements[top--];
	}

	@Override
	public String peek() {
		// 
		return elements[top];
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top+1;
	}

	@Override
	public int search(String element) {
		// TODO Auto-generated method stub
		for(int i=0; i<top; i++) {
			if(elements[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

}
