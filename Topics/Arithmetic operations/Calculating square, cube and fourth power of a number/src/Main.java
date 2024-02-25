import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt();

        // Compute and print the square of n
        int square ;
        System.out.println(n * n);


        // Compute and print the cube of n
        int cube;
        System.out.println(n * n * n);

        // Compute and print the fourth power of n
        int fourthPower;
        System.out.println(n * n * n * n);
    }
}