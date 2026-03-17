import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number: ");

        int num = input.nextInt();

        if(num % 3 == 0) System.out.println("The number is Divisible by 3");

        if(num % 3 != 0) System.out.print("The number is not divisible by 3");


    }
}
