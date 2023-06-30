package lesson7.service;

import lesson7.model.ComplexNumber;
import lesson7.model.CustomLogger;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class NoOperationFoundImpl implements OperationService{
    private final char sign;
    public NoOperationFoundImpl(char sign){
        this.sign = sign;
    }

    @Override
    public ComplexNumber calculateResult(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        CustomLogger logger = new CustomLogger();
        logger.writeLog("Неверная операция: " + sign);
        throw new InputMismatchException("Неверная операция: " + sign);
    }
}
