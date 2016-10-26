package com.triangle.demo.main;

/*
 * Triangle challenge

Write a program that will determine the type of a triangle. 
It should take the lengths of the triangle's three sides as input, 
and return whether the triangle is equilateral, isosceles or scalene.

We are looking for solutions that showcase problem solving skills and 
structural considerations that can be applied to larger and potentially 
more complex problem domains. Pay special attention to tests, 
readability of code and error cases.

The way you reflect upon your decisions is important to us, 
why we ask you to include a brief discussion of your design 
decisions and implementation choices. 

Please put the solution up on GitHub and send the link to me. 

Please let me know if you have any questions. 

Thanks.
 */

public class TriangleUtil {
	
	public TriangleUtil() {}
	
	public TriangleType determineTriangleType(double side1, double side2 ,double side3) {
		
		if((side1 <= 0) || (side2 <= 0) || (side3 <= 0)) {
			throw new IllegalArgumentException("Each triangle side must have a value greater than zero");
		}
		if((side1 == side2) && (side3 == side1)) {
			return TriangleType.EQUILATERAL;
		}
		else if((side1 == side2) || (side1 == side3) || (side2 == side3)) {
			return TriangleType.ISOSCELES;
		}
		else {
			return TriangleType.SCALENE;
		}	
	}

}
