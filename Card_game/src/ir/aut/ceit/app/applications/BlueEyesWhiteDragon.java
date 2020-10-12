package ir.aut.ceit.app.applications;

public class BlueEyesWhiteDragon extends MonsterCard implements Special {

    public BlueEyesWhiteDragon() {
        super("Blue Eyes White Dragon", "The best card.", 3000, true);
    }

    @Override
    public void instantEffect(Field owner, Field enemy) {
        owner.addMonsterCard(new BlueEyesWhiteDragon());
        owner.addMonsterCard(new BlueEyesWhiteDragon());
    }
}
