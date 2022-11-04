package week3.day2.creationalPatterns;

public interface Vehicle {
   public default void transport(Passenger passenger){
      System.out.println(passenger.getName());
   }
    AbsVeichle getTypeOfVehicle();

   public AbsVeichle creatVeichleUsingType(Enum type);
}
