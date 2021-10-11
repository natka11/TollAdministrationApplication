import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("******************** DUOTECH TOLL ADMINISTRATION APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");

        // Implement the TAA application logic here

        System.out.println("How many vehicles would you like to calculate toll for? ");

        int noOfVehicles = new Scanner(System.in).nextInt();

        Vehicle[] vehicles = new Vehicle[noOfVehicles];


        for (int i = 0; i < noOfVehicles; i++) {

            System.out.println("Choose the vehicle type:");
            System.out.println("1.Car");
            System.out.println("2.Track");
            System.out.println("3.Police Cruiser");
            int type = new Scanner(System.in).nextInt();

            System.out.println("Calculating the toll for Vehicle #" + (i + 1) + "...");

            if (type == 1) {

                System.out.println("Distance Traveled: ");
                double distanceTraveled = new Scanner(System.in).nextDouble();
                System.out.println("Does it have a trailer? ");
                boolean hasTrailer = new Scanner(System.in).nextBoolean();
                System.out.println("Is HOV3+ ? ");
                boolean isHov = new Scanner(System.in).nextBoolean();
                vehicles[i]= new Car(distanceTraveled, hasTrailer, isHov);
                vehicles[i].calculateToll();
                System.out.println("TOLL INFO: \n" + vehicles[i].toString());
            }
            if (type == 2) {

                System.out.println("Distance Traveled: ");
                double distance = new Scanner(System.in).nextDouble();
                System.out.println("How many axles?" );
                int axles = new Scanner(System.in).nextInt();
                vehicles[i] = new Truck(distance, axles);
                vehicles[i].calculateToll();
                System.out.println("TOLL INFO: \n" + vehicles[i].toString());
            }
            if (type == 3) {

                System.out.println("Distance Traveled: ");
                double distancePoliceCruiser = new Scanner(System.in).nextDouble();
                vehicles[i] = new PoliceCruiser(distancePoliceCruiser);
                vehicles[i].calculateToll();
                System.out.println("TOLL INFO: \n" + vehicles[i].toString());
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("TOTAL INFO ON ALL VEHICLES");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Process finished with exit code 0");
        System.out.println("THANK YOU FOR USING DUOTECH TAA! GOODBYE!");
    }
}

