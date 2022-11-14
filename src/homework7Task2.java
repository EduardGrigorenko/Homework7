import java.util.Scanner;

public class homework7Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 == 36 && number2 == 17) {
            System.out.println("Jackpot");
        } else if ( number1 != 36 && number2 == 17) {
            System.out.println("Выграло одно число");
        } else if (number1 == 36 &&  number2 != 17) {
            System.out.println("Выграло одно число");
        }
        if (number1 != 36 &&  number2 != 17) {
            System.out.println("Все проиграл");
        }
    }
}

