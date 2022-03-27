package pl.oremczuk.aop;

import org.springframework.stereotype.Component;

@Component
@BusinessClass
public class SomeBean {

	@BusinessMethod
	public String someMethod() {
		return "some value";
	}
	
	public void throwSomeException () {
		throw new RuntimeException();
	}
}
