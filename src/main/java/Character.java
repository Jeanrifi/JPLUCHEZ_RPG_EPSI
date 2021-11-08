public class Character {
    protected HeartPoints heartPoints;
    protected CharacterLevel level;

    public Character() {
        this.heartPoints = new HeartPoints();
        this.level = new CharacterLevel();
    }

    public void levelUp() {
        level.characterLevel += 1;
    }

    public Boolean isAliveAndCanBeHealed(Character character) {
        boolean isAlive = character.heartPoints.actualHeartPoints > 0;
        if (!isAlive) {
            System.out.println("La cible est morte.\n" +
                    "Il n'est plus possible de la soigner ou de l'attaquer.");
        }
        return isAlive;
    }

    public void heal(Character target) {
        if (isAliveAndCanBeHealed(target)) {
            new Heal(target);
        }
    }

    public void attack(Character target) {
        if (isAliveAndCanBeHealed(target)) {
            new Attack(target);
        }
    }

    public HeartPoints addHealHeartPoints(HeartPoints targetHeartPoints) {
        Integer actualTargetHeartPoints = targetHeartPoints.actualHeartPoints;
        Integer heartPointsWon = new Healing().healingPoints;

        return new HeartPoints(actualTargetHeartPoints + heartPointsWon);
    }

    public HeartPoints removeDamageHeartPoints(HeartPoints targetHeartPoints) {
        Integer actualTargetHeartPoints = targetHeartPoints.actualHeartPoints;
        Integer heartPointsLost = new Damage().damagePoints;

        return new HeartPoints(actualTargetHeartPoints - heartPointsLost);
    }

}
