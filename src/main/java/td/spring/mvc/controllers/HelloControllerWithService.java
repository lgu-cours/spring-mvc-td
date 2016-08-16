package td.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import td.spring.mvc.services.HelloService;

@Controller
public class HelloControllerWithService {

	@Autowired
	HelloService helloService ;
	
	public HelloControllerWithService() {
		super();
		System.out.println("Controller constructor : " + this.getClass().getCanonicalName() );
	}
	
	@RequestMapping("/hello2")
	public String hello (ModelMap model, @RequestParam(value="name", defaultValue="") String name ) {
		System.out.println("==> call 'hello2' name = '" + name + "'");
		
		String s = helloService.hello(name);
		
		model.addAttribute("name", s);
			
		return "hello" ;
	}
	
	@RequestMapping("/hello2/{name}")
	public String hello2 (ModelMap model, @PathVariable("name") String name ) {
		System.out.println("==> call 'hello2/{name}' name = '" + name + "'");
		
		String s = helloService.hello(name);
		model.addAttribute("name", s);
			
		return "hello" ;
	}
}
