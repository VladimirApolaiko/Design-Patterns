package mediator;

/**
 * Created by vladimir on 11/7/16.
 */
public class User {

    public boolean isActive;

    private Mediator mediator;

    public void getMessage(String textMessage) {
        System.out.println(textMessage);
    }

    public void broadcastMessage(Message message) {
        mediator.broadcastMessage(message);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
