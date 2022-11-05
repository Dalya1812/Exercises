package week3.day4.structuralPatterns.exx2.Farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Farmer {
    private Farm farm = new Farm();
    private List<Animal> animalList = new ArrayList<>();
    public void move(AnimalType type){
        for (Animal animal :
                animalList) {


        }
    }
    public void move() {
        animalList.get(ThreadLocalRandom.current().nextInt(animalList.size())).move();
    }

    public void requestAnAnimal(){
        animalList.add(farm.provideAnimal());
    }
}
