/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.hash.linknode;

public class LinkNode {
	//
	private String key; 
	private Object value; 
	private LinkNode next; 
	
	public LinkNode(String key, Object value) {
		// 
		this.key = key; 
		this.value = value; 
		this.next = null; 
	}

	@Override
	public String toString() {
		return "LinkNode [key=" + key + ", value=" + value + ", next=" + next + "]";
	}

	public boolean isTail() {
		// 
		if (next == null) {
			return true; 
		}
		
		return false; 
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LinkNode getNext() {
		return next;
	}

	public void setNext(LinkNode next) {
		this.next = next;
	}
}
