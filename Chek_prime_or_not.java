package chat_gpt_100_projects;

public class Chek_prime_or_not {

	public static void main(String[] args) {

        // Loop through numbers from 2 to 100
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // Check if i is divisible by any number from 2 to i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
