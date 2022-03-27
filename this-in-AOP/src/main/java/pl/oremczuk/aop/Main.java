package pl.oremczuk.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfirguration.class);

		SomeBean someBean = context.getBean("someBean", SomeBean.class);

		someBean.method1();
		someBean.method2();

	}
}
