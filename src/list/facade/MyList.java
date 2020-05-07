/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.list.facade;

import namoosori.elephant.datastructure.iterator.MyIterator;

public interface MyList<E> {                                   
	//
	int size();
	boolean empty();
	boolean contains(Object object);
	MyIterator<E> iterator();
	void add(E element);
	void add(int index, E element); 
	E get(int index); 
	void remove(Object object);
	void remove(int index); 
	void addAll(MyList<? extends E> collection);
	void clear();
	<T> T[] toArray(T[] some); 
}