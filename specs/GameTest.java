import static org.junit.Assert.*;
import org.junit.*;

public class GameTest {

  Game game;
  
  @Before 
  public void before(){
    game = new Game();
  }

  @Test
  public void canAddPlayer() {
    Player player = new Player("Louise");
    game.addPlayer(player);
    assertEquals(1, game.playerCount());
  }

  @Test
  public void canAddTwoPlayers() {
    Player player1 = new Player("Louise");
    Player player2 = new Player("Irma");
    game.addPlayer(player1);
    game.addPlayer(player2);
    assertEquals(2, game.playerCount());
  }


}