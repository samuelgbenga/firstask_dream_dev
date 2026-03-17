import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);



        System.out.println("Five numbers compare");

        System.out.print("Enter integer 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter integer 2: ");
        int num2 = input.nextInt();

        System.out.print("Enter integer 3: ");
        int num3 = input.nextInt();

        System.out.print("Enter integer 4: ");
        int num4 = input.nextInt();

        System.out.print("Enter integer 5: ");
        int num5 = input.nextInt();

        System.out.println("Checking for the smallest Number");
        int smallestNumber = num1;

        if(smallestNumber > num2) smallestNumber = num2;
        if(smallestNumber > num3) smallestNumber = num3;
        if(smallestNumber > num4) smallestNumber = num4;
        if(smallestNumber > num5) smallestNumber = num5;

        System.out.println("Checking for the largest number");
        int largestNumber = num1;
        if(largestNumber < num2) largestNumber = num2;
        if(largestNumber < num3) largestNumber = num3;
        if(largestNumber < num4) largestNumber = num4;
        if(largestNumber < num5) largestNumber = num5;

        System.out.printf("Largest Number: %d - Smallest Number %d", largestNumber, smallestNumber);


    }
}
