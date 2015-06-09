package states;

import model.game.Game;
import model.game.User;

public class StateInJail implements State {

  private static State state = new StateInJail();

  private StateInJail() {};

  public static State getInstance() {
    return state;
  }

  @Override
  public void doMove(Game game, User user) {
    // user can either pay a fine and move or throw a dice and test his luck
    int dice1result = game.getDice1().throwDice();
    int dice2result = game.getDice2().throwDice();
    doMove(game, user, dice1result, dice2result);
  }

  @Override
  public void doMove(Game game, User user, int dice1result, int dice2result) {
    if (dice1result == dice2result) {
      user.setState(StatePlaying.getInstance());
      user.doMove(game, dice1result, dice2result);
    }
  }
}
