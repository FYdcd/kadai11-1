public class Wizard extends Character {
    @Override
    public void attack(Matango m) {
        System.out.println("魔法使いは火の玉を放った！");
        System.out.println("敵に7のダメージを与えた");
        m.hp -= 7;
    }
}
