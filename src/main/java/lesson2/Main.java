package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Напишите 2 числа и знак между ними через пробелы, например, 2 + 3: ");
        char operator = 0;
        double operand1 = 0;
        double operand2 = 0;
        try {
            operand1 = scanner.nextDouble();
            operator = scanner.next().charAt(0);
            operand2 = scanner.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Неверный ввод");
        }
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(operand1, operand2, operator));
    }
}
