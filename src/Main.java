public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.setHealth(1000);
        boss.setDamage(100);

        boss.weapon.setName("AWP");
        boss.weapon.setType("AK-47");

        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        Skeleton skeleton2 = new Skeleton();

        skeleton1.setHealth(500);
        skeleton1.setDamage(200);
        skeleton1.setArrows(10);
        skeleton1.weapon.setName("baby");
        skeleton1.weapon.setType("Luk");
        skeleton2.setHealth(500);
        skeleton2.setDamage(200);
        skeleton2.setArrows(10);
        skeleton2.weapon.setName("baby2");
        skeleton2.weapon.setType("Luk2");
        System.out.println(skeleton1.printInfo() + "\n" + skeleton2.printInfo());


    }
}