package model.cards.chance;

import model.cards.Card;
import model.game.Game;
import model.game.User;

public class HappyBirthdayCard extends Card {

  public HappyBirthdayCard() {
    super("Congratulations! Today is your birthday. Each player presents you 10$");
  }

  @Override
  public void executeAction(Game game, User user) {
    for (User allUsers : game.getUsers()) {
      if (allUsers != user) {
        // transfer some money
      }
    }
  }
}
