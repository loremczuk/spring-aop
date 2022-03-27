package pl.oremczuk.aop;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

	public void logExecution (JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature());
	}
	

}
