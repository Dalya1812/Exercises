package org.example;

public interface Vehicle {
   public default void transport(Passenger passenger){
      System.out.println(passenger.getName());
   }
}
