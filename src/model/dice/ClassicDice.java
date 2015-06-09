package model.dice;

import java.util.Random;

public class ClassicDice implements Dice {

  private Random random = new Random();

  public int throwDice() {
    return random.nextInt(6) + 1;
  }
}