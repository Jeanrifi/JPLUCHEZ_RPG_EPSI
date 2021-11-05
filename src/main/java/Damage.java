public class Damage {
    protected Integer damagePoints;

    public Damage() {
        // generate a random number between 0 and 200
        this.damagePoints = (int) (Math.random() * 200);
        isAttackSucceeded(this.damagePoints);
    }

    public void isAttackSucceeded(Integer damagePoints) {
        if (damagePoints == 0) {
            System.out.println("(Loupé !!)");
        }
    }
}
