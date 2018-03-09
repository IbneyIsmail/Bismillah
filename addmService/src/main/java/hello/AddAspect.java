package hello;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AddAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	//Weaving & Weaver
	@Before("execution(* hello.*.*(..))")
	public void before(JoinPoint joinPoint){
		//Advice
		logger.info("  " + joinPoint.getKind());
		logger.info("  " + joinPoint.getTarget());
		logger.info(" Allowed execution for {}", joinPoint);
	}
}