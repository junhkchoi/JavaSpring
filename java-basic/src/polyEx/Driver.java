package polyEx;

public class Driver {
    
    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다");
        if (k3Car != null) {
            k3Car.startEngine(); // x002.startEngine()
            k3Car.pressAccel();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine(); // x002.startEngine()
            model3Car.pressAccel();
            model3Car.offEngine();
        }
    }
}
