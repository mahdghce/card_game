package ir.aut.ceit.app.applications;

public class DestroySpell extends TrapCard {

    public DestroySpell() {
        super("Destroy Spell", "Destroys the enemy’s first spell card.");
    }

    @Override
    public void instantEffect(Field owner, Field enemy) {
        Card[] spellCards = enemy.getCards();
        for (int i = 0; i < spellCards.length; i++) {
            if (spellCards[i] != null) {
                spellCards[i] = null;
                break;
            }
        }
    }
}
