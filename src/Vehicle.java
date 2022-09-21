public class Vehicle {

    private String type;
    private Driver driver;
    private int legalAge;
    private int milesToGo;
    private int milesPerDrive;

    public Vehicle(Driver driver, String type, int legalAge, int milesToGo, int milesPerDrive) {

        this.driver = driver;
        this.type = type;
        this.legalAge = legalAge;
        this.milesToGo = milesToGo;
        this.milesPerDrive = milesPerDrive;

        System.out.println(type + " created. " + milesToGo + " miles to go!");

    }

    //setter för kompositionen Driver
    public void setDriver(Driver driver) {
        this.driver = driver;
        // (if sats) om Driver;age är större eller = Vehicle(Car/tank) legalAge
        // är setDriver giltigt och null bytas ut mot giltig Driver
        if (driver.getAge() >= legalAge)
            System.out.println("Driver changed to " + driver.getName());
        else System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + ", but must be " + legalAge + " or older to drive car");
    }

    // Metod drive som kollar utifall Driver är null.
    // Komposition till: (Vehicle (car/tank)
    public void drive () {
        if (driver != null) {
            // om Driver inte är null går en räknare igång för Vehicles instansvariabel milesToGo
            milesToGo = milesToGo - milesPerDrive;
            System.out.println(type + " Drove " + milesPerDrive + " miles - " + milesToGo + " miles to go");
        }
        else System.out.println(type + " didn't drive - there's no driver!");
    }

}
