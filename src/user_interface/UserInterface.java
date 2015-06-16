package user_interface;

import model.game.Game;
import model.game.User;

public interface UserInterface {

  String getInputFromUser(User user, String message, String[] options);
  void sendMessage(String message);

  //used to process the game data and draw it on screen
  void sendGameData(Game game);
}
