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
		listObject.enterValuesIntoLinkedList(-1);
		assertEquals("Sorry, LinkedList is yet to be populated", listObject.printFifthElementFromEnd(listObject.getHead()));
		listObject.enterValuesIntoLinkedList(3);
		assertEquals("Sorry, LinkedList has less than 5 elements", listObject.printFifthElementFromEnd(listObject.getHead()));
		listObject.enterValuesIntoLinkedList(5);
		assertEquals("Fifth element from the end is "+1, listObject.printFifthElementFromEnd(listObject.getHead()));
		assertNotEquals("Fifth element from the end is "+0, listObject.printFifthElementFromEnd(listObject.getHead()));
		
	}

}