package watch_creator.impl;

import watch.Watch;
import watch.impl.DigitalWatch;
import watch_creator.WatchCreator;

public class DigitalWatchCreator implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
