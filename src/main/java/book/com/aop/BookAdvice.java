package book.com.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import book.com.controller.BookController;

@Aspect
public class BookAdvice {
	private static final Log LOG = LogFactory.getLog(BookController.class);

	@Before("execution(* *.book.com.controller.BookController.*(..))")
	public void traceBeforeControllerMethods(JoinPoint joinpoint) {
		LOG.debug(" Entered inside : " + joinpoint.getSignature());
		System.out.println("This is output");
	}

	@After("execution(* *.book.com.controller.BookController.*(..))")
	public void traceAfterControllerMethods(JoinPoint joinpoint) {
		LOG.debug(" Finished : " + joinpoint.getSignature());
	}

}
