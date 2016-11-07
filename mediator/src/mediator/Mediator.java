package mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    public List<User> users = new ArrayList<>();


    public Mediator(List<User> users) {
        this.users = users;
    }

    public Mediator() {
    }

    public void broadcastMessage(Message message) {
        users.stream()
                .filter(user -> user.isActive == message.toActiveUsers)
                .forEach(user -> user.getMessage(message.messageText));
    }

    public void addUser(User user) {
        user.setMediator(this);
        users.add(user);
    }

    public void addUsers(List<User> users) {
        users.forEach(user -> user.setMediator(this));
        this.users.addAll(users);
    }
}
