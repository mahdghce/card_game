package ir.aut.ceit.app.applications;


public class CardDeck extends ObjectDeck {

    public CardDeck(Card... cardArray) {
        super(cardArray);
    }

    @Override
    public Card deal() {
        return (Card) super.deal();
    }
}
