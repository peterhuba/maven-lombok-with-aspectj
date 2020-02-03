package com.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SetterAspect {

    @Around(value = "execution(* com.test.entity.*.set*(..))")
    public void checkBeforeCallingSetter(ProceedingJoinPoint joinPoint) throws Throwable {
        Object valueToBeSet = joinPoint.getArgs()[0];

        if (valueToBeSet != null && isNotEmpty(valueToBeSet)) {
            joinPoint.proceed();
        }
        ;
    }

    private boolean isNotEmpty(Object valueToBeSet) {
        if (valueToBeSet instanceof String) {
            return !"".equals(valueToBeSet);
        } else {
            return true;
        }
    }
}
