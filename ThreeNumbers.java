import java.util.Scanner;

public class ThreeNumbers {
     public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Three Numbers Sum, Average, Product, Smallest and Largest");

        System.out.print("Enter first integer: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondNum = input.nextInt();

        System.out.print("Enter third integer: ");
        int thirdNum = input.nextInt();

        System.out.println("Calculate the sume of the numbers");

        int sumOfTheNumbers = firstNum + secondNum + thirdNum;

        System.out.println("Sum of Three Numbers: " + sumOfTheNumbers);

        System.out.println("Calculate thte Averate of the numbers.");

        int averageOfTheNumbers = sumOfTheNumbers/3;

        System.out.println("Average of Three Numbers: "+ averageOfTheNumbers);

        System.out.println("Calculate the product of the number");

        int productOfTheNumbers = firstNum * secondNum * thirdNum;

        System.out.println("Product of three numbers: " + productOfTheNumbers);

        System.out.println("Finding Smallest Number");

        int smallestNumber = firstNum;

        if(smallestNumber > secondNum) smallestNumber = secondNum;
        if(smallestNumber > thirdNum) smallestNumber = thirdNum;

        System.out.println("The smallest Number among the three: "+ smallestNumber);

        System.out.println("Finding The Largest Number");

        int largestNumber = firstNum;

        if(largestNumber < secondNum) largestNumber = secondNum;

        if(largestNumber < thirdNum) largestNumber = thirdNum;

        System.out.println("The largest number is: "+ largestNumber);
     }
}
