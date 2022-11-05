package week3.day4.structuralPatterns.exx2;

import week3.day4.structuralPatterns.exx2.Farm.AnimalExtension;

public class WoodenStructureAdapter implements WoodenStructures{
    AnimalExtension animalExtension;
    public WoodenStructureAdapter(AnimalExtension animalExtension) {
        this.animalExtension = animalExtension;
    }
    @Override
    public void roll() {
        animalExtension.move();
    }

    @Override
    public void replicate() {
        animalExtension.mate(animalExtension);
    }
}
