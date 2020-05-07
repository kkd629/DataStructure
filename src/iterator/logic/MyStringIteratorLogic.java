/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */

package namoosori.elephant.datastructure.iterator.logic;

import namoosori.elephant.datastructure.iterator.MyStringIterator;

public class MyStringIteratorLogic implements MyStringIterator {
	//
	private int index; 
	private int length; 
	private String[] elements; 
	
	public MyStringIteratorLogic(String[] elements) {
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
	public String next() {
		// 
		if(!hasNext()) {
			throw new ArrayIndexOutOfBoundsException(); 
		}
		
		return elements[index++]; 
	}
}