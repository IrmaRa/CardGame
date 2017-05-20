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

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  public int getHandValue() {
    int total = 0;
    for(Card card : hand) {
      total += card.getRankValue();
    }
    return total;
  }

  public int cardCount(){
    return this.hand.size();
  }

  public void getCard(Card card){
    this.hand.add(card);
  }

}