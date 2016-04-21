package com.springinaction.springidol.audiences;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 观众，含有环绕通知方法
 */
@Aspect
public class AroundAudience {

    @Pointcut("execution(* com.springinaction.springidol.performers.Performer.perform(..))")
    public void performance() {
    }

    //<start id="audience_around_bean" />
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");

            long start = System.currentTimeMillis();
            joinPoint.proceed();
            long end = System.currentTimeMillis();

            System.out.println("CLAP CLAP CLAP CLAP CLAP");

            System.out.println("The performance took " + (end - start) + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
    //<end id="audience_around_bean" />
}
