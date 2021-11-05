public class Heal {

    public Heal(Character target) {
        System.out.println("La cible avait " + target.heartPoints.actualHeartPoints + " points de vie.");

        Integer healingPoints = new Healing().healingPoints;
        target.healingReceived(healingPoints);

        actualHeartPointsCantExceedMaximumHeartPoints(target.heartPoints);

        System.out.println("Elle a reçu " + healingPoints + " points de soin.\n"
                + "La cible a maintenant " + target.heartPoints.actualHeartPoints + " points de vie.\n");
    }

    public void actualHeartPointsCantExceedMaximumHeartPoints(HeartPoints targetHeartPoints) {
        if (targetHeartPoints.actualHeartPoints > targetHeartPoints.maximumHeartPoints) {
            targetHeartPoints.actualHeartPoints = targetHeartPoints.maximumHeartPoints;
        }
    }
}
