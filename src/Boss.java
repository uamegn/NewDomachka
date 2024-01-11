public class Boss extends GameEntity{
    private String weapon;

    public Boss(int health, int damage, String weapon){
        super.setHealth(health);
        super.setDamage(damage);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = String.valueOf(weapon);
    }

    public String printlnfo(){
        return  "Boss info: Health= " + getHealth() + ", Damage= " + getDamage()
                + "Weapon=" + getWeapon();
    }
}

