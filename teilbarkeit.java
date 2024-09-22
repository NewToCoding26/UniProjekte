import java.util.Scanner;

public class teilbarkeit {
    public static void main(String[] args) {
        Scanner teilen = new Scanner(System.in);
        System.out.println("Geben Sie eine positive ganze Zahl ein: ");
        int x = teilen.nextInt();

        if (x > 0) {
            while (x % 2 == 0 && x != 0) {
                x = x / 2;  
                System.out.println("Aktueller Wert nach Teilung: " + x);
            }
        } else {
            System.out.println("Die eingegebende zahl war keine positive ganze Zahl.");
        }
        teilen.close();
    }
}

