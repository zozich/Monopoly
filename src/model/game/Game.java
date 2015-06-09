package model.game;

import model.cards.Deck;
import model.dice.Dice;
import java.util.List;

public class Game {

  private List<User> users;
  private GameField gameField;
  private Deck chests;
  private Deck chance;
  private Dice dice1;
  private Dice dice2;
  private User winner;

  public Game(List<User> users, GameField gameField, Deck chests, Deck chance, Dice dice1, Dice dice2) {
    this.users = users;
    this.gameField = gameField;
    this.chests = chests;
    this.chance = chance;
    this.dice1 = dice1;
    this.dice2 = dice2;
  }

  public GameField getGameField() {
    return gameField;
  }
  public Deck getChests() {
    return chests;
  }
  public Deck getChance() {
    return chance;
  }
  public User getWinner() {
    return winner;
  }
  public Dice getDice1() {
    return dice1;
  }
  public Dice getDice2() {
    return dice2;
  }
  public List<User> getUsers() {
    return users;
  }

  public void startGame() {
    while (users.size() > 1) {
      for (User user : users) {
        user.doMove(this);
      }
    }
    winner = users.get(0);
    finishGame(winner);
  }

  private void finishGame(User winner) {
    // finish the game
  }
}
