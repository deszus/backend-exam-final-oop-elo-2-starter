package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Animal animal : animals) {
            result.add("There is a " + animal.getSize() + " sized "
                    + animal.getClass().getSimpleName().toLowerCase() + " in the farm.");
        }
        return result;
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(this.animals);
    }
}