import java.util.*;
import cards.*;

public class Player {
  private String name;
  private ArrayList<Card> hand;

  public Player(String name){
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }

  public int cardCount(){
    return this.hand.size();
  }

  public void addCard(Card card) {
    this.hand.add(card);
  }

}