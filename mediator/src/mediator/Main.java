package mediator;

import static java.util.Arrays.asList;

/**
 * Created by vladimir on 11/7/16.
 */
public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        //active users group
        User user1 = new User();
        user1.isActive = true;

        User user2 = new User();
        user2.isActive = true;

        User user3 = new User();
        user3.isActive = true;

        //Group inactive users
        User user4 = new User();
        user4.isActive = false;

        User user5 = new User();
        user5.isActive = false;

        User user6 = new User();
        user6.isActive = false;

        mediator.addUsers(asList(user1, user2, user3, user4, user5, user6));

        user1.broadcastMessage(new Message("Hello everybody who is active", true));
    }
}
