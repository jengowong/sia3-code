package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 观众，含有环绕通知方法
 */
public class AroundAudience {
    //<start id="audience_around_bean"/>
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis(); //<co id="co_beforeProceed"/>

            joinPoint.proceed(); //<co id="co_proceed"/>

            long end = System.currentTimeMillis(); // <co id="co_afterProceed"/>
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start) + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!"); //<co id="co_afterException"/>
        }
    }
    //<end id="audience_around_bean"/>
}
