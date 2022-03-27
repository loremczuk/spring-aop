package pl.oremczuk.aop;

import java.lang.reflect.Modifier;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());

	public void logExecution() {
		logger.info("Method executing");
	}
	
	public void warnIfNull(Object returnedValue) {
		if (returnedValue == null) {
			logger.warn("The returned value is null");
		}
	}
	
	public void serveException (RuntimeException exception) {
		logger.error("Exception: " + exception.getMessage());
	}
	
	public void methodExecuted(JoinPoint joinPoint) {
		joinPoint.getKind();
		joinPoint.getTarget();
		joinPoint.getThis();
		joinPoint.getSignature().toLongString();
		joinPoint.getSignature().toShortString();
		joinPoint.getArgs();
		joinPoint.getSignature().getModifiers();
		Modifier.isPublic(joinPoint.getSignature().getModifiers());
		Modifier.isStatic(joinPoint.getSignature().getModifiers());
		Modifier.toString(joinPoint.getSignature().getModifiers());
		
		logger.info("Method " + joinPoint.getSignature().getName() +  " has been executed");
	}
	
}
