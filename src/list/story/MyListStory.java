/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package namoosori.elephant.datastructure.list.story;

import namoosori.elephant.datastructure.iterator.MyIterator;
import namoosori.elephant.datastructure.iterator.MyStringIterator;
import namoosori.elephant.datastructure.list.array.MyStringArrayList;
import namoosori.elephant.datastructure.list.array.MyStringArrayList;
import namoosori.elephant.datastructure.list.facade.MyList;
import namoosori.elephant.datastructure.list.list.MyStringLinkedList;

public class MyListStory {
	
	public static void main(String[] args) {
		// 
		MyListStory story = new MyListStory(); 
		story.tellMe(); 
	}

	public void tellMe() {
		// 
		//MyStringArrayList months = new MyStringArrayList(10); 

		MyStringLinkedList months = new MyStringLinkedList(); 
		MyStringLinkedList months2 = new MyStringLinkedList();
		String april = "4.April"; 
		
		months.add(0, "1.January"); 
		months.add(1, "2.February"); 
		months.add(2, "3.March"); 
		months.add(3, april); 
		months.add(4, "5.May"); 
		months.add(5, "6.June"); 
		months.add(6, "7.July"); 
		months.add(7, "8.August"); 
		months.add("9.September"); 
		months.add("10.October"); 
		months.add("11.November"); 
		months.add("12.December"); 
		
		months2.add(0, "test0");
		months2.add(1, "test1");
		months2.add(2, "test2");

		months2.addAll(months);
		
		MyStringIterator monthIter = months.iterator(); 
		while(monthIter.hasNext()) {
			String month = monthIter.next(); 
			System.out.println(month); 
		}
		
		System.out.println("newMonth 추가++++++++++++++++++++++++");
		months.add(12, "13.NewMonth"); 
		
		int arraySize = months.size(); 	
		for(int i=0; i<arraySize; i++) {
			System.out.println(months.get(i) + ", ");
		}
		
		System.out.println("12월, 1월, 8월 제거 ------------------------"); 
		months.remove(0);
		months.remove(3);
		months.remove(9);
		arraySize = months.size();
		for(int i=0; i<arraySize; i++) {
			System.out.println(months.get(i) + ", ");
		}
		
		months.clear(); 
		System.out.println("\n" + months.toString());
	}
}
