package com.springinaction.knights.bean.impl;

import com.springinaction.knights.bean.Knight;
import com.springinaction.knights.bean.Quest;
import com.springinaction.knights.bean.QuestException;

public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;       //<co id="co_injectedQuest"/>
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
