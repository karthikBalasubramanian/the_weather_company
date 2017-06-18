package codingtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	private LinkedList listObject = null;
	@Before
	public void setUp() throws Exception {
		listObject = new LinkedList();
	}

	@Test
	public void testPrintFifthElementFromEnd() {
		
		assertEquals("LinkedList is empty", listObject.printFifthElementFromEnd(null));
		
		listObject.createLinkedListOfSize(-1);
		assertEquals("LinkedList is empty", listObject.printFifthElementFromEnd(listObject.getHead()));
		
		listObject.createLinkedListOfSize(3);
		assertEquals("LinkedList has only " + 3+" elements", listObject.printFifthElementFromEnd(listObject.getHead()));
		
		listObject.createLinkedListOfSize(5);
		assertEquals("Fifth element from the end is "+1, listObject.printFifthElementFromEnd(listObject.getHead()));
		assertNotEquals("Fifth element from the end is "+0, listObject.printFifthElementFromEnd(listObject.getHead()));
		
		listObject.createLinkedListOfSize(6);
		assertEquals("Fifth element from the end is "+2, listObject.printFifthElementFromEnd(listObject.getHead()));
		
		
	}

}