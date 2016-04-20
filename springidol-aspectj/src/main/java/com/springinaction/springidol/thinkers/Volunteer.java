// <start id="volunteer_java" />
package com.springinaction.springidol.thinkers;

import com.springinaction.springidol.thinkers.Thinker;

/**
 * 思想家：志愿者
 */
public class Volunteer implements Thinker {

    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }

}
// <end id="volunteer_java" />
