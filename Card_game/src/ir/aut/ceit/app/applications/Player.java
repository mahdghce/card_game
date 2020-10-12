package ir.aut.ceit.app.applications;

public class Player {
    private CardDeck mainDeck;
    private SpecialDeck specialDeck;
    private Card[] hand;
    private Special nextSpecial;
    private int lifePoints;

    private Player(CardDeck mainDeck, SpecialDeck specialDeck, int lifePoints) {
        this.mainDeck = mainDeck;
        this.specialDeck = specialDeck;
        this.lifePoints = lifePoints;
        this.hand = new Card[5];
    }

    public Player(CardDeck mainDeck, SpecialDeck specialDeck) {
        this(mainDeck, specialDeck, 5000);
    }

    public boolean draw(int count) {
        for (int i = 0; i < count; i++) {
            if (this.hand[i] == null) {
                if (this.mainDeck.deal() != null) {
                    this.hand[i] = this.mainDeck.deal();
                } else return false;
            }
        }
        return true;

    }

    public void drawSpecialCard() {
        if (this.nextSpecial == null) {
            this.nextSpecial = this.specialDeck.deal();
        }
    }

    public void nextTurnPrep() {
        if (!this.draw(1)) {
            this.changeLifePoints(-500);
        }
        this.drawSpecialCard();
    }

    public boolean playCardFromHand(int whichCard, Field myField) {
        if (hand.length <= whichCard) {
            return false;
        }
        if (this.hand[whichCard] == null) {
            return false;
        }
        if (this.hand[whichCard] instanceof MonsterCard) {
            if (myField.addMonsterCard((MonsterCard) this.hand[whichCard])) {
                this.hand[whichCard] = null;
                return true;
            } else return false;
        } else if (this.hand[whichCard] instanceof PowerCard || this.hand[whichCard] instanceof DestroySpell) {
            if (myField.addSpellCard(hand[whichCard])) {
                this.hand[whichCard] = null;
                return true;
            } else return false;
        }
        return false;
    }

    public boolean playSpecial(Field myField) {
        if (this.nextSpecial == null){
            return false;
        }
        if (this.nextSpecial instanceof BlueEyesWhiteDragon) {
            if (myField.addMonsterCard((MonsterCard) this.nextSpecial)) {
                this.nextSpecial = null;
                return true;
            }
        } else if (myField.addSpellCard((Card) this.nextSpecial)) {
            this.nextSpecial = null;
            return true;
        }
        return false;
    }

    public void changeLifePoints(int change) {
        this.lifePoints = this.lifePoints + change;
    }

    public boolean isDefeated() {
        return this.lifePoints <= 0;
    }

    public Card[] getHand() {
        return hand;
    }

    public Special getNextSpecial() {
        return nextSpecial;
    }

    public int getLifePoints() {
        return lifePoints;
    }
}
