//Nishat Quyoum
//CS-1400
//In class - Lab2
package car;

/**
 *
 * @author nisha
 */
public class Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CarClass car = new CarClass(2003, "Mustang");
         System.out.println("Make of the car: " + car.getMake());
       System.out.println("Car year model: " + car.getYearModel());
       
       System.out.println();
       for(int i = 0; i < 5; i++)
       {
           car.accelerate();
           System.out.println("Speed: " + car.getSpeed());
       }
    
       for(int i = 0; i < 5; i++)
       {
           car.brake();
           System.out.println("Speed: " + car.getSpeed());
    }
    
    }
}
