package model.cards.chance;

import model.cards.Card;
import model.game.Game;
import model.game.User;

public class LotteryCard extends Card {

  public LotteryCard() {
    super("Do you wish to test your luck?");
  }

  @Override
  public void executeAction(Game game, User user) {
    // user has an option to test his luck and either win or lose money
  }
}
