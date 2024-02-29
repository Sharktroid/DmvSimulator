import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Department of Motor Vehicles");
        Random rng = new Random();
        int number = rng.nextInt(100) + 1;
        System.out.println(String.format("Here is your number: %d", number));
        System.out.println("Please wait for your number to be called.");
    }
}