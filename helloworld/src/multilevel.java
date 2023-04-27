
class Shape {
	int j = 10;

	public void display() {
		System.out.println("Inside display");
	}
}

class Rectangle{
	int i = 20;
Shape shape = new Shape();
int v = shape.j;
	public void area() {
		System.out.println("Inside area");
	
		//super.display();
	}
}

class Cube{
	int i = 30;

	public void volume() {
		System.out.println("Inside volume");
		//System.out.println(super.j);
	}
}

public class multilevel {
	public static void main(String[] arguments) {
		Cube cube = new Cube();
		Rectangle rect = new Rectangle();
		//cube.display();
	
		cube.volume();
	}
}
