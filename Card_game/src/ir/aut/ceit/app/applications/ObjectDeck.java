package ir.aut.ceit.app.applications;

public abstract class ObjectDeck {
    private Object[] deckObjects;

    ObjectDeck(Object[] deckObjects) {
        this.deckObjects = deckObjects;
    }

    public Object deal() {
        if (this.isEmpty()) {
            return null;
        }
        Object last = this.deckObjects[this.deckObjects.length - 1];
        Object[] helper = new Object[this.deckObjects.length - 1];
        System.arraycopy(this.deckObjects, 0, helper, 0, this.deckObjects.length - 1);
        this.deckObjects = helper;
        return last;
    }

    public int size() {
        return this.deckObjects.length;
    }

    private Boolean isEmpty() {
        return this.deckObjects.length == 0;
    }
}
