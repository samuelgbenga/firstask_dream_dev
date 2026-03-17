import java.util.Scanner;

public class Arithmetic {

     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

     System.out.println("Find the Square of two numbers, there sum and there difference");

     System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int square1 = num1 * num1;
        int square2 = num2 * num2;

        int summOfBothSquares = square1 + square2;
        int differenctOfBothSquaures = square1 - square2;

        System.out.println("Square of first integer: " + square1);
        System.out.println("Square of second integer: " + square2);
        System.out.println("Sum of squares: " + summOfBothSquares);
        System.out.println("Difference of squares : " + differenctOfBothSquaures);
     }
    
}
