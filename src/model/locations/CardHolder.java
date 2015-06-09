package model.locations;

import model.cards.Card;
import model.cards.Deck;
import model.game.Game;
import model.game.User;

public class CardHolder implements Location {

  private Deck deck;

  public CardHolder(Deck deck) {
    this.deck = deck;
  }

  @Override
  public void executeAction(Game game, User user) {
    Card card = deck.getCard();
    card.executeAction(game, user);
  }
}
