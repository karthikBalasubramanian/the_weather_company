package codingtest;

import java.util.HashMap;
import java.util.HashSet;

/**
 * LinkedList.java
 * Purpose: To create a LinkedList of inner class Node and return the 5th element from the end of LinkedList 
 *
 * @author Karthik Balasubramanian
 * @version 1.0 06/18/17
 */

public class LinkedList {

	private Node head = null;
	/**
	 * This is a getter method to access private class member head.
	 * 
	 * @return head of type Node - head of the LinkedList
	 */
	public Node getHead() {
		return this.head;
	}
	
	/**
	 * This method is used to create a LinkedList size, provided by the parameter.
	 * 
	 * @param numbersToAdd - Integer - Size of the LinkedList.
	 */

	void createLinkedListOfSize(int numbersToAdd) {
		this.head = null;
		for (int i = numbersToAdd; i > 0; i--) {
			Node current = new Node(i);
			current.next = this.head;
			head = current;
		}
	}
	
	/**
	 * This method is used to print the fifth element from the end of the LinkedList if the element exists.
	 * 
	 * @param head Node - head of the LinkedList 
	 * @return result, String - Fifth element from the end of the list if it exists, else explain the reason.
	 */

	public String printFifthElementFromEnd(Node head) {

		Node firstPointer = head;
		Node secondPointer = head;

		int stepsToMove = 0;

		if (firstPointer != null) {
			
			while (stepsToMove < 5) {
				
				if (firstPointer == null) {
					return "LinkedList has only " + stepsToMove + " elements";
				}
				
				firstPointer = firstPointer.next;
				stepsToMove += 1;
			}
			while (firstPointer != null) {
				
				secondPointer = secondPointer.next;
				firstPointer = firstPointer.next;
			
			}

			return "Fifth element from the end is " + secondPointer.value;

		} else {
			
			return "LinkedList is empty";
		}

	}
	
	
	
	    public static String reverseVowels(String s) {
	        
	        char[] finalArray = s.toCharArray();
	        
	        int low = 0;
	        int high = finalArray.length-1;
	        
	        while(low<high){
	            if("aeiou".contains(String.valueOf(finalArray[low])) && "aeiou".contains(String.valueOf(finalArray[high]))){
	                char temp =  finalArray[low];
	                finalArray[low] = finalArray[high];
	                finalArray[high]=temp;
	                low++;
	                high--;
	            }else if("aeiou".contains(String.valueOf(finalArray[low]))){
	                high--;
	            }else if("aeiou".contains(String.valueOf(finalArray[high]))){
	                low++;
	            }else{
	                low++;
	                high--;
	            }
	        }
	        
	        String m = new String(finalArray);
	        System.out.println(m);
	        return m;
	        
	    }
	    
	    public static int findPairs(int[] nums, int k) {
	        HashSet<Integer> finalSet = new HashSet<Integer>();
	        
	        for(int i=0; i<nums.length; i++){
	            finalSet.add(nums[i]);
	        }
	        HashMap<Integer,Integer> finalMap = new HashMap<Integer,Integer>();
	        int countPairs =0;
	        for(int val: finalSet ){
	        	if(finalMap.containsKey(Math.abs(k-val))){
	        		countPairs+=1;
	        	}
	        	finalMap.put(val, val);
	        }
	        return countPairs;
	    }
	
	
	
	public class Node {

		int value;
		Node next;
		
		/**
		 * Constructor to create a Node in the List with value and next pointer.
		 * 
		 * @param value, Integer.
		 */

		Node(int value) {
			this.value = value;
			this.next = null;
		}

	}
	
}
