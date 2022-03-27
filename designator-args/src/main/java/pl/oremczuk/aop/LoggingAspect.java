package pl.oremczuk.aop;

import org.apache.log4j.Logger;

public class LoggingAspect {

	public void logWithStringExecution(Object arg) {

		System.out.println("Argument " + arg);
	}
	

}
