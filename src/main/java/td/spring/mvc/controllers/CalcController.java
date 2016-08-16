package td.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import td.spring.mvc.services.CalcService;

@Controller
public class CalcController {

	@Autowired
	CalcService calcService ;
	
	public CalcController() {
		super();
		System.out.println("Controller constructor : " + this.getClass().getCanonicalName() );
	}
	
	@RequestMapping("/calc/add")
	public String hello (ModelMap model, 
			@RequestParam(value="p1", defaultValue="0") int p1,
			@RequestParam(value="p2", defaultValue="0") int p2 ) {
		System.out.println("==> call 'add' : p1 = '" + p1 + ", p2 = " +p2);
		
		int r = calcService.add(p1, p2);
		
		model.addAttribute("p1", p1);
		model.addAttribute("p2", p2);
		model.addAttribute("result", r);
			
		return "calc" ;
	}

}
