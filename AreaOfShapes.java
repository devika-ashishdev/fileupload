import java.util.Scanner;
class AreaOfShapes
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
double area;

        System.out.println("Enter shape (a for Circle, b for Rectangle, c for Square): ");
        String shape = sc.nextLine();

        switch (shape) {
            case "a":
                System.out.println("Enter radius: ");
                double radius = sc.nextDouble();
                area = 3.14 * radius * radius;
                System.out.println("Area of Circle: " + area);
                break;
            case "b":
                System.out.println("Enter length: ");
                double length = sc.nextDouble();
                System.out.println("Enter width: ");
                double width = sc.nextDouble();
                area = length * width;
                System.out.println("Area of Rectangle: " + area);
                break;
            case "c":
                System.out.println("Enter side length: ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of Square: " + area);
                break;
            default:
                System.out.println("Invalid shape selected.");
                break;
        }
    }
}

