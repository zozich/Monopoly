package model.cards.chest;

import model.cards.Card;
import model.game.Game;
import model.game.User;

public class BigWinMoneyCard extends Card {

  public BigWinMoneyCard() {
    super("Congratulations! You have found a chest with a pirate treasure");
  }

  @Override
  public void executeAction(Game game, User user) {
    // add money
  }
}
