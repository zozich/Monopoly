package model.states;

import model.game.Game;
import model.game.User;

public interface State {

  void doMove(Game game, User user);
  void doMove(Game game, User user, int dice1result, int dice2result);
}
