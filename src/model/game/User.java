package model.game;

import states.State;
import states.StatePlaying;

public class User {

  private String name;
  private int money = 100;
  private int locationIndex = 0;
  private State state = StatePlaying.getInstance();

  public User(String name) {
    this.name = name;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public int getLocationIndex() {
    return locationIndex;
  }

  public void setLocationIndex(int locationIndex) {
    this.locationIndex = locationIndex;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public void doMove(Game game) {
    state.doMove(game, this);
  }

  public void doMove(Game game, int dice1result, int dice2result) {
    state.doMove(game, this, dice1result, dice2result);
  }
}
