/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.hash.facade;

import java.util.Collection;
import java.util.Set;

public interface MyStringHash {
	//
	int size();
	boolean empty();
	boolean contains(String key);
	void put(String key, Object value); 
	Object get(String key); 
	void remove(String key);
	Collection<String> keySet(); 
	Collection<Object> values(); 
	void clear();
}