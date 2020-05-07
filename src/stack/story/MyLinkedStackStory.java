/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.stack.story;

import namoosori.elephant.datastructure.list.array.MyStringArrayStack;
import namoosori.elephant.datastructure.list.list.MyStringLinkedStack;

public class MyLinkedStackStory {
	// 
	public static void main(String[] args) {
		// 
		//MyStringArrayStack stack = new MyStringArrayStack(150); 
		MyStringLinkedStack stack = new MyStringLinkedStack();
		
		for(int i=0; i<100; i++) {
			stack.push(Integer.toString(i));
			System.out.println("Pushed --> " + stack.peek()); 
		}
		System.out.println(stack.search("33"));
		System.out.println(stack.size());
		for(int i=0; i<100; i++) {
			System.out.println("poped --> " + stack.peek()); 
			stack.pop(); 
		}
		System.out.println(stack.search("33"));
		System.out.println("스택 사이즈  : " + stack.size());
		System.out.println("스택 empty? " + stack.empty()); 
	}
}