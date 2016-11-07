package mediator;

/**
 * Created by vladimir on 11/7/16.
 */
public class Message {
    public String messageText;
    public boolean toActiveUsers;

    public Message(String messageText, boolean toActiveUsers) {
        this.messageText = messageText;
        this.toActiveUsers = toActiveUsers;
    }
}
