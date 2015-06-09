import factories.GameFactory;
import model.game.Game;
import model.game.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // initialize users
    User user1 = new User("Vasya");
    User user2 = new User("Petya");
    User user3 = new User("Kolya");
    List<User> users = new ArrayList<User>();
    Collections.addAll(users, user1, user2, user3);

    //create new game
    Game testClassicGame = GameFactory.initClassicGame(users);

    // go go go!
    testClassicGame.startGame();
  }
}
