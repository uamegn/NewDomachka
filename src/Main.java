public class Main {
    public static void main(String[] args) {
        Weapon bossweapon = new Weapon("snaiper", 300);
        Boss boss = new Boss(1000, 50, "carbine");

        System.out.println(boss.printlnfo());


        Weapon sceletionWeapon1 = new Weapon("revolver", 250);
        Sceletion sceletion1 = new Sceletion(700, 45, "mine", 350);
        Sceletion sceletion2 = new Sceletion(150, 15, "rifle", 20);


        System.out.println(sceletion1.printlnfo());
        System.out.println(sceletion2.printlnfo());
    }
}