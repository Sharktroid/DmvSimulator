import java.util.Random;

public class DmvSimulator {

    private static final int numbers = 200;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the Department of Motor Vehicles");
        Random rng = new Random();
        int number = rng.nextInt(numbers) + 1;
        System.out.printf("Here is your number: %d%n", number);
        System.out.println("Please wait for your number to be called.");
        for (int num = 0; num < numbers; num++) {
            System.out.printf("Number %d%n", ((num + number) % numbers) + 1);
            Thread.sleep(100);
        }

        if (rng.nextInt(100) == 0) {
            System.out.println("You have all of the required paperwork. You are all set!");
        }
        else {
            System.out.println("I'm sorry, you don't have the required paperwork. Haha, imagine waiting all this time for nothing!\nMuhhahahahahahahahaahhahahahaha");
        }
    }
}