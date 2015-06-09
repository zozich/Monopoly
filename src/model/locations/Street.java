package model.locations;

import model.game.User;

public class Street {

  private String description;
  private Asset[] assets;

  public Street(String description, Asset[] assets) {
    this.description = description;
    this.assets = assets;
    for (Asset asset : assets) {
      asset.setStreet(this);
    }
  }

  public boolean isOneOwner(User user) {
    boolean oneOwner = true;
    for (Asset asset : assets) {
      if (user != asset.getOwner()) {
        oneOwner = false;
      }
    }
    return oneOwner;
  }
}
