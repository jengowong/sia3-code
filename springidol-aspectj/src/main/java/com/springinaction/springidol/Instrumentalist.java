package com.springinaction.springidol;

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
