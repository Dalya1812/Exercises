package week3.day4.structuralPatterns.exx2;

import week3.day4.structuralPatterns.exx2.Farm.Cat;
import week3.day4.structuralPatterns.exx2.Farm.Farmer;
import week3.day4.structuralPatterns.exx2.Farm.Goat;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
//        List<Animal> list = new ArrayList<>();
        Cat c1 = new Cat();
        Farmer f = new Farmer();
        for (int i = 0; i < 10; i++) {
            f.requestAnAnimal();
        }

        Goat goat = new Goat();
        WoodenHorse woodenHorse = new WoodenHorse();
        WoodenStructures animalAdapter = new WoodenStructureAdapter(goat);
        System.out.println("Goat:");
        goat.move();
        goat.mate(goat);

        System.out.println("wooden Horse:");
        woodenHorse.replicate();
        woodenHorse.roll();

        System.out.println("animalAdapter:");
        animalAdapter.replicate();
        animalAdapter.roll();


    }
}
