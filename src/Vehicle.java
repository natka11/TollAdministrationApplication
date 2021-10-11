public abstract class Vehicle {

    private double toll;
    private double distanceTraveled;

    protected Vehicle(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
    public double getDistanceTraveled() {
        return distanceTraveled;
    }
    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
    public double getToll() {
        return toll;
    }
    public void setToll(double toll) {
        this.toll = toll;
    }
    public void calculateToll(){};

}
