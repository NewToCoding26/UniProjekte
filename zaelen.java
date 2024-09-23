public class zaelen {
    public static void main(String[] args) {
        System.out.println("a) Alle Zahlen von 1 bis 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 

        int summe = 0;
        for (int i = 1; i <= 80; i++) {
            summe += i;
        }
        System.out.println("b) Die Summe aller Zahlen von 1 bis 80: " + summe);

        System.out.println("c) Zahlen zwischen 1 und 100, die durch 3 teilbar sind:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}

