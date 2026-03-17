import java.util.Scanner;

public class IntegerCompary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Integer Comparer");

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int squareOfTheNumber = number * number;

        if (number > 100)
            System.out.println("Number is greater than 100");
        if (number == 100)
            System.out.println("Number is equal to 100");
        if (number != 100)
            System.out.println("Number is not equal to 100");
        if (number < 100)
            System.out.println("Number is less than 100");

        System.out.println("Checking for the square of the Number");

        if (squareOfTheNumber > 100)
            System.out.println("Number is greater than 100");
        if (squareOfTheNumber == 100)
            System.out.println("Number is equal to 100");
        if (squareOfTheNumber != 100)
            System.out.println("Number is not equal to 100");
        if (squareOfTheNumber < 100)
            System.out.println("Number is less than 100");

    }
}
