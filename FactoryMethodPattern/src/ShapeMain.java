
public class ShapeMain {

	public static void main(String[] args) {
		// Object creation
		ShapeFactory fc = new ShapeFactory();

        // Create a Circle
        Shape circle = fc.getShape("CIRCLE");
        circle.draw();

        // Create a Rectangle
        Shape rectangle = fc.getShape("RECTANGLE");
        rectangle.draw();

        // Try an invalid input
        Shape unknown = fc.getShape("TRIANGLE");
        if (unknown == null) {
            System.out.println("Unknown shape requested");
        }

	}
}
