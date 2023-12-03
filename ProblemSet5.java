package edu.monmouth.ProblemSet5;

import edu.monmouth.shape.*;

public class ProblemSet5 {

	public static void main(String[] args) {
		// validate invalid values are set to zero
		Rectangle invalidRectangle = new Rectangle(-9, -8);
		System.out.println("invalid Rectangle length: " + invalidRectangle.getLength() + " width: " + invalidRectangle.getWidth());
		
		Circle invalidCircle = new Circle(-7);
		System.out.println("invalid Circle radius: " + invalidCircle.getRadius());
		
		// create valid Rectangles and Circles
		Rectangle smallRectangle = new Rectangle(3, 4);
		Rectangle largeRectangle = new Rectangle(300, 400);
		
		Circle smallCircle = new Circle(5);
		Circle largeCircle = new Circle(50);
		
		// declare a reference to a Shape that refers to a concrete class
		Shape rectangle = new Rectangle(8, 12);
		Shape circle = new Circle(10);
		
		// invoke the toString() method
		System.out.println(smallRectangle);
		System.out.println(largeRectangle);
		System.out.println(smallCircle);
		System.out.println(largeCircle);
		System.out.println(rectangle);
		System.out.println(circle);
		
		// pass Rectangle & Circle references to printArea()
		printArea(smallRectangle);
		printArea(largeRectangle);
		printArea(smallCircle);
		printArea(largeCircle);
		printArea(rectangle);
		printArea(circle);
	}
	
	static void printArea(Shape shape) {
		System.out.println(shape.area());
	}

}
