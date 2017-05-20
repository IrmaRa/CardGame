package game;
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

  public String findWinner(Player player1, Player player2) {
    if(player1.getHandValue() > player2.getHandValue()){
      return player1.getName();
    } return player2.getName(); 
  }

}
