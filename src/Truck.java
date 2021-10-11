public class Truck extends Vehicle {

    private int noOfAxles;

    public Truck(double distanceTraveled, int noOfAxles) {
        super(distanceTraveled);
        this.noOfAxles = noOfAxles;
    }

    public int getNoOfAxles() {
        return noOfAxles;
    }

    public void setNoOfAxles(int noOfAxles) {
        this.noOfAxles = noOfAxles;
    }

    @Override
    public void calculateToll() {
        if (noOfAxles == 4) {
            setToll(getDistanceTraveled() * 0.040);
        }
        if (noOfAxles == 6) {
            setToll(getDistanceTraveled() * 0.045);
        }
        if (noOfAxles >= 8) {
            setToll(getDistanceTraveled() * 0.048);
        }

    }

    @Override
    public String toString() {
            return //"TOLL INFO: \n"   +
            "Vehicle" + "    " + "Distance" + "    " + "Toll Amount\n" +
            "-----------------------------------------------------------\n" +
            "Truck " + "        " + getDistanceTraveled() + "          " + "$"+ getToll();
    }
}
