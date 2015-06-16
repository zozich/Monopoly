package model.states;

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
    String message = "Do you wish to try you luck or pay the fine and keep moving?";
    String[] options = {"Throw a dice", "Pay xxx fine"};
    String answer = game.getUserInterface().getInputFromUser(user, message, options);
    if (answer.equals("Throw a dice")) {
      int dice1result = game.getDice1().throwDice();
      int dice2result = game.getDice2().throwDice();
      doMove(game, user, dice1result, dice2result);
    } else {
      // take some money from the user
      user.setState(StatePlaying.getInstance());
      user.doMove(game);
    }
  }

  @Override
  public void doMove(Game game, User user, int dice1result, int dice2result) {
    if (dice1result == dice2result) {
      user.setState(StatePlaying.getInstance());
      user.doMove(game, dice1result, dice2result);
    }
  }
}
