/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.list.facade;

import namoosori.elephant.datastructure.iterator.MyStringIterator;

public interface MyStringList {
	//
	int size();
	boolean empty();
	boolean contains(String element);
	MyStringIterator iterator();
	void add(String element);
	void add(int index, String element); 
	Object get(int index); 
	void remove(String element);
	void remove(int index); 
	void addAll(MyStringList sourceList);
	void clear();
	String[] toArray();
}