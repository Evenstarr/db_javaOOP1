package lesson2;

import java.util.InputMismatchException;

public class NoOperationFound implements Operation {
    private final char sign;
    public NoOperationFound(char sign){
        this.sign = sign;
    }

    @Override
    public double calculateResult(double left, double right) {
        throw new InputMismatchException("Неверная операция: " + sign);
    }
}
