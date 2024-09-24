import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
        Scanner ganzeZahl = new Scanner(System.in);
        System.out.print("Geben Sie eine ganze Zahl n ein: ");
        int n = ganzeZahl.nextInt();

        int fakultaet = 1;

        for (int i = 1; i <= n; i++) {
            fakultaet *= i; 
        }

        System.out.println("Die Fakultaet von " + n + " ist: " + fakultaet);
    }
}
