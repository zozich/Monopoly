package model.locations;

import model.game.Game;
import model.game.User;

public class Asset implements Location {
  private String name;

  private User owner;
  private Street street;
  private int level = 1;

  public Asset(String name) {
    this.name = name;
  }

  public Street getStreet() {
    return street;
  }

  public void setStreet(Street street) {
    this.street = street;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void upgrade(User user) {
    // check if user has enough money
    if (level < 4) {
      level++;
      // deduct money from user's account depending on the level built
    }
  }

  @Override
  public void executeAction(Game game, User user) {
    if (owner == null) {
      // user can buy
    } else if (user == owner) {
      // owner can upgrade
    } else {
      // pay fine depending on the level of the asset
      if (street.isOneOwner(owner)) {
        // more fine
      } else {
        // less fine
      }
    }
  }
}
