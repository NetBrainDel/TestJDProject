package com.noirix.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.TimerTask;

@Component
@Aspect
public class LoggingAspect {


    private static final Logger log = Logger.getLogger(LoggingAspect.class);

    private static final Logger log1 = Logger.getLogger(LoggingAspect.class);
//
//    @Before("aroundRepositoryPointcut()")
//    public void logBefore(JoinPoint joinPoint) {
//        log.info("Method " + joinPoint.getSignature().getName() + " start");
//    }
//
//       @AfterReturning(pointcut = "aroundRepositoryPointcut()")
//    public void doAccessCheck(JoinPoint joinPoint) {
//       log.info("Method " + joinPoint.getSignature().getName() + " finished");
//    }
//
@Pointcut("execution(* com.noirix.repository.impl.UserRepositoryJdbcTemplateImpl.*(..))")
public void aroundRepositoryPointcut() {
}

    @Pointcut("execution(* com.noirix.repository.impl.CarRepositoryJdbcTemplateImpl.*(..))")
    public void aroundRepositoryPointcuts(){
    }

    @Around("aroundRepositoryPointcuts()")
    public Object logAroundMethod (ProceedingJoinPoint joinPoint) throws Throwable {


        log1.info("Method " + joinPoint.getSignature().getName() + " start cars");
        Object proceed = joinPoint.proceed();
        log1.info("Method " + joinPoint.getSignature().getName() + " finished cars");
        return proceed;
    }


    @Around("aroundRepositoryPointcut()")
    public Object logAroundMethods(ProceedingJoinPoint joinPoint) throws Throwable {

        //Use StopWatch

        log.info("Method " + joinPoint.getSignature().getName() + " start users");
        Object proceed = joinPoint.proceed();
        log.info("Method " + joinPoint.getSignature().getName() + " finished users");
        return proceed;
    }

}
