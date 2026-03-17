import java.util.Scanner;

public class TripleVsMultiple {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Comparing Multiple and Tripple of a First and second number");

        System.out.println("Enter first Number");

        int firstNum = input.nextInt();


         System.out.println("Enter second Number");

        int secondNum = input.nextInt();

        System.out.println("Start compare");

        int tripleOfFirstNum = firstNum * 3;

        int doubleOfSecondNum = secondNum * 2;

        System.out.println("Checking for Muliple.....");

        if(doubleOfSecondNum % tripleOfFirstNum != 0) System.out.printf( "Triple of the first number (%d)%n is not a mulple of the Double of the second number (%d)", tripleOfFirstNum, doubleOfSecondNum);

        if(doubleOfSecondNum % tripleOfFirstNum == 0) System.out.printf( "Triple of the first number (%d)%n is a mulple of the Double of the second number (%d)", tripleOfFirstNum, doubleOfSecondNum);







    }
}
