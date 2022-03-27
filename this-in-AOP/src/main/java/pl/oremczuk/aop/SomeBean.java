package pl.oremczuk.aop;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {

	public void method1() {
		this.method2();
	}
	
	public void method2() {
		
	}
	
}
