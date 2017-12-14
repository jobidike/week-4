
public class CircleDemo {
	
	public static void main(String[] args) {

	Circle firstCircle = new Circle(42);
	Circle secondCircle = new Circle(42);

	if(firstCircle.equals(secondCircle)) {
		System.out.println("These are the same size");
	} else {
		System.out.println("These aren't the same size.");
	}
	
}
}

