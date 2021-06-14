import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color : ");
        String color = scanner.nextLine();
        System.out.print("Enter the first side : ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side: ");
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle();

        triangle = new Triangle(side1, side2,side3, color);
        System.out.println(triangle);
    }
}
