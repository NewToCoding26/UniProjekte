import java.util.Scanner;

public class zahlenAnakyse {
    public static void main(String[] args) {
        Scanner positiveGanzeZahl = new Scanner (System.in);
        System.out.println("Geben sie eine Positive ganze Zahl ein: ");
        int x = positiveGanzeZahl.nextInt();

        if (x < 0) {
            System.out.println("Error: Negative Zahl");
        }else {
            if (x % 2 == 0 && isPrime(x)) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }
        
    }

    // überprüfen ob es eine Primzahl ist
    public static boolean isPrime (int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
