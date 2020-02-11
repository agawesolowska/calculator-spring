package pl.agawesolowska.calculator.service;

import java.util.List;

/**
 * Interface representing the calculator logic.
 * 
 * @author Aga
 *
 */
public interface CalculatorLogic {

	long calculateResult(long firstNumber, long secondNumber, String action);

	List<String> getOperationsHistory();

}
