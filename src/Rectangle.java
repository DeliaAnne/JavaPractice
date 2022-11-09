
public class Rectangle {
	int length;
	int breadth;
	public Rectangle(int w, int h) {
		this.breadth = w;
		this.length = h;
	}
	
	public double calculatePerimeter() {
		System.out.println("calculating perimeter  ");
		int p = 2*(length+breadth);
		return p;
	}
}
