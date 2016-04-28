package td.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	   public HelloController() {
	      super();
	      System.out.println("Controller constructor : " + this.getClass().getCanonicalName() );
	   }

	   @RequestMapping("/hello")
	   public String hello (ModelMap model, @RequestParam(value="name", defaultValue="") String name ) {
	      System.out.println("==> call 'hello' name = '" + name + "'");
		
	      model.addAttribute("name", name);
			
	      return "hello" ;
	   }

	   @RequestMapping("/hello/{name}")
	   public String hello2 (ModelMap model, @PathVariable("name") String name ) {
	      System.out.println("==> call 'hello/{name}' name = '" + name + "'");
		
	      model.addAttribute("name", name);
			
	      return "hello" ;
	   }
}
