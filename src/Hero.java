public class Hero {
    private int health;
    private int damage;
    private boolean superAbility;

    public Hero (int health, int damage){
        this ( health, damage, false);
    }
    public Hero(int health, int damage, boolean superAbility){
        this.health =health;
        this.damage = damage;
        this.superAbility = superAbility;

    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean hasSuperAbility() {
        return superAbility;
    }
}
