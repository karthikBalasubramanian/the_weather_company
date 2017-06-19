package codingtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CheckTriangleTest {

	private CheckTriangle checkObject = null;
	private Double i;
	

	@Before
	public void setUp() throws Exception {
		checkObject = new CheckTriangle();
		i=null;

	}

	@Test
	public void testGetTriangleType() {
		
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(i, i, i));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(i, 1.0, 2.0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1.3, 2.2, i));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1.0, i, 2.0));
		
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(0.0, 0.0, 0.0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1.0, -2.0, 2.0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(-1.0, 2.0, 2.0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1.0, 2.0, -2.0));
		
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(10.0, 3.0, 2.0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(3.0, 5.01, 2.0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(2.0, 3.0, 10.0));
		
		
		assertEquals("Its an Equilateral Triangle", checkObject.getTriangleType(3.0, 3.0, 3.0));
		
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType(3.0, 3.0, 4.0));
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType(4.0, 3.0, 3.0));
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType(3.0, 4.0, 3.0));

		assertEquals("Its a Scalene Triangle", checkObject.getTriangleType(3.0, 4.0, 5.0));
		

	}

}
