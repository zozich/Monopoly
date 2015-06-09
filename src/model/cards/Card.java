package model.cards;

import model.game.Game;
import model.game.User;

public abstract class Card {

  private String description;

  public Card(String description) {
    this.description = description;
  }

  public abstract void executeAction(Game game, User user);
}
