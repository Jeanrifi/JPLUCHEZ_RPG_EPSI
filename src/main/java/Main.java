public class Main {

    public static void main(String[] args) {
        Character player1 = new Character();
        Character enemy = new Character();

        enemy.attack(player1);
        player1.heal(player1);
        player1.attack(enemy);
        player1.levelUp();
        System.out.println("Fin");
    }
}