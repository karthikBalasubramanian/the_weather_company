package codingtest;

/**
 * CheckTriangle.java
 * Purpose: Validates if the three points form a triangle and returns the type of the triangle
 *
 * @author Karthik Balasubramanian
 * @version 1.0 06/18/17
 */

public class CheckTriangle {
	
	/**
	 * This method is to validate the length of the triangle.
	 * 
	 * @param sideA length of sideA in a triangle
	 * @param sideB length of sideB in a triangle
	 * @param sideC length of sideC in a triangle
	 * @return true if they are valid lengths. Otherwise False
	 */

	private boolean validLength(int sideA, int sideB, int sideC) {
		return sideA > 0 && sideB > 0 && sideC > 0;
	}

	/**
	 * This method is to check triangle property for the given sides.
	 * 
	 * @param sideA length of sideA in a triangle
	 * @param sideB length of sideB in a triangle
	 * @param sideC length of sideC in a triangle
	 * @return true if the lengths does not adhere to triangle property. Otherwise return false.
	 */
	private boolean checkTraingleProperty(int sideA, int sideB, int sideC) {
		return sideA > sideB + sideC || sideB > sideA + sideC || sideC > sideA + sideB;
	}
	
	/**
	 * This method is to check the isosceles triangle property
	 * 
	 * @param sideA length of sideA in a triangle
	 * @param sideB length of sideB in a triangle
	 * @param sideC length of sideC in a triangle
	 * @return true if any two side's lengths are same.
	 */

	private boolean checkIsosceles(int sideA, int sideB, int sideC) {
		return sideA == sideB || sideB == sideC || sideA == sideC;
	}
	
	/**
	 * This method is to check the equilateral triangle property
	 * 
	 * @param sideA length of sideA in a triangle
	 * @param sideB length of sideB in a triangle
	 * @param sideC length of sideC in a triangle
	 * @return true if all sides lengths are same.
	 */

	private boolean checkEquilateral(int sideA, int sideB, int sideC) {
		return sideA == sideB && sideB == sideC;
	}
	
	/**
	 * This function returns the type of triangle if its valid. Else reason out the problem.
	 * 
	 * @param sideA, Integer length of sideA in a triangle
	 * @param sideB, Integer length of sideB in a triangle
	 * @param sideC, Integer length of sideC in a triangle
	 * @return the type of the triangle if the sides passed are valid, else reason out the problem
	 */

	public String getTriangleType(Integer sideA, Integer sideB, Integer sideC) {
		
		if ((sideA != null && sideB != null && sideC != null)
				&& validLength(sideA.intValue(), sideB.intValue(), sideC.intValue())
				&& !checkTraingleProperty(sideA.intValue(), sideB.intValue(), sideC.intValue())) {
			
			if (checkEquilateral(sideA.intValue(), sideB.intValue(), sideC.intValue())) {
				return "Its an Equilateral Triangle";
			} else if (checkIsosceles(sideA.intValue(), sideB.intValue(), sideC.intValue())) {
				return "Its an Isoceles Triangle";
			} else {
				return "Its a Scalene Triangle";
			}

		} else {
			return "Not a valid triangle.";
		}

	}
}
