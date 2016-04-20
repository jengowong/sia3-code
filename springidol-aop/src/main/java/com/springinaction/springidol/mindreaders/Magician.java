package com.springinaction.springidol.mindreaders;

import com.springinaction.springidol.mindreaders.MindReader;

/**
 * 读心者：魔术师
 */
public class Magician implements MindReader {
    private String thoughts;

    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}