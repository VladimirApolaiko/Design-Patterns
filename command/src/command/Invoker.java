package command;

/**
 * Created by vladimir on 10/26/16.
 */
public class Invoker {
    public void invokeWithTimer(Command command, long time) throws InterruptedException {
        new Thread(() -> {
            try {
                Thread.sleep(time);
                command.execute();
            } catch (InterruptedException e) {
                return;
            }
        }).start();

    }

    public void invokeWithPeriod(Command command, long period) throws InterruptedException {
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(period);
                    command.execute();
                } catch (InterruptedException e) {
                    break;
                }
            }
        }).start();

    }
}
