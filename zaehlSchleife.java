import java.util.Scanner;

public class zaehlSchleife {
    public static void main(String[] args) {
        Scanner zahlEinlesen = new Scanner(System.in);
        System.out.print("Geben Sie eine natuerliche Zahl ein: ");
        int x = zahlEinlesen.nextInt(); 

        int counter = 0;
        while (counter < x) {
            System.out.println("Hallo");
            counter++; 
        }

        zahlEinlesen.close(); 
    }
}

