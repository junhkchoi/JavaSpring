package polyEx.polyRef;

public class K3Car implements Car{

    @Override
    public void startEngine() {
         System.out.println("K3Car.startEngine");
    }

    @Override
    public void offEngine() {
           System.out.println("K3Car.offEngine");

    }

    @Override
    public void pressAccel() {
            System.out.println("K3Car.pressAccel");

    }
    
   
    
}
