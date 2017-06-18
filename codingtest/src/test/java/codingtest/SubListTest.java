package codingtest;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class SubListTest {
	private SubList subListCheck = null;
	@Before
	public void setUp() throws Exception {
		subListCheck  = new SubList();
	}

	@Test
	public void testGetCountMap() {
		assertNull(subListCheck.getCountMap(null));
		assertNull(subListCheck.getCountMap(new int[0]));
		int[] array = {1,1,2,3,1};
		HashSet<Integer> uniqueNummbers = new HashSet<Integer>();
		for(int value: array){uniqueNummbers.add(value);}
		assertEquals(uniqueNummbers.size(), subListCheck.getCountMap(array).size());
	}

	@Test
	public void testIsSubList() {
		// first argument is an array to check for sublist
		// second argument is the longer array which is searched for sublist array elements.
		assertEquals("Sorry either of the list is empty",subListCheck.isSubList(null, null) );
		assertEquals("Sorry either of the list is empty",subListCheck.isSubList(null, new int[2]) );
		assertEquals("Sorry either of the list is empty",subListCheck.isSubList(new int[2], null) );
		assertEquals("Sorry either of the list is empty",subListCheck.isSubList(new int[0], new int[2]) );
		assertEquals("Sorry either of the list is empty",subListCheck.isSubList(new int[2], new int[0]) );
		assertNotEquals("Sorry either of the list is empty",subListCheck.isSubList(new int[2], new int[1]) );
		assertEquals("Sorry, original array is smaller than the sublist array. So the array cannot be a sublist",subListCheck.isSubList(new int[4], new int[2]) );
		assertEquals("element "+1+" is either not present or has less number of occurences in original array",subListCheck.isSubList(new int[] {1,1,1}, new int[]{1,1,2}));
		assertEquals("element "+5+" is either not present or has less number of occurences in original array",subListCheck.isSubList(new int[] {1,5,3}, new int[]{1,1,2}));
		assertEquals("The given array is indeed a subset of the existing array",subListCheck.isSubList(new int[] {1,1}, new int[]{1,1,2}));
		assertEquals("The given array is indeed a subset of the existing array",subListCheck.isSubList(new int[] {1,2,4}, new int[]{1,1,2,3,4,4,4}));
	}

}
