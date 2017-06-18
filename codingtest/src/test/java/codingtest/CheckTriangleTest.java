package codingtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CheckTriangleTest {

	private CheckTriangle checkObject = null;
	private Integer i;
	

	@Before
	public void setUp() throws Exception {
		checkObject = new CheckTriangle();
		i=null;

	}

	@Test
	public void testGetTriangleType() {
		
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(i, i, i));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(i, 1, 2));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1, 2, i));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1, i, 2));
		
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(0, 0, 0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1, -2, 2));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(-1, 2, 2));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1, 2, -2));
		
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(10, 3, 2));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(3, 10, 2));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(2, 3, 10));
		
		
		assertEquals("Its an Equilateral Triangle", checkObject.getTriangleType(3, 3, 3));
		
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType(3, 3, 4));
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType(4, 3, 3));
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType(3, 4, 3));

		assertEquals("Its a Scalene Triangle", checkObject.getTriangleType(3, 4, 5));
		

	}

}
