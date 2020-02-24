package pl.agawesolowska.calculator.web;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.agawesolowska.calculator.service.CalculatorService;

/**
 * The heart of app responding to HTTP queries.
 * 
 * @author Aga
 *
 */
@Controller
@RequestMapping("/calculator")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;

	@GetMapping
	public String calculatorGetMethod() {
		return "/calculator.jsp";
	}

	@PostMapping
	public String calculatorPostMethod(Model model, @NotNull @RequestParam("firstNumber") long firstNumber,
			@NotNull @RequestParam("secondNumber") long secondNumber, @RequestParam("action") String action) {
		long result = calculatorService.calculateResult(firstNumber, secondNumber, action);
		model.addAttribute("result", result);
		return "/calculator.jsp";
	}

	@GetMapping("/history")
	public String operationsHistory(Model model) {
		model.addAttribute("listOfActions", calculatorService.getOperationsHistory());
		return "/history.jsp";
	}

}
