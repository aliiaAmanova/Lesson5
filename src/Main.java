public class Main {
    public static void main(String[] args) {

    Boss boss = new Boss();
    boss.setHealth(900);
    boss.setDamage(100);
    boss.setDefenceType("SHIELD");
        System.out.println("Boss Health :" + boss.getHealth() + ", Boss Damage: " + boss.getDamage() + ", Boss Defense Type: "+ boss.getDefenceType());



        Hero[] heroes = createHeroes();


        System.out.println("Heroes:");
        for (Hero hero : heroes) {
            System.out.println("Hero Health: " + hero.getHealth() + "Hero Damage: " + hero.getDamage() +"Hero Super Ability: " + hero.hasSuperAbility());

        }
    }


    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(100, 20, true);
        heroes[1] = new Hero(120, 25);
        heroes[2] = new Hero(90, 15, false);
        return heroes;


        }





}

