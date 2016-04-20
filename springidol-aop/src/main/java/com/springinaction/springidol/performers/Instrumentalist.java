package com.springinaction.springidol.performers;

import com.springinaction.springidol.instruments.Instrument;
import com.springinaction.springidol.performers.PerformanceException;
import com.springinaction.springidol.performers.Performer;

/**
 * 乐器演奏家
 */
public class Instrumentalist implements Performer {

    private Instrument instrument;

    public void perform() throws PerformanceException {
        instrument.play();
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

}
