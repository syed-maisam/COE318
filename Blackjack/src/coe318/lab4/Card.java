package coe318.lab4;

public class Card implements Comparable {
  //Symbolic constants

    //instance variables 
    int rank, suit;
    boolean faceUp;
    
  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
      //initialize the constructor
    this.rank = rank;
    this.suit = suit;
    this.faceUp = faceUp;
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return this.faceUp; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
    this.faceUp = faceUp;
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return this.rank; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return this.suit;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Card)) {
      return false;
    }
    Card c = (Card) ob; //FIX THIS
    if(c.rank == this.rank && c.suit == this.suit){
        return true;
    } else {
        return false;
    }
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {//FIX THIS
    if (this.rank < c.rank){
        return(-1);
    } else if (this.rank > c.rank) {
        return(1);
    } 

    if (this.suit > c.suit){
        return (1);
    } else if (this.suit < c.suit){
        return (-1);
    } else {
        return (0);
    }
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() { //FIX THIS
    switch (this.rank){
        case 11: 
            return ("Jack");
        case 12:
            return ("Queen");
        case 13:
            return ("King");
        case 14:
            return ("Ace");
        default: 
            return (Integer.toString(this.rank));
    }
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() { //FIX THIS
    String suit = ""; 
    switch(this.suit){
        case 0:
            suit = "Clubs";
            break;
        case 1:
            suit = "Diamonds";
            break;
        case 2:
            suit = "Hearts";
            break;
        case 3:
            suit = "Spades";
            break;
        }
        return(suit);
    }

  /**Ace (rank 14) has a score of 1
    Jack, Queen, or King have a score of 10
    or else return the value = rank of the card**/
    public int value() {
        if (this.rank == 14){
            return(1);
        } else if (this.rank > 10){
            return(10);
        } else {
            return(this.rank);
        }
}
  
  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() { //FIX THIS
      if (this.faceUp){
          return (this.getRankString() + " of " + this.getSuitString());
      } else {
          return("?");
      }
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}
