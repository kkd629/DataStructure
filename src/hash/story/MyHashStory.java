/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.hash.story;

import java.util.Collection;
import java.util.Random;

public class MyHashStory {
	
	public static void main(String[] args) {
		//
		System.out.println("Hello".hashCode());
		showHashMapDemo(); 
	}
	
	private static void showHashMapDemo() {
		// 
		MyHash hashMap = new MyHash();
		Random random = new Random(); 
		for(int month=1; month<=500; month++) {
			int randomValue = random.nextInt(500); 
			hashMap.put(String.valueOf(randomValue), (randomValue + "¿ù")); 
		}
		
		hashMap.remove("6");
		
		Collection<String> keys = hashMap.keySet(); 
		for(String key : keys) {
			System.out.print(" " + hashMap.get(key));  
		}
		System.out.println(hashMap.get(String.valueOf(1)));
		System.out.println("\n size --> " + hashMap.size()); 
	}

}