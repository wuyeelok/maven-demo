package com.kenneth;

public class Calculator {
	
	CalculatorService service;
	
	
	public Calculator(CalculatorService service) {		
		this.service = service;
	}
	
	public int perform(int i, int j) {	// 2, 3 => (2 + 3) * 2
		return service.add(i, j) * i;
	}
}
