package lesson2;

import java.util.HashMap;
import java.util.Map;

class Calculator {
    private final Map<Character, Operation> operationMap = new HashMap<>();
    Calculator() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    double calculate(double operand1, double operand2, char operation) {
        Operation operationMapValue = operationMap.getOrDefault(operation,new NoOperationFound(operation));
        return operationMapValue.calculateResult(operand1, operand2);
    }
}
