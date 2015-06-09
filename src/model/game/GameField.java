package model.game;

import model.locations.Location;

import java.util.HashMap;
import java.util.Map;

public class GameField {

  private Map<Integer, Location> field = new HashMap<>();
  private int locationCounter = 0;
  private int jailLocation;

  public void addLocation(Location location) {
    field.put(locationCounter, location);
    locationCounter++;
  }

  public int getLocationCounter() {
    return locationCounter - 1;
  }

  public void addAllLocations(Location... locations) {
    for (Location location : locations) {
      addLocation(location);
    }
  }

  public void addJail(Location location) {
    jailLocation = locationCounter;
    addLocation(location);
  }

  public Location getLocation(int index) {
    return field.get(index);
  }

  public int getJailLocation() {
    return jailLocation;
  }
}
