import java.util.Scanner;

public class CalculatingCircle {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Calculating Circle");

        System.out.print("Enter radius: ");
        int radius = input.nextInt();

        double pie = 3.14159;

        System.out.println("calculating.....");

        int diameter = 2 * radius;

        double circumference = 2 * pie * radius;

        double area = pie * radius * radius;



        System.out.printf("Diameter: %d%n", diameter );
        System.out.printf("Circumference: %f%n", circumference);
        System.out.printf("Area: %f%n",  area);
    }
}
