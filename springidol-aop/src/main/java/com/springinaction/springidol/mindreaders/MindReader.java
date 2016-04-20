package com.springinaction.springidol.mindreaders;

/**
 * 读心者
 */
public interface MindReader {
    void interceptThoughts(String thoughts);

    String getThoughts();
}