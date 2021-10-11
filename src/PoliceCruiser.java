public class PoliceCruiser extends Vehicle{

    public PoliceCruiser(double distanceTraveled) {
        super(distanceTraveled);
    }

    @Override
    public void calculateToll() {
        setToll(0.0);
    }

    @Override
    public String toString() {

            return //"TOLL INFO: \n"   +
                    "Vehicle" + "    " + "Distance" + "    " + "Toll Amount\n" +
                    "-----------------------------------------------------------\n" +
                    "PoliceCruiser" + "     " + getDistanceTraveled() + "         " + "$"+ getToll();
    }
}
