package com.springinaction.knights.bean.impl;

import com.springinaction.knights.bean.Quest;
import com.springinaction.knights.bean.QuestException;

public class RescueDamselQuest implements Quest {

    public void embark() throws QuestException {
        System.out.println("Rescuing damsel in distress");
    }

}
