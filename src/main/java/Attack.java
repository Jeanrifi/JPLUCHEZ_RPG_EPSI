public class Attack {

    public Attack(Character target) {
        System.out.println("La cible avait " + target.heartPoints.actualHeartPoints + " points de vie.");

        target.heartPoints = target.removeDamageHeartPoints(target.heartPoints);

        System.out.println("Elle a subit des points de dégâts.");

        heartPointsCantBeNegative(target.heartPoints);

        System.out.println("La cible a maintenant " + target.heartPoints.actualHeartPoints + " points de vie.\n");
    }

    public void heartPointsCantBeNegative(HeartPoints targetHealth) {
        if (targetHealth.actualHeartPoints < 0) {
            targetHealth.actualHeartPoints = 0;
        }
    }

}
