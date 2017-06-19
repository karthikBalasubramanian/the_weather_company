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
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1.0, 2.0, i));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1.0, i, 2.0));
		
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(0.0, 0.0, 0.0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(1.0, -2.0, 2.0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType(-1.0, 2.0, 2.0));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType((double)1, (double)2, (double)-2));
		
		assertEquals("Not a valid triangle.", checkObject.getTriangleType((double)10, (double)3, (double)2));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType((double)3, 5.01, (double)2));
		assertEquals("Not a valid triangle.", checkObject.getTriangleType((double)2, (double)3, (double)10));
		
		
		assertEquals("Its an Equilateral Triangle", checkObject.getTriangleType((double)3, (double)3, (double)3));
		
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType((double)3, (double)3, (double)4));
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType(4.0, 3.0, 3.0));
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType(3.0, 4.0, 3.0));

		assertEquals("Its a Scalene Triangle", checkObject.getTriangleType(3.0, 4.0, 5.0));
		

	}

}
