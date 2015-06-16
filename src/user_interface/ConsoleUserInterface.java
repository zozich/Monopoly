package user_interface;

import model.game.Game;
import model.game.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleUserInterface implements UserInterface {

  private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  private int counter = 0;

  @Override
  public String getInputFromUser(User user, String message, String[] options) {
    System.out.println(message);
    counter = 0;
    for (String option : options) {
      System.out.println(++counter + ". " + option);
    }
    int answerIndex = readAnswer();
    return options[answerIndex - 1];
  }

  @Override
  public void sendMessage(String message) {
    System.out.println(message);
  }

  @Override
  public void sendGameData(Game game) {
    // nothing to do for console version
  }

  private int readAnswer() {
    try {
      String answer = reader.readLine();
      return checkAnswer(answer);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private int checkAnswer(String answer) {
    int answerIndex;
    try {
      answerIndex = Integer.parseInt(answer);
      if (answerIndex > counter || answerIndex < 0) {
        answerIndex = repeatInput();
      }
    } catch (NumberFormatException e) {
      answerIndex = repeatInput();
    }
    return answerIndex;
  }

  private int repeatInput() {
    System.out.println("Incorrect user_interface. Please try again. Indicate the index of your answer");
    return readAnswer();
  }
}
