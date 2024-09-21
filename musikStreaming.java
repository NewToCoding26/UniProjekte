import java.util.Scanner;

public class musikStreaming {
    public static void main(String[] args) {
        Scanner benutzerEingabe = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Nicht-Studenten ein: ");
        int nonStudents = benutzerEingabe.nextInt();

        System.out.print("Geben Sie die Anzahl der Studenten ein: ");
        int students = benutzerEingabe.nextInt();

        int totalPersons = nonStudents + students;

        if (totalPersons > 5) {
            System.out.println("Es sind maximal 5 Personen erlaubt.");
        } 
        else {
            int individualCost = (nonStudents * 10) + (students * 7);

            int familyCost = 25;

            if (individualCost < familyCost) {
                System.out.println("Die guenstigste Option ist das individuelle Abo: " + individualCost + " Euro.");
            } 
            else {
                System.out.println("Die guenstigste Option ist das Familienabo: 25 Euro.");
            }
        }

        benutzerEingabe.close();
    }
}

