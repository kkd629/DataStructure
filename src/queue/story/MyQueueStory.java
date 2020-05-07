/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.queue.story;

import java.util.Queue;


import namoosori.elephant.datastructure.list.array.MyStringArrayQueue;
import namoosori.elephant.datastructure.list.list.MyStringLinkedQueue;



public class MyQueueStory {
	//
	public static void main(String[] args) {
		//
		MyQueueStory myStory = new MyQueueStory(); 
		myStory.tellMeAboutArrayQueue(); 
		myStory.tellMeAboutLinkedQueue(); 
	}
	
	public void tellMeAboutArrayQueue() {
		// 
		MyStringArrayQueue myQueue = new MyStringArrayQueue(20); 

		myQueue.offer("1�썡"); 
		myQueue.offer("2�썡"); 
		myQueue.offer("3�썡"); 
		myQueue.offer("4�썡"); 
		myQueue.offer("5�썡"); 
		myQueue.offer("6�썡"); 
		myQueue.offer("7�썡"); 
		myQueue.offer("8�썡"); 
		myQueue.offer("9�썡"); 
		myQueue.offer("10�썡"); 
		myQueue.offer("11�썡"); 
		myQueue.offer("12�썡"); 
		myQueue.offer("13�썡"); 
		
		int size = myQueue.size(); 
		System.out.println(size);
		for(int i=0; i<size; i++) {
			System.out.println(myQueue.poll());
		}
	}
	
	public void tellMeAboutLinkedQueue() {
		//
		MyStringLinkedQueue myQueue = new MyStringLinkedQueue(5); 
		myQueue.offer("1�썡"); 
		myQueue.offer("2�썡"); 
		myQueue.offer("3�썡"); 
		myQueue.offer("4�썡"); 
		
		int size = myQueue.size(); 
		for(int i=0; i<size; i++) {
			System.out.println(myQueue.poll());
		}
	}
}