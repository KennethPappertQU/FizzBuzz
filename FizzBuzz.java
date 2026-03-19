import java.util.Scanner;

public class FizzBuzz {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give me a number between 1 and 100: ");
        int number = in.nextInt();

        if ((number > 0) && (number < 101)){
            if(number % 3 == 0) {
                System.out.print("Fizz");
            }
            if(number % 5 == 0) {
                System.out.print("Buzz");
            }
            if ((number % 3 != 0) && (number % 5 != 0)) {
                System.out.print(number);
            }
        }
        else {
            System.out.println("Incorrect output");
        }
    }
}
