public class Healing {
    protected Integer healingPoints;

    public Healing() {
        // generate a random number between 0 and 100
        this.healingPoints = (int) (Math.random() * 100);
        checkThatHealingSucceeded(this.healingPoints);
    }

    public void checkThatHealingSucceeded(Integer healingPoints) {
        if (healingPoints == 0) {
            System.out.println("(Le sort de soin a échoué.)");
        }
    }
}
