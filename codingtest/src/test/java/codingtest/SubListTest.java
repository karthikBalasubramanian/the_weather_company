package codingtest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SubListTest {

	private SubList subListCheck = null;
	@Before
	public void setUp() throws Exception {
	  subListCheck = new SubList();
	}

	@Test
	public void testIsSubList() {
		
		
		assertEquals("Both lists are empty", subListCheck.isSubList(null, null));
		assertEquals("Both lists are empty", subListCheck.isSubList(null, new ArrayList<Integer>()));
		assertEquals("Both lists are empty", subListCheck.isSubList(new ArrayList<Integer>(),null));
		
		
		assertEquals("listOne is a sublist of listTwo", subListCheck.isSubList(null, new ArrayList<Integer>(Arrays.asList(1,2,3))));
		assertEquals("listOne is a sublist of listTwo", subListCheck.isSubList(new ArrayList<Integer>(), new ArrayList<Integer>(Arrays.asList(1,2,3))));
		
		assertEquals("listTwo is a sublist of listOne", subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,2,3)),null));
		assertEquals("listTwo is a sublist of listOne", subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,2,3)),new ArrayList<Integer>()));
		
		assertEquals("Cannot compare two lists of different types.", subListCheck.isSubList(new ArrayList<String>(Arrays.asList("Karthik","Ankit","Elias")), new ArrayList<Integer>(Arrays.asList(1,2,3))));
		assertEquals("Cannot compare two lists of different types.", subListCheck.isSubList(new ArrayList<String>(Arrays.asList("Karthik","Ankit","Elias")), new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0))));
		
		assertEquals("listOne is a sublist of listTwo", subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,2)),new ArrayList<Integer>(Arrays.asList(1,2,3))));
		assertEquals("listOne is a sublist of listTwo", subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,2,2,6,6)), new ArrayList<Integer>(Arrays.asList(1,2,2,3,5,6,6,7))));
	
		
		assertEquals("listTwo is a sublist of listOne", subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,2,3)),new ArrayList<Integer>(Arrays.asList(1,2))));
		assertEquals("listTwo is a sublist of listOne", subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,2,2,3,5,6,6,7)),new ArrayList<Integer>(Arrays.asList(1,2,2,6,6))));
		
		assertEquals("listTwo is a sublist of listOne", subListCheck.isSubList(new ArrayList<String>(Arrays.asList("Karthik","Ankit","Elias")), new ArrayList<String>(Arrays.asList("Karthik","Elias"))));
		assertEquals("listTwo is a sublist of listOne", subListCheck.isSubList(new ArrayList<String>(Arrays.asList("Karthik","Ankit","Ankit")), new ArrayList<String>(Arrays.asList("Karthik","Ankit"))));
		
		assertEquals("listTwo is a sublist of listOne", subListCheck.isSubList(new ArrayList<Double>(Arrays.asList(1.0,1.1,1.25)), new ArrayList<Double>(Arrays.asList(1.10,1.00))));
		
		assertEquals("listOne element 2 not present in listTwo whose size is >= listOne. Therefore listOne is not a sublist of listTwo"
, subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,2,3)),new ArrayList<Integer>(Arrays.asList(1,4,5,6))));
		
		assertEquals("listOne element 1 not present in listTwo whose size is >= listOne. Therefore listOne is not a sublist of listTwo"
				, subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,1,3)),new ArrayList<Integer>(Arrays.asList(1,4,5,6))));
						
		
		assertEquals("listTwo element 0 not present in listOne whose size is >= listTwo. Therefore listTwo is not a sublist of listOne"
				, subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)),new ArrayList<Integer>(Arrays.asList(0,1))));
		
		assertEquals("listTwo element 4 not present in listOne whose size is >= listTwo. Therefore listTwo is not a sublist of listOne"
				, subListCheck.isSubList(new ArrayList<Integer>(Arrays.asList(1,2,3)),new ArrayList<Integer>(Arrays.asList(4,5,6))));
		
		
		
	}

}
