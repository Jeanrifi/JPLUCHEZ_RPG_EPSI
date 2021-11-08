public class Main {

    public static void main(String[] args) {
        Character player1 = new Character();
        Character enemy = new Character();

        enemy.attack(player1);
        player1.heal(player1);
        player1.attack(enemy);
        System.out.println("Before levelUp() : " + player1.level);
        player1.levelUp();
        System.out.println("After levelUp() : " + player1.level);
        System.out.println("Fin");
    }

}