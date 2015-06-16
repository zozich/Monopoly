package model.game;

import user_interface.UserInterface;
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
  private int currentUserIndex = 0;
  private User winner;
  private UserInterface userInterface;

  public Game(List<User> users, GameField gameField, Deck chests, Deck chance, Dice dice1, Dice dice2, UserInterface userInterface) {
    this.users = users;
    this.gameField = gameField;
    this.chests = chests;
    this.chance = chance;
    this.dice1 = dice1;
    this.dice2 = dice2;
    this.userInterface = userInterface;
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
  public Dice getDice1() {
    return dice1;
  }
  public Dice getDice2() {
    return dice2;
  }
  public List<User> getUsers() {
    return users;
  }
  public UserInterface getUserInterface() {
    return userInterface;
  }

  public void startGame() {
    nextMove();
  }

  public void nextMove() {
    if (winner != null) {
      finishGame(winner);
    } else {
      users.get(currentUserIndex).doMove(this);
      users.get(currentUserIndex).endMove(this);
      currentUserIndex++;
      if (currentUserIndex >= users.size()) {
        currentUserIndex = 0;
      }
    }
  }

  private void finishGame(User winner) {
    // finish the game
  }

}
