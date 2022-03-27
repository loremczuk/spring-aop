package pl.oremczuk.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	Logger logger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* *(..))")
	public void allMethods() {}
	
	@Pointcut("@target(pl.oremczuk.aop.BusinessClass)")
	public void annotatedBusinessClass() {}
	
	@Pointcut("@annotation(pl.oremczuk.aop.BusinessMethod)")
	public void annotatedBusinessMethods() {}
	
	@Pointcut("@target(org.springframework.stereotype.Component)")
	public void annotatedComponents() {}
	
	@Pointcut("bean(some*)")
	public void annotatedSomeBean() {}
	

//	@Before("execution(* *(..))")
	@Before("allMethods()")
	public void logBefore(JoinPoint joinPoint) {

		logger.info("Before executing: " + joinPoint.getSignature().getName());

	}

	@After("allMethods()")
	public void logAfter(JoinPoint joinPoint) {

		logger.info("After executing: " + joinPoint.getSignature().getName());

	}

	@AfterReturning(pointcut="allMethods()", returning = "returnedValue")
	public void logAfterReturning(Object returnedValue) {
		logger.info("Returning: " + returnedValue);

	}

	@AfterThrowing(pointcut="allMethods()", throwing = "exception")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
		logger.info("Method " + joinPoint.getSignature().getName() + " has thrown " + exception);
	}

	@Around("allMethods()")
	public void logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		long start = System.currentTimeMillis();

		proceedingJoinPoint.proceed();

		long end = System.currentTimeMillis();
		logger.info("Execution time: " + (end - start) + "ms");
		
	}
	
//	w starszych wersjach trzeba by³o przekazaæ dalej zwracany rezultat, inaczej na konsoli by³by null
//  teraz Around wywo³ywuje siê na koñcu na konsoli, wczeœniej by³o jako drugie	
//	@Around("allMethods()")
//	public String logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//	long start = System.currentTimeMillis();
//
//
//	Object methodExecutionResult = proceedingJoinPoint.proceed();
//
//	long end = System.currentTimeMillis();
//	logger.info("Execution time: " + (end - start) + "ms");
//
//	return methodExecutionResult;
//	}

}
