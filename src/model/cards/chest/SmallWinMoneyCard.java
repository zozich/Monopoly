package model.cards.chest;

import model.cards.Card;
import model.game.Game;
import model.game.User;

public class SmallWinMoneyCard extends Card {

  public SmallWinMoneyCard() {
    super("You are lucky! You have won money");
  }

  @Override
  public void executeAction(Game game, User user) {
    // add some money
  }
}
