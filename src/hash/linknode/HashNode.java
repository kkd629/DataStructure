/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.hash.linknode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HashNode {
	//
	private int size; 
	private LinkNode head;
	private LinkNode tail; 
	
	public HashNode() {
		// 
		this.clear(); 
	}

	@Override
	public String toString() {
		return "HashNode [size=" + size + ", head=" + head + "]";
	}

	public void clear() {
		// 
		this.size = 0; 
		this.head = null; 
		this.tail = null; 		
	}
	
	public boolean empty() {
		return size == 0; 
	}
	
	public Collection<String> keys() {
		//
		List<String> keys = new ArrayList<String>(size); 
		
		LinkNode targetNode = head;
		while(targetNode != null) {
			keys.add(targetNode.getKey()); 
			targetNode = targetNode.getNext(); 
		}
		
		return keys; 
	}
	
	public Collection<Object> values() {
		// 
		List<Object> values = new ArrayList<Object>(size); 
		
		LinkNode targetNode = head;
		while(targetNode != null) {
			values.add(targetNode.getValue()); 
			targetNode = targetNode.getNext(); 
		}
		
		return values; 
	}
	
	public Object get(String key) {
		// 
		Object value = null; 
		LinkNode targetNode = head;
		while(targetNode != null) {
			if(targetNode.getKey().equals(key)) {
				value = targetNode.getValue(); 
				break; 
			}
			
			targetNode = targetNode.getNext(); 
		}
		
		return value;
	}
	
	public void add(String key, Object value) {
		// 
		addLast(key, value); 
	}
	
	public int size() {
		return size;
	}

	public LinkNode getHead() {
		return head;
	}

	public void setHead(LinkNode head) {
		this.head = head;
	}
	
	private void addFirst(String key, Object value) {
		// 
		LinkNode newNode = new LinkNode(key, value); 
		newNode.setNext(head);
		head = newNode; 
		size++; 
		if (head.isTail()) {
			tail = head; 
		} 
	}
	
	private void addLast(String key, Object value) {
		// 
		if(size == 0) {
			addFirst(key, value); 
			return; 
		} 

		LinkNode newNode = new LinkNode(key, value); 
		tail.setNext(newNode);
		tail = newNode; 
		size++; 
	}
	
	public boolean remove(String key) {
		// 
		LinkNode previousNode = null; 
		LinkNode targetNode = head; 

		boolean found = false; 
		while(targetNode != null) {
			if(targetNode.getKey().equals(key)) {
				found = true; 
				break;
			}
			previousNode = targetNode; 
			targetNode = targetNode.getNext(); 
		}

		if (!found) {
			return false; 
		}
		
		size--;
		if (previousNode == null) {
			clear(); 
		} else {
			previousNode.setNext(targetNode.getNext()); 
			if(previousNode.isTail()) {
				tail = previousNode; 	
			}
		}
		
		return true; 
 	}
}