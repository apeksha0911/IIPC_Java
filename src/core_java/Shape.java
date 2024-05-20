package core_java;

public class Shape{
	public static void main(String args[]) {
		Rectangle rect = new Rectangle();
		rect.setDim(10, 10);
		System.out.println("Area of Rectangle : ");
		System.out.println(rect.getArea());
	}
}

class Rectangle {
	float length;
	float breadth;
	
	public void setDim(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public float getArea() {
		return this.breadth * this.length;
	}
}