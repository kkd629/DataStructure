/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.stack.facade;

public interface MyStack<E> {
	//
	boolean empty(); 
	E push(E element); 
	E pop(); 
	E peek(); 
	int search(E element); 
}