package book.com.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAdvice {
	private static final Log LOG = LogFactory.getLog(BookAdvice.class);

	@Before("execution(* *.com.book.controller.LoginController.*(..))")
	public void traceBeforeLoginControllerMethods(JoinPoint joinpoint) {
		LOG.debug(" Entered inside : " + joinpoint.getSignature());
	}

	@After("execution(* *.com.book.controller.LoginController.*(..))")
	public void traceAfterLoginControllerMethods(JoinPoint joinpoint) {
		LOG.debug(" Finished : " + joinpoint.getSignature());
	}
}
