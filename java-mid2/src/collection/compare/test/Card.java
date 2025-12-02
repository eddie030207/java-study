package collection.compare.test;

public class Card implements Comparable<Card>{
    private final int rank; // 카드의 숫자
    private final Suit suit; // 카드의 문양
    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            return this.suit.compareTo(anotherCard.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getSymbol() + ")";
    }
}
