package CardGame;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * Task 4: One OO principle that allowed me to reuse this class is encapsulation.
 * This is done using a private final class of Suit and Value that can not be accessed
 * or changed by other methods and adds the necessary basic object to function
 * any card game.
 * Task 5: The enum feature allowed for me to modify the existing code to reflect
 * a deck of Uno Cards without creating new classes to categorize the different
 * card types.
 */
public class Card {
    
        public enum Suit {RED,YELLOW, GREEN, BLUE};
        public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, DRAWTWO, DRAWFOUR, WILDCARD};
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
}
}