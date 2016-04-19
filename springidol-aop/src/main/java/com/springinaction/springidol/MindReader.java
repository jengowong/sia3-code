package com.springinaction.springidol;

/**
 * 读心者
 */
public interface MindReader {
    void interceptThoughts(String thoughts);

    String getThoughts();
}