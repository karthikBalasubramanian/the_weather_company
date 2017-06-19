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

	private boolean validLength(double sideA, double sideB, double sideC) {
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
	private boolean checkTraingleProperty(double sideA, double sideB, double sideC) {
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

	private boolean checkIsosceles(double sideA, double sideB, double sideC) {
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

	private boolean checkEquilateral(double sideA, double sideB, double sideC) {
		return sideA == sideB && sideB == sideC;
	}
	
	/**
	 * This function returns the type of triangle if its valid. Else reason out the problem.
	 * 
	 * @param sideA, Double length of sideA in a triangle
	 * @param sideB, Double length of sideB in a triangle
	 * @param sideC, Double length of sideC in a triangle
	 * @return the type of the triangle if the sides passed are valid, else reason out the problem
	 */

	public String getTriangleType(Double sideA, Double sideB, Double sideC) {
		
		if ((sideA != null && sideB != null && sideC != null)
				&& validLength(sideA.doubleValue(), sideB.doubleValue(), sideC.doubleValue())
				&& !checkTraingleProperty(sideA.doubleValue(), sideB.doubleValue(), sideC.doubleValue())) {
			
			if (checkEquilateral(sideA.doubleValue(), sideB.doubleValue(), sideC.doubleValue())) {
				return "Its an Equilateral Triangle";
			} else if (checkIsosceles(sideA.doubleValue(), sideB.doubleValue(), sideC.doubleValue())) {
				return "Its an Isoceles Triangle";
			} else {
				return "Its a Scalene Triangle";
			}

		} else {
			return "Not a valid triangle.";
		}

	}
}
