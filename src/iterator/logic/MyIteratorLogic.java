/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */

package namoosori.elephant.datastructure.iterator.logic;

import namoosori.elephant.datastructure.iterator.MyIterator;

public class MyIteratorLogic<E> implements MyIterator<E> {
	//
	private int index; 
	private int length; 
	private E[] elements; 
	
	public MyIteratorLogic(E[] elements) {
		// 
		this.index = 0;
		this.length = elements.length; 
		this.elements = elements; 
	}
	
	@Override
	public boolean hasNext() {
		// 
		if(index < length) {
			return true; 
		}
		
		return false;
	}

	@Override
	public E next() {
		// 
		return elements[index++]; 
	}
}