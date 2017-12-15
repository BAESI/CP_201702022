
public class Shape {
	protected int width, height;

	public Shape(int w, int h) {
		width = w;
		height = h;
	}

	public void area() {
		System.out.println("도형넓이구하기 시작");
	}
};

class Triangle extends Shape {
	public Triangle(int w, int h) {
		super(w, h);
	}

	public void area() {
		double a = (double) width * (double) height / 2;
		System.out.println("삼각형도형의 넓이:" + a);
	}

}

class Rectangle extends Shape {
	public Rectangle(int w, int h) {
		super(w, h);
	}

	public void area() {
		double a = (double) width * (double) height;
		System.out.println("사각형도형의 넓이:" + a);
	}
}

class Circle extends Shape {
	private int radius;

	public Circle(int w, int h, int r) {
		super(w, h);
		radius = r;
	}

	public void area() {
		double a = radius * radius * 3.14;
		System.out.println("원의 넓이:" + a);
	}
}
