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
      String message = "Do you wish to buy " + name + "?";
      String[] options = {"Buy this location", "Do not buy this location"};
      String answer = game.getUserInterface().getInputFromUser(user, message, options);
      // execute action depending on the user's answer
    } else if (user == owner) {
      // owner can upgrade - get input from user
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
