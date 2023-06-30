package lesson7.service;

import lesson7.model.ComplexNumber;
import lesson7.model.CustomLogger;

public class OperationServiceMultiplicationImpl implements OperationService{
    @Override
    public ComplexNumber calculateResult(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        ComplexNumber res =  new ComplexNumber(
                complexNumber1.getReal() * complexNumber2.getReal() - complexNumber1.getImaginary()*complexNumber2.getImaginary(),
                complexNumber1.getReal() * complexNumber2.getImaginary() + complexNumber1.getImaginary() * complexNumber2.getReal());
        CustomLogger logger = new CustomLogger();
        logger.writeLog("Умножение успешно выполнено");

        return res;
    }
}
