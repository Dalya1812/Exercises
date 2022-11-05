package week3.day4.structuralPatterns.exx2.Farm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class Farm {
    private List<Animal> animalsList = new ArrayList<>();

    public Farm() {
//       for (int i=0; i<10; i++){
//           Cat c = new Cat();
//           animals_list.add(c);
//       }
//        for (int i=0; i<10; i++){
//           Goat g = new Goat();
//            animals_list.add(g);
//        }
//        for (int i=0; i<10; i++){
//            Cow co = new Cow();
//            animals_list.add(co);
//        }
        for (int i = 0; i < 30; i++) {
            acquire();
        }
    }

    public void acquire() {
        animalsList.add(generateRandomAnimal());
    }

    public Animal mate(Animal animal) {
        if (animalsList.contains(animal)) {
            if (animal instanceof Cat) {
                Cat c = new Cat();
                return c;
            } else if (animal instanceof Cow) {
                Cow co = new Cow();
                return co;
            } else if (animal instanceof Goat) {
                Goat g = new Goat();
                return g;
            }
        }
        return null;
    }

    public Animal provideAnimal(){
        Animal a = generateRandomAnimal();
        if (a instanceof Cat) {
            System.out.println("Cat is provided");
        }
        else if(a instanceof Cow){
            System.out.println("Cow is provided");
        }
        else {
            System.out.println("Goat is provided");
        }
        return a;
    }

    public Animal generateRandomAnimal() {

//        List<Animal> ans = new ArrayList<>();
//        ans.add(new Cat());
//        ans.add(new Cow());
//        ans.add(new Goat());
        AnimalType[] values = AnimalType.values();
        int random = ThreadLocalRandom.current().nextInt(values.length - 1);
        AnimalType selected = values[random];
        switch (selected){
            case CAT:
                return new Cat();
            case COW:
                return new Cow();
            case GOAT:
                return new Goat();
            default:
                throw new IllegalArgumentException(String.format("Animal type %s is not supported", selected));
        }
//        Random r = new Random();
//        int res = r.nextInt(ans.size()) + 1;
//        return ans.get(res);
    }
}
