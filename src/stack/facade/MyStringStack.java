/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.stack.facade;

public interface MyStringStack{
	//
	String push(String element); 	
	String pop(); 					// EmptyStackException
	String peek(); 					// EmptyStackException 
	boolean empty(); 
	int size(); 
	int search(String element); 	// -1 if empty
}