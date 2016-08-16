package td.spring.mvc.services.impl;

import org.springframework.stereotype.Service;

import td.spring.mvc.services.CalcService;

// Service annotation :
// Spring "@Component" : OK
// Spring "@Service"   : OK

@Service
public class CalcServiceImpl implements CalcService {

	public CalcServiceImpl() {
		super();
		System.out.println("Service constructor : " + this.getClass().getCanonicalName() );
	}
	
	public int add(int a, int b) {
		return a + b ;
	}
}
