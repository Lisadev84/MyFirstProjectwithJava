import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        boolean townSuffixe = town.endsWith("burg");
        System.out.println(townSuffixe);
    }
}