import java.util.Scanner;

public class binärZahlen {
    public static void main(String[] args) {
        Scanner umwandeln = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int x = umwandeln.nextInt();

        // Zweierkomplement-Binärdarstellung für 8 Bits ausgeben
        String binar = toBinary(x, 8);

        // Ausgabe der Binärdarstellung im Zweierkomplement
        System.out.println("Die Zahl " + x + " im Zweierkomplement-Binärformat (8 Bit): " + binar);
        
        umwandeln.close();  // Scanner schließen
    }

    public static String toBinary(int zahl, int bits) {
        String binar = Integer.toBinaryString(zahl);

        if (binar.length() > bits) {
            binar = binar.substring(binar.length() - bits);
        }

        while (binar.length() < bits) {
            binar = "0" + binar;
        }

        return binar;
    }
}

