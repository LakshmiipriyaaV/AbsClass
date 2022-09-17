package abs;
public class Default {
   public static void main(String args[]) {
      Vehicle vehicle = new Car(); vehicle.print();
   }
 }
interface Vehicle {
   default void print() {
      System.out.println("Its vehicle!");
   }
   static void blowHorn() {
      System.out.println("Blowing horn!!!");
   }
}
interface FourWheeler {
   default void print() {
      System.out.println("Its a four wheeler!");
   }
}
class Car implements Vehicle, FourWheeler {
   public void print() {
      Vehicle.super.print();
      FourWheeler.super.print();
      Vehicle.blowHorn();
      System.out.println("Its a car!");
   }
} 