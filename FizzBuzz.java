import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner FizzOrBuzz = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl von 1 bis 100 an: ");
        int x = FizzOrBuzz.nextInt();

        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (x % 3 == 0) {
            System.out.println("Fizz");
        } else if (x % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(x);
        }
    }
}

