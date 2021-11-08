public class Heal {

    public Heal(Character target) {
        System.out.println("La cible avait " + target.heartPoints.actualHeartPoints + " points de vie.");

        target.heartPoints = target.addHealHeartPoints(target.heartPoints);

        actualHeartPointsCantExceedMaximumHeartPoints(target.heartPoints);

        System.out.println("Elle a reçu des points de soin.\n"
                + "La cible a maintenant " + target.heartPoints.actualHeartPoints + " points de vie.\n");
    }

    public void actualHeartPointsCantExceedMaximumHeartPoints(HeartPoints targetHeartPoints) {
        if (targetHeartPoints.actualHeartPoints > targetHeartPoints.maximumHeartPoints) {
            targetHeartPoints.actualHeartPoints = targetHeartPoints.maximumHeartPoints;
        }
    }
}
