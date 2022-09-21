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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Driver getDriver() {
        return driver;
    }
    //setter för kompositionen Driver
    public void setDriver(Driver driver) {
        this.driver = driver;
        // (if sats) om Driver;age är större eller = Vehicle(Car/tank) legalAge
        // är setDriver giltligt och null bytas ut mot giltlig Driver
        if (driver.getAge() >= legalAge)
            System.out.println("Driver changed to " + driver.getName());
        else System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + ", but must be " + legalAge + " or older to drive car");
    }

    public int getLegalAge() {
        return legalAge;
    }

    public void setLegalAge(int legalAge) {
        this.legalAge = legalAge;
    }

    public int getMilesToGo() {
        return milesToGo;
    }

    public void setMilesToGo(int milesToGo) {
        this.milesToGo = milesToGo;
    }

    public int getMilesPerDrive() {
        return milesPerDrive;
    }

    public void setMilesPerDrive(int milesPerDrive) {
        this.milesPerDrive = milesPerDrive;
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
