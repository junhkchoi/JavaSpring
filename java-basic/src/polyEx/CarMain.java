package polyEx;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver(); //x001
        K3Car k3Car = new K3Car(); //x002

        driver.setK3Car(k3Car); // x001.setK3Car(x002)
        driver.drive();

        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();

    }
}
