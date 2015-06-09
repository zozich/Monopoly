package model.cards.chance;

import model.cards.Card;
import model.game.Game;
import model.game.User;

public class LoseMoneyCard extends Card {

  public LoseMoneyCard() {
    super("Bad luck! You have lost some money");
  }

  @Override
  public void executeAction(Game game, User user) {
    // deduct some money from the account
  }
}
