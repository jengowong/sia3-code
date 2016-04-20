package com.springinaction.springidol;

import com.springinaction.springidol.contestants.Contestant;
import com.springinaction.springidol.contestants.GraciousContestant;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {

    @DeclareParents( //<co id="co_declareParents"/>
            value = "com.springinaction.springidol.performers.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;

}
