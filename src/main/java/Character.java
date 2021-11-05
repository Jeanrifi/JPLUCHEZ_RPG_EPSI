public class Character {
    protected HeartPoints heartPoints;
    protected CharacterLevel level;

    public Character() {
        this.heartPoints = new HeartPoints();
        this.level = new CharacterLevel();
    }

    public void levelUp() {
        this.level.characterLevel += 1;
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

    public void healingReceived(Integer hpWon) {
        this.heartPoints.actualHeartPoints += hpWon;
    }

    public void attack(Character target) {
        if (isAliveAndCanBeHealed(target)) {
            new Attack(target);
        }
    }

    public void damageReceived(Integer hpLost) {
        this.heartPoints.actualHeartPoints -= hpLost;
    }
}
