package ir.aut.ceit.app.applications;

public class SpecialDeck extends ObjectDeck{

    public SpecialDeck(Special... specialArray) {
        super(specialArray);
    }

    @Override
    public Special deal() {
        return (Special) super.deal();
    }
}
