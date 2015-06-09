package factories;

import model.cards.chance.AdditionalMoveCard;
import model.cards.chance.HappyBirthdayCard;
import model.cards.chance.LoseMoneyCard;
import model.cards.chance.LotteryCard;
import model.cards.chest.BigWinMoneyCard;
import model.cards.chest.SmallWinMoneyCard;
import model.game.Game;
import model.cards.Deck;
import model.game.GameField;
import model.locations.Street;
import model.game.User;
import model.dice.ClassicDice;
import model.dice.Dice;
import model.locations.*;

import java.util.List;

public abstract class GameFactory {

  private static Deck chance = getChanceDeck();
  private static Deck chests = getChestsDeck();

  public static Game initClassicGame(List<User> users) {
    if (users.size() < 2) {
      throw new RuntimeException("Invalid number of users");
    }
    GameField testField = initSimpleGameField();
    Dice dice1 = getClassicDice();
    Dice dice2 = getClassicDice();
    return new Game(users, testField, chests, chance, dice1, dice2);
  }

  public static GameField initSimpleGameField() {
    Location location0 = new Start();

    Asset location1 = new Asset("Hotel");
    Asset location2 = new Asset("Bar");
    Street sanFrancisco = new Street("San Francisco", new Asset[] {location1, location2});

    Location location3 = new Jail();

    Asset location4 = new Asset("Casino");
    Asset location5 = new Asset("Pub");
    Street la = new Street("Los Angeles", new Asset[] {location5, location5});

    Location location6 = new GoToJail();
    Location location7 = new CardHolder(chance);

    Asset location8 = new Asset("Restaurant");
    Asset location9 = new Asset("Apartment");
    Street ny = new Street("New York", new Asset[] {location9, location9});

    Location location10 = new CardHolder(chests);

    GameField field = new GameField();
    field.addAllLocations(location0, location1, location2, location3, location4, location5, location6,
            location7, location8, location9, location10);
    return field;
  }

  private static Dice getClassicDice() {
    return new ClassicDice();
  }

  private static Deck getChestsDeck() {
    Deck chests = new Deck();
    chests.addAllCards(new BigWinMoneyCard(), new SmallWinMoneyCard());
    chests.shuffleCards();
    return chests;
  }

  private static Deck getChanceDeck() {
    Deck chance = new Deck();
    chance.addAllCards(new AdditionalMoveCard(), new LoseMoneyCard(), new LotteryCard(), new HappyBirthdayCard());
    chance.shuffleCards();
    return chance;
  }
}
