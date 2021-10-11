public class Car extends Vehicle {

    private boolean hasTrailer;
    private boolean isHov;

    public Car(double distanceTraveled, boolean hasTrailer, boolean isHov) {
        super(distanceTraveled);
        this.hasTrailer = hasTrailer;
        this.isHov = isHov;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public boolean isHov() {
        return isHov;
    }

    public void setHov(boolean hov) {
        isHov = hov;
    }

    public void calculateToll() {
        if (isHov) {
            setToll(0.0);
        }
        if (hasTrailer) {
            setToll((getDistanceTraveled() * 0.020) + 1.0);
        } else {
            setToll(getDistanceTraveled() * 0.020);
        }


        System.out.println("");
    }

    @Override
    public String toString() {

        return "Vehicle" + "    " + "Distance" + "    " + "Toll Amount\n" +
                "-----------------------------------------------------------\n" +
                "Car" + "        " + getDistanceTraveled() + "          " + "$" + getToll();
    }
}


