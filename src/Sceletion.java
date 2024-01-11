public class Sceletion extends Boss{
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public Sceletion(int health, int damage, String weapon, int arrowCount){
        super(health, damage, weapon);
        this.arrowCount = arrowCount;
    }

    public String printlnfo(){
        return "Sceletion info: Health: " + getHealth() + " Damage= " + getDamage() + " Weapon= " +
                super.getWeapon() + " Arrows= " + arrowCount;
    }
}
