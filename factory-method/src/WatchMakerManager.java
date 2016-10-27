import watch_creator.impl.DigitalWatchCreator;
import watch_creator.impl.RomeWatchCreator;
import watch_creator.WatchCreator;

import java.util.HashMap;
import java.util.Map;

public class WatchMakerManager {
    private Map<String, WatchCreator> creators = new HashMap<>();

    public WatchMakerManager() {
        creators.put("Digital", new DigitalWatchCreator());
        creators.put("Rome", new RomeWatchCreator());
    }

    public WatchCreator getWatchCreatorByName(String name) {
        return creators.get(name);
    }
}
