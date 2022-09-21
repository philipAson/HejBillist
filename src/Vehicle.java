public class Vehicle {

    private String type;
    private Driver driver;
    private int legalAge;

    public Vehicle (Driver driver, String type, int legalAge) {

        this.driver = driver;
        this.type = type;
        this.legalAge = legalAge;

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

    public void setDriver(Driver driver) {
        this.driver = driver;
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

    public void drive () {
        if (driver != null) {
            System.out.println("--");
        }
        else System.out.println(type + " didn't drive - there's no driver!");
    }

}
