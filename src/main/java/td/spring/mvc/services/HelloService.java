package td.spring.mvc.services;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

	public HelloService() {
		super();
		System.out.println("Service constructor : " + this.getClass().getCanonicalName() );
	}

	public String hello(String name) {
		return "Hello " + name ;
	}
}
