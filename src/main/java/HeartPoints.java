public class HeartPoints {
    protected Integer maximumHeartPoints = 1000;
    protected Integer actualHeartPoints;

    public HeartPoints() {
        this.actualHeartPoints = this.maximumHeartPoints;
    }

    public HeartPoints(Integer heartPoints) {
        actualHeartPoints = heartPoints;
    }

}
