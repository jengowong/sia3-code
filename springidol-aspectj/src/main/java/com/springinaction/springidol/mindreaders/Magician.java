// <start id="magician_java" /> 
package com.springinaction.springidol.mindreaders;

import com.springinaction.springidol.mindreaders.MindReader;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader {

    private String thoughts;

    //<co id="co_parameterizedPointcut"/>
    @Pointcut("execution(* com.springinaction.springidol.thinkers.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {
    }

    @Before("thinking(thoughts)") //<co id="co_passInParameters"/>
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts : " + thoughts);
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }

}
// <end id="magician_java" />
