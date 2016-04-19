package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 口吃
 */
public class Stutter {
    public Object stutter(ProceedingJoinPoint call) throws Throwable {
        call.proceed();
        call.proceed();
        call.proceed();
        call.proceed();
        call.proceed();
        call.proceed();
        call.proceed();
        call.proceed();
        return call.proceed();
    }
}
