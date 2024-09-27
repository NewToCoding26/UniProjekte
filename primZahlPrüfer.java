import java.util.Scanner;

public class primZahlPrüfer {
    public static void main(String[] args) {
        Scanner primZahlPrüfung = new Scanner (System.in);
        System.out.println("Geben sie eine Zahl ein: ");
        int n = primZahlPrüfung.nextInt();

        if (istPrimZahl(n)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

    public static boolean istPrimZahl (int n) {
        if (n<2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
