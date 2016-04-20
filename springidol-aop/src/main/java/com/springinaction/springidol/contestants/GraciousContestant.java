package com.springinaction.springidol.contestants;

import com.springinaction.springidol.contestants.Contestant;

/**
 * 高尚的参赛人
 */
public class GraciousContestant implements Contestant {

    public void receiveAward() {
        System.out.println("Why, thank you all very much!");
    }
}
