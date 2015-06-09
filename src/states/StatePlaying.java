package states;

import model.game.Game;
import model.game.User;
import model.locations.Location;

public class StatePlaying implements State {

  private static State state = new StatePlaying();

  private StatePlaying() {};

  public static State getInstance() {
    return state;
  }

  @Override
  public void doMove(Game game, User user) {
    int dice1result = game.getDice1().throwDice();
    int dice2result = game.getDice2().throwDice();
    doMove(game, user, dice1result, dice2result);
  }

  @Override
  public void doMove(Game game, User user, int dice1result, int dice2result) {
    int gamefieldSize = game.getGameField().getLocationCounter();
    int userPosition = user.getLocationIndex();
    int totalMovement = userPosition + dice1result + dice2result;
    int newPosition = totalMovement % gamefieldSize;
    user.setLocationIndex(newPosition);

    Location location = game.getGameField().getLocation(newPosition);
    location.executeAction(game, user);

    if (totalMovement / gamefieldSize > 0) {
      crossedStart(user);
    }
  }

  private void crossedStart(User user) {
    // give user some money
  }
}
