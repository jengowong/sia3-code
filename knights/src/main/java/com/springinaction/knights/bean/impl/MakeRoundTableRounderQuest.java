package com.springinaction.knights.bean.impl;

import com.springinaction.knights.bean.Quest;
import com.springinaction.knights.bean.QuestException;

public class MakeRoundTableRounderQuest implements Quest {

    public void embark() throws QuestException {
        System.out.println("Making round table rounder");
    }

}
