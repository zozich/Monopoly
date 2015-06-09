package model.locations;

import model.game.Game;
import model.game.User;

public interface Location {

  public void executeAction(Game game, User user);
}
