import watch.Watch;
import watch_creator.WatchCreator;

public class Main {
    public static void main(String[] args) {
        WatchMakerManager makerManager = new WatchMakerManager();

        WatchCreator creator = makerManager.getWatchCreatorByName("Digital");
        if (creator == null) {
            System.out.println("Watch creator not found");
            return;
        }

        Watch watch = creator.createWatch();
        watch.showTime();

    }
}
