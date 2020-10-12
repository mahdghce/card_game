package ir.aut.ceit.app.applications;

public abstract class SpellCard extends Card {

    SpellCard(String name, String description) {
        super(name, description);
    }

    public abstract void turnEffect(Field ownerField, Field enemyField);

    public abstract void destroyedEffect(Field ownerField, Field enemyField);

    public Boolean equals(SpellCard spellCard) {
        return super.equals(spellCard);
    }

}
