package watch_creator.impl;

import watch.Watch;
import watch.impl.RomeWatch;
import watch_creator.WatchCreator;

public class RomeWatchCreator implements WatchCreator {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
