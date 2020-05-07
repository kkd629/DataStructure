/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.queue.facade;

public interface MyQueue<E> {
	//
	boolean offer(E element); 
	E peek(); 
	E poll(); 
	int size(); 
	boolean empty(); 
}