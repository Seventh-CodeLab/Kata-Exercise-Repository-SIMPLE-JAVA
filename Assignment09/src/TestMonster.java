public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("Glumanda");
        Monster m2 = new WaterMonster("Shiggy");
        Monster m3 = new StoneMonster("Bisasam");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("Boldi");
        System.out.println(m1.attack());

        Monster m4 = new Monster("Mewto");
        System.out.println(m4.attack());
    }
}
