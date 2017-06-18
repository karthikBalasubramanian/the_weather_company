package codingtest;

public class LinkedList {
	
	private Node head = null;
	
	public Node getHead() {
		return this.head;
	}
	public void enterValuesIntoLinkedList(int numbersToAdd){
		this.head = null;
		for(int i=numbersToAdd; i>=0; i--){
			addToLinkedList(i);
		}
	}
	public void addToLinkedList(int data){
		Node current = new Node(data);
		current.next= this.head;
		head= current;
	}
	
	public String printFifthElementFromEnd(Node head){
		
		Node slowPointer = head;
		Node fastPointer = head;
		
		int stepsToMove = 0;
		
		if(fastPointer!=null){
			while(stepsToMove<5){
				if(fastPointer==null){
					return "Sorry, LinkedList has less than 5 elements";
				}
				fastPointer = fastPointer.next;
				stepsToMove+=1;
			}
			while(fastPointer!=null){
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
			
			return "Fifth element from the end is "+slowPointer.value;
			
			
		}else{
			return "Sorry, LinkedList is yet to be populated";
		}
		
	}
}
