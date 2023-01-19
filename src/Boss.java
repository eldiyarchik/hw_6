public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
       return this.getHealth() + " " + this.getDamage() + " " + this.weapon.getName() + " " + this.weapon.getType();
    }
}
