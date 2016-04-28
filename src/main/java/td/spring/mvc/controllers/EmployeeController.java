package td.spring.mvc.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import td.spring.mvc.beans.Employee;

@RestController
//@Controller
public class EmployeeController {

	   public EmployeeController() {
	      super();
	      System.out.println("Controller constructor : " + this.getClass().getCanonicalName() );
	   }

	   @RequestMapping(value="/rest/employee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
//	   @ResponseBody
//	   public ResponseEntity<Employee> getEmployee () {
	   public Employee getEmployee () {
	      System.out.println("==> call 'getEmployee' ");
		
	      Employee employee =  new Employee();
	      employee.setId(1);
	      employee.setFirstName("Bart");			
	      employee.setLastName("Simpson");

//	      return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	      return employee ;
	   }

}
