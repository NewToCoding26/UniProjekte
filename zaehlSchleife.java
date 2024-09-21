import java.util.Scanner;

public class zaehlSchleife {
    public static void main(String[] args) {
        Scanner zahlEinlesen = new Scanner(System.in);
        // Ein Scanner-Objekt namens zahlEinlesen wird erstellt, um Eingaben von der Konsole zu lesen.
        System.out.print("Geben Sie eine natuerliche Zahl ein: ");
        // System.out.print() fordert den Benutzer auf, eine natürliche Zahl einzugeben.
        int x = zahlEinlesen.nextInt(); 
        // zahlEinlesen.nextInt() liest die vom Benutzer eingegebene Zahl und weist sie der Variablen x zu.

        int counter = 0;
        // Eine Zählvariable counter wird deklariert und auf 0 gesetzt. Diese Variable zählt, wie oft das Wort „Hallo“ ausgegeben wurde.
        while (counter < x) {
            System.out.println("Hallo");
            counter++; 
        }

        zahlEinlesen.close(); 
    }
}

