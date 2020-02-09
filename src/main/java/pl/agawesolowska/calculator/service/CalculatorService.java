package pl.agawesolowska.calculator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorLogic {

	private List<String> operationsHistory = new ArrayList<>();

	@Override
	public long calculateResult(long firstNumber, long secondNumber, String action) {
		getOperationsHistory().add(String.format("%d %s %d", firstNumber, action, secondNumber));
		switch (action) {
		case "+":
			return firstNumber + secondNumber;
		case "-":
			return firstNumber - secondNumber;
		case "*":
			return firstNumber * secondNumber;
		case "/":
			return firstNumber / secondNumber;
		default:
			return 0;
		}
	}

	@Override
	public List<String> getOperationsHistory() {
		return operationsHistory;
	}
}
