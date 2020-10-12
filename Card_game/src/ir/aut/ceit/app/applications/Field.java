package ir.aut.ceit.app.applications;

public class Field {
    private MonsterCard[] monsters;
    private Card[] cards;

    public Field(MonsterCard[] monsters, Card[] cards) {
        this.monsters = monsters;
        this.cards = cards;
    }

    public Field() {
        monsters = new MonsterCard[5];
        cards = new Card[5];
    }

    public void cardTurnEffects(Field enemyField) {
        for (Card spell : this.cards) {
            if (spell != null) {
                if (spell instanceof DestroySpell) {
                    ((DestroySpell) spell).instantEffect(this, enemyField);
                } else {
                    spell.turnEffect(this, enemyField);
                }
            }
        }
        for (MonsterCard monster : this.monsters) {
            if (monster != null) {
                monster.setCanAttack(true);
            }
        }
    }

    boolean addMonsterCard(MonsterCard card) {
        for (int i = 0; i < this.monsters.length; i++) {
            if (this.monsters[i] == null) {
                this.monsters[i] = card;
                return true;
            }
        }
        return false;
    }

    boolean addSpellCard(Card card) {
        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i] == null) {
                this.cards[i] = card;
                return true;
            }
        }
        return false;
    }

    public MonsterCard[] getMonsters() {
        return monsters;
    }

    public Card[] getCards() {
        return cards;
    }

    void setMonsters(MonsterCard[] monsters) {
        this.monsters = monsters;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }


}
