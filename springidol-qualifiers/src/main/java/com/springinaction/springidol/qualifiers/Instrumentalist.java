package com.springinaction.springidol.qualifiers;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist implements Performer {
    public void perform() throws PerformanceException {
        getInstrument().play();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    //<start id="autowire_property" />
    @Autowired
    @StringedInstrument
    @Strummed
    private Instrument instrument;
    //<end id="autowire_property" />

}