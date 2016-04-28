package td.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	   public HelloWorldController() {
	      super();
	      System.out.println("Controller constructor : " + this.getClass().getCanonicalName() );
	   }

	   @RequestMapping("/helloworld")
	   //public String hello ( ModelMap model ) {
	   public String hello () {
	      System.out.println("==> call 'helloworld'");
		
	      // model.addAttribute("message", "Message from 'demo' controller");
			
	      return "helloworld" ;
	   }

}
