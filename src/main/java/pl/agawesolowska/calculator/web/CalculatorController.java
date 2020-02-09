package pl.agawesolowska.calculator.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.agawesolowska.calculator.service.CalculatorLogic;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

	@Autowired
	private CalculatorLogic calculatorLogic;

	@GetMapping
	public String calculatorGetMethod() {
		return "calculator.jsp";
	}

	@PostMapping
	public String calculatorPostMethod(Model model, @RequestParam("firstNumber") long firstNumber,
			@RequestParam("secondNumber") long secondNumber, @RequestParam("action") String action) {
		long result = calculatorLogic.calculateResult(firstNumber, secondNumber, action);
		model.addAttribute("result", result);
		return "calculator.jsp";
	}

	@GetMapping("/history")
	public String operationsHistory(Model model) {
		model.addAttribute("listOfActions", calculatorLogic.getOperationsHistory());
		return "history.jsp";
	}

}
