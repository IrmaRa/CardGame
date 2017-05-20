import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import java.util.*;

public class GameTest {

  Game game;
  Player player1;
  Player player2;
  Card card1;
  Card card2;
  
  @Before 
  public void before(){
    game = new Game();
    player1 = new Player("Louise");
    player2 = new Player("Irma");
  }

  @Test
  public void canAddPlayer() {
    Player player = new Player("Louise");
    game.addPlayer(player);
    assertEquals(1, game.playerCount());
  }

  @Test
  public void canAddTwoPlayers() {
    game.addPlayer(player1);
    game.addPlayer(player2);
    assertEquals(2, game.playerCount());
  }

  @Test
  public void canFindWinner() {
    card1 = new Card(CardSuit.DIAMONDS, CardRank.ACE);
    card2 = new Card(CardSuit.DIAMONDS, CardRank.KING);
    player1.getCard(card1);
    player2.getCard(card2);
    assertEquals("Irma", game.findWinner(player1, player2));
  }

}