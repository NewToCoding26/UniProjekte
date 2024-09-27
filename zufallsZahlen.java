import java.util.Random;

public class zufallsZahlen {
    public static void main(String[] args) {
        Random einsBisSechs = new Random();
        int x = einsBisSechs.nextInt(7);
        System.out.println("Zufallszahl von 1-6: " +x);
    }
}
