package pl.agawesolowska.calculator.service;

import java.util.List;

public interface CalculatorLogic {

	public long calculateResult(long firstNumber, long secondNumber, String action);

	public List<String> getOperationsHistory();

}
