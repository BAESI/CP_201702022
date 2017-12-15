	
public class Shapetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shape = new Shape[4+];
		shape[0] = new Shape(5,3);
		shape[1] = new Triangle(5,3);
		shape[2] = new Rectangle(5,3);
		shape[3] = new Circle(0,0,5);
		for (int i =0;i < shape.length; i++) {
			shape[i].area();
		}
	}
}
