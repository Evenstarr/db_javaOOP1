package lesson7.controller;

import lesson7.model.ComplexNumber;
import lesson7.model.CustomLogger;
import lesson7.service.*;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    private final Map<Character, OperationService> operationMap = new HashMap<>();
    public Calculator() {
        operationMap.put('+', new OperationServiceAdditionImpl());
        operationMap.put('-', new OperationServiceSubtractionImpl());
        operationMap.put('*', new OperationServiceMultiplicationImpl());
        operationMap.put('/', new OperationServiceDivisionImpl());
    }

    public ComplexNumber calculate() {
        ComplexNumber operand1 = new ComplexNumber(0, 0);
        ComplexNumber operand2 = new ComplexNumber(0, 0);
        CustomLogger logger = new CustomLogger();
        try {
            operand1 = new ComplexNumber(inputNumber("real: "), inputNumber("imaginary: "));
        } catch (InputMismatchException e) {
            logger.writeLog("Неверный ввод первого числа");
        }

        char operation = inputOperation("operation: ");
        try {
            operand2 = new ComplexNumber(inputNumber("real: "), inputNumber("imaginary: "));
        } catch (InputMismatchException e) {
            logger.writeLog("Неверный ввод второго числа");
        }

        OperationService operationMapValue = operationMap.getOrDefault(operation,new NoOperationFoundImpl(operation));
        return operationMapValue.calculateResult(operand1, operand2);
    }

    public double inputNumber(String message){
        System.out.printf("%s", message);
        return scanner.nextDouble();
    }
    public char inputOperation(String message){
        System.out.printf("%s", message);
        return scanner.next(".").charAt(0);
    }
}
