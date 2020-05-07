/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.queue.facade;

import java.util.Queue;

public interface MyStringQueue {
	//
	boolean offer(String element); 
	String peek(); 
	String poll(); 
	int size(); 
	boolean empty(); 
}