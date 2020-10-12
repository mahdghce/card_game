package ir.aut.ceit.app.applications;

public abstract class TrapCard extends Card implements Special {

    TrapCard(String name, String description) {
        super(name, description);
    }

    public Boolean equals(TrapCard trapCard) {
        return super.equals(trapCard);
    }
}
