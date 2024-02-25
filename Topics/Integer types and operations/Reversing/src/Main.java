import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int originNumber = scanner.nextInt();
        int newNumber, modulo, result = 0;
        while(originNumber > 0) {
            modulo= originNumber % 10;
            result = (result * 10) + modulo;
            originNumber = originNumber / 10;
        }
        System.out.println(result);

    }
}