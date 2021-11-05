public class Attack {

    public Attack(Character target) {
        HeartPoints targetHealth = target.heartPoints;

        System.out.println("La cible avait " + targetHealth.actualHeartPoints + " points de vie.");

        Integer damagePoints = new Damage().damagePoints;
        target.damageReceived(damagePoints);

        System.out.println("Elle a subit " + damagePoints + " points de dégâts.");

        heartPointsCantBeNegative(targetHealth);

        System.out.println("La cible a maintenant " + targetHealth.actualHeartPoints + " points de vie.\n");
    }

    public void heartPointsCantBeNegative(HeartPoints targetHealth) {
        if (targetHealth.actualHeartPoints < 0) {
            targetHealth.actualHeartPoints = 0;
        }
    }

}

