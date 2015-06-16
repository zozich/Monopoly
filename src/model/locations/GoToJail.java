package model.locations;

import model.game.Game;
import model.game.User;
import model.states.StateInJail;

public class GoToJail implements Location {

  @Override
  public void executeAction(Game game, User user) {
    user.setState(StateInJail.getInstance());
    user.setLocationIndex(game.getGameField().getJailLocation());
  }
}
