package com.springinaction.knights.bean.impl;

import com.springinaction.knights.bean.Quest;
import com.springinaction.knights.bean.QuestException;

public class SlayDragonQuest implements Quest {

    public void embark() throws QuestException {
        System.out.println("Slaying Dragon!");
    }

}
