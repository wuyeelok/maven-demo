package com.kenneth;

import java.util.List;

public class Calculator {
	
	CalculatorService service;
	
	
	public Calculator(CalculatorService service) {		
		this.service = service;
	}
	
	public int perform(int i, int j) {	// 2, 3 => (2 + 3) * 2
		return service.add(i, j) * i;
		//	return (2 + 3) * 2;
	}

	public Integer sumIntTotal(List<Integer> list) {
		if(!list.isEmpty()) {
			return list.stream().reduce(Integer::sum).get();
		} else {
			return 0;
		}		
	}
}
