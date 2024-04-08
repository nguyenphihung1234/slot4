package exercise3;

public class RectangleTest {
    public static void main(String[] args) {
        // Declare and initialize a Rectangle object
        Rectangle rectangle = new Rectangle(    7, 3);

        // Show the rectangle on the console screen
        System.out.println("Initial Rectangle:");
        rectangle.display();
        // Display area and perimeter of the rectangle
        System.out.println("\nArea of the rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
    }
}
