package pl.oremczuk.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	Logger logger = Logger.getLogger(getClass().getName());
	
	@Before("execution(* *(..))")
	public void logBefore(JoinPoint joinPoint) {

		logger.info("Before executing: " + joinPoint.getSignature().getName());

	}

	

}
