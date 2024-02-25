import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int seconde = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int seconde2 = scanner.nextInt();
        final int secondeByHour = 3600;
        final int secondeByMinute = 60;
        
        int sum1 = hour * secondeByHour + minute * secondeByMinute + seconde;
        int sum2 = hour2 * secondeByHour + minute2 * secondeByMinute + seconde2;

        System.out.println(sum2 - sum1);
    }
}
