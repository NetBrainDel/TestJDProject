//package com.noirix.aspect;
//
//import org.apache.log4j.Logger;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class LoggingAspect {
//
//    private static final Logger log = Logger.getLogger(LoggingAspect.class);
//    private static final Logger log1 = Logger.getLogger(LoggingAspect.class);
//
////    @Before("aroundRepositoryPointcut()")
////    public void logBefore(JoinPoint joinPoint) {
////        log.info("Method " + joinPoint.getSignature().getName() + " start");
////    }
////
////       @AfterReturning(pointcut = "aroundRepositoryPointcut()")
////    public void doAccessCheck(JoinPoint joinPoint) {
////       log.info("Method " + joinPoint.getSignature().getName() + " finished");
////    }
//
//    @Pointcut("execution(* com.noirix.repository.impl.UserRepositoryJdbcTemplateImpl.*(..))")
//    public void aroundRepositoryPointcut() {
//    }
//
//    @Pointcut("execution(* com.noirix.repository.impl.CarRepositoryJdbcTemplateImpl.*(..))")
//    public void aroundRepositoryPointcuts(){
//    }
//
//    @Around("aroundRepositoryPointcuts()")
//    public Object logAroundMethod (ProceedingJoinPoint joinPoint) throws Throwable {
//
//
//        log1.info("Method " + joinPoint.getSignature().getName() + " start");
//        Object proceed = joinPoint.proceed();
//        log1.info("Method " + joinPoint.getSignature().getName() + " finished");
//        return proceed;
//    }
//
//
//    @Around("aroundRepositoryPointcut()")
//    public Object logAroundMethods(ProceedingJoinPoint joinPoint) throws Throwable {
//
//
//        log.info("Method " + joinPoint.getSignature().getName() + " start");
//        Object proceed = joinPoint.proceed();
//        log.info("Method " + joinPoint.getSignature().getName() + " finished");
//        return proceed;
//
//
//    }
//
//}
