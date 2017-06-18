package codingtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckTriangleTest {

	private CheckTriangle checkObject = null;

	@Before
	public void setUp() throws Exception {
		checkObject = new CheckTriangle();

	}

	@Test
	public void testCheckLength() {
		assertTrue(checkObject.checkLength(-2, -3, 1));
		assertTrue(checkObject.checkLength(1, -2, -3));
		assertTrue(checkObject.checkLength(-1, 2, -3));
		assertTrue(checkObject.checkLength(-1, -2, -3));
		assertTrue(checkObject.checkLength(-1, 2, 3));
		assertTrue(checkObject.checkLength(1, -2, 3));
		assertTrue(checkObject.checkLength(1, 2, -3));
		assertFalse(checkObject.checkLength(2, 3, 1));
	}

	@Test
	public void testCheckTraingleProperty() {
		assertTrue(checkObject.checkTraingleProperty(10, 3, 2));
		assertTrue(checkObject.checkTraingleProperty(3, 10, 2));
		assertTrue(checkObject.checkTraingleProperty(3, 2, 10));
		assertFalse(checkObject.checkTraingleProperty(2, 3, 4));
	}

	@Test
	public void testCheckIsoceles() {
		assertFalse(checkObject.checkIsoceles(3, 4, 5));
		assertTrue(checkObject.checkIsoceles(3, 3, 4));
		assertTrue(checkObject.checkIsoceles(3, 4, 3));
		assertTrue(checkObject.checkIsoceles(3, 4, 4));
		assertTrue(checkObject.checkIsoceles(4, 4, 4));

	}

	@Test
	public void testCheckEquilateral() {
		assertFalse(checkObject.checkEquilateral(3, 4, 5));
		assertTrue(checkObject.checkEquilateral(3, 3, 3));
	}

	@Test
	public void testGetTriangleType() {
		assertEquals("Its an Equilateral Triangle", checkObject.getTriangleType(3, 3, 3));
		assertEquals("Its an Isoceles Triangle", checkObject.getTriangleType(3, 3, 4));
		assertEquals("Its a Scalene Triangle", checkObject.getTriangleType(3, 4, 5));
		assertEquals("Sorry this is not a valid triangle.", checkObject.getTriangleType(1, -2, 2));
		assertEquals("Sorry this is not a valid triangle.", checkObject.getTriangleType(10, 2, 1));

	}

}
