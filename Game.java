import java.util.*;

public class Game {
  private ArrayList<Player> players;

  public Game() {
    this.players = new ArrayList<Player>();
  }

  public int playerCount(){
    return this.players.size();
  }

  public void addPlayer(Player player) {
    this.players.add(player);
  }
}