package com.springinaction.knights.bean.impl;

import com.springinaction.knights.bean.Knight;
import com.springinaction.knights.bean.QuestException;

public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        quest = new RescueDamselQuest(); //<co id="co_coupledToQuest"/>
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
