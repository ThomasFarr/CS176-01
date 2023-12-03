package edu.monmouth.shape;


public class Circle implements Shape {
	private double radius;
	private int MINRAD = 0;

	public Circle(double radius) {
		setRadius(radius);
	}

	@Override
	public double area() {
		return (Math.PI * Math.pow(radius, 2)); 
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius >= MINRAD) {
			this.radius = radius;
		} else {
			this.radius = MINRAD;
		}
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area()=" + area() + "]";
	}
	
	

}
