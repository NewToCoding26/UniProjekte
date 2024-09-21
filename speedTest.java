public class speedTest {
    public static void main(String[] args) {
        int speed = Integer.parseInt(args[0]);
        if (speed <= 10) {
            System.out.println("Sie sind :" +speed +"kmh zu schnell gefahren und zahlen 30 Euro Strafe");
        }
        else if (speed >= 11 && speed <= 15) {
            System.out.println("Sie sind :" +speed +"kmh zu schnell gefahren und zahlen 50 Euro Strafe");
        }
        else if (speed >= 16 && speed <= 20) {
            System.out.println("Sie sind :" +speed +"kmh zu schnell gefahren und zahlen 70 Euro Strafe");
        }
        else if (speed >= 21 && speed <= 25) {
            System.out.println("Sie sind :" +speed +"kmh zu schnell gefahren und zahlen 115 Euro Strafe");
        }
        else if (speed > 26) {
            System.out.println("Sie sind :" +speed +"kmh zu schnell gefahren und zahlen 180 Euro Strafe, 1 Punkt & 1 M0nat Fahrverbot");
        }
    }
}
