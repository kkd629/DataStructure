/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.stack.story;

import java.util.HashMap;
import java.util.Map;

import namoosori.elephant.datastructure.list.array.MyStringArrayStack;

public class MyStringStackStory {
	// 
	public static void main(String[] args) {
		// 
		showArrayStackDemo();
	}
	
	private static void showArrayStackDemo() {
		// 
		MyStringArrayStack taskStack = new MyStringArrayStack(5); 
		taskStack.push("5. 책읽기"); 
		taskStack.push("4. 이메일 확인"); 
		taskStack.push("3. 어머님께 전화"); 
		taskStack.push("2. 세탁물 찾기"); 
		taskStack.push("1. 집안 청소");
		taskStack.push("1. 집안 청소");
		
		int size = taskStack.size(); 
		System.out.println(size);
		for(int i=0; i<size; i++) {
			// 
			System.out.println(taskStack.pop()); 
		}
	}
}