package MyAdvice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationAspectj {
    @Before("execution(* service.*.*(..))")
    public void before(){
        System.out.println("before");
    }
    @After("execution(* service.*.*(..))")
    public void after(){
        System.out.println("after");
    }
    @Around("execution(* service.*.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around before");
        point.proceed();
        System.out.println(point.getSignature());
        System.out.println("around after");
    }
}
