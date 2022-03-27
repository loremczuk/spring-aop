package pl.oremczuk.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.oremczuk.aop.package1.AnotherBean;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		
		SomeBean someBean = context.getBean("someBean", SomeBean.class);
		AnotherBean anotherBean = context.getBean("anotherBean", AnotherBean.class);
		
		someBean.setSomething(null);
		someBean.setAnotherThing(null);
		someBean.getSomething();
		someBean.nextMethod();
		someBean.setYetAnotherFields(null, null);
		someBean.setSomeInt(0);
		someBean.getSomeInt();
		
		anotherBean.setSomething(null);
		anotherBean.setAnotherThing(null);
		anotherBean.getSomething();
		anotherBean.nextMethod();
		anotherBean.setYetAnotherFields(null, null);
		anotherBean.setSomeInt(0);
		anotherBean.getSomeInt();
		
		
		
	}

}
