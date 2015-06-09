package model.cards;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

  private List<Card> cards = new LinkedList<>();

  public void addCard(Card card) {
    cards.add(card);
  }

  public void addAllCards(Card... cards) {
    Collections.addAll(this.cards, cards);
  }

  public Card getCard() {
    Card card = cards.remove(0);
    cards.add(card);
    return card;
  }

  public void shuffleCards() {
    Collections.shuffle(cards);
  }
}
