package model.cards.chance;

import model.cards.Card;
import model.game.Game;
import model.game.User;

public class AdditionalMoveCard extends Card {

  public AdditionalMoveCard() {
    super("Move forward three steps");
  }

  @Override
  public void executeAction(Game game, User user) {
    user.doMove(game);
  }
}
