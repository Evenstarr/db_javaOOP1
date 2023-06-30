package lesson7.service;

import lesson7.model.ComplexNumber;
import lesson7.model.CustomLogger;

import static java.lang.Math.pow;

public class OperationServiceDivisionImpl implements OperationService{

    @Override
    public ComplexNumber calculateResult(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        ComplexNumber res = new ComplexNumber(
                (complexNumber1.getReal() * complexNumber2.getReal() + complexNumber1.getImaginary() * complexNumber2.getImaginary()) /
                        (pow(complexNumber2.getReal(), 2) + pow(complexNumber2.getImaginary(), 2)),
                (complexNumber2.getReal() * complexNumber1.getImaginary() - complexNumber1.getReal()*complexNumber2.getImaginary()) /
                        (pow(complexNumber2.getReal(), 2) + pow(complexNumber2.getImaginary(), 2))
        );
        CustomLogger logger = new CustomLogger();
        logger.writeLog("Успешно выполнено деление");
        return res;
    }
}
