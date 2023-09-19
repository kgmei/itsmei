interface Vehicle {
    
    int MAX_SPEED = 120;
    void start();
    void accelerate(int speed);
    void brake();

    
    default void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}
 class Car implements Vehicle {
   
    public void start() {
        System.out.println("Car started.");
    }


    public void accelerate(int speed) {
        System.out.println("Car accelerated to " + speed + " km/h.");
    }

   
    public void brake() {
        System.out.println("Car applied brakes.");
    }
}
public class interfacenew {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate(60);
        car.brake();
        car.displayInfo();

        System.out.println("Maximum Speed: " + Vehicle.MAX_SPEED);
    }
}

