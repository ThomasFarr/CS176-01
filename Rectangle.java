package edu.monmouth.shape;

public class Rectangle implements Shape {
	final int MINWIDTH = 0;
	final int MINLENGTH = 0;
	private int width;
	private int length;

	public Rectangle(int width, int length) {
		setWidth(width);
		setLength(length);
	}

	@Override
	public double area() {
		return (length * width);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width >= MINWIDTH ) {
			this.width = width;

		} else {
			this.width = MINWIDTH;
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length >= MINLENGTH) {
			this.length = length;
		} else {
			this.length = MINLENGTH;
		}
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", area()=" + area() + "]";
	}
	
	

}
