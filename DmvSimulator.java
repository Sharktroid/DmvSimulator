import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the Department of Motor Vehicles");
        Random rng = new Random();
        int number = rng.nextInt(100) + 1;
        System.out.println(String.format("Here is your number: %d", number));
        System.out.println("Please wait for your number to be called.");
        for (int num = 0; num < 100; num++) {
            System.out.println(String.format("Number %d", ((num + number) % 100) + 1));
            Thread.sleep(100);
        }
        System.out.println("I\'m sorry, you don\'t have the required paperwork. Haha imagine waiting all this time for nothing!");
    }
}