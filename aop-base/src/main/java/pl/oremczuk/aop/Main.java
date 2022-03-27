package pl.oremczuk.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean someBean = context.getBean("someBean", SomeBean.class);

		someBean.doSomething();
	}

}
