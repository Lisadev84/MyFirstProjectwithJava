package calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

//        System.out.println("Prices: ");
//        System.out.println("Bubblegum: $2 ");
//        System.out.println("Toffee: $0.2");
//        System.out.println("Ice cream: $5");
//        System.out.println("Milk chocolate: $4");
//        System.out.println("Doughnut: $2.5");
//        System.out.println("Pancake: $3.2");
//
        System.out.println("Earned amount: ");
        System.out.println("Bubblegum: $202 ");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        System.out.println("");
        System.out.println("Income : $5405.0");

        System.out.println("Enter your staff expenses"  );
        int staffExpenses = scanner.nextInt();
        System.out.println("Enter your other expenses"  );
        int otherExpenses = scanner.nextInt();
        String totalExpenses = String.format("Staff expenses:%n%d%nOther expenses:%n%d",
                staffExpenses,
                otherExpenses);
        System.out.println(totalExpenses);

        int income = 5405;
        int netIncome = income - (staffExpenses + otherExpenses);
        System.out.printf("Net income: $%d", netIncome);
    }
}