package ir.aut.ceit.app.applications;

public class PowerCard extends SpellCard {
    public PowerCard() {
        super("Power card", "Increases power of monsters by 100 each turn.");
    }

    @Override
    public void turnEffect(Field ownerField, Field enemyField) {
        MonsterCard[] monsterCards = ownerField.getMonsters();
        for (MonsterCard monsterCard : monsterCards) {
            if (monsterCard != null){
                monsterCard.setPower(monsterCard.getPower() + 100);
            }
        }
        ownerField.setMonsters(monsterCards);
    }

    @Override
    public void destroyedEffect(Field ownerField, Field enemyField) {
        MonsterCard[] monsterCards = ownerField.getMonsters();
        for (MonsterCard monsterCard : monsterCards) {
            monsterCard.setPower(monsterCard.getPower() - 300);
        }
        ownerField.setMonsters(monsterCards);
    }
}
