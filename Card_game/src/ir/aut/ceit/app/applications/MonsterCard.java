package ir.aut.ceit.app.applications;

public class MonsterCard extends Card {
    private int power;
    private int basePower;
    private boolean canAttack;

    MonsterCard(String name, String description, int power, boolean canAttack) {
        super(name, description);
        this.power = power;
        this.basePower = power;
        this.canAttack = canAttack;
    }

    public MonsterCard(String name, String description, int power) {
        this(name, description, power, false);
    }

    public Boolean equals(MonsterCard monsterCard) {
        return super.equals(monsterCard) && monsterCard.power == this.power && monsterCard.basePower == this.basePower;
    }

    @Override
    public String toString() {
        return super.toString() + " | Power : " + this.power + " | Can attack : " + this.canAttack;
    }

    void setPower(int power) {
        this.power = power;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

    public int getPower() {
        return power;
    }

    public int getBase_power() {
        return basePower;
    }

    public boolean getCanAttack() {
        return canAttack;
    }


}
