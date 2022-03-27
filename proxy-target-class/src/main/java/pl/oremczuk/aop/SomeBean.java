package pl.oremczuk.aop;

import org.springframework.stereotype.Component;

@Component
public class SomeBean implements SomeBeanInterface {

	
	public String someMethod() {
		return "some value";
	}
	
}
