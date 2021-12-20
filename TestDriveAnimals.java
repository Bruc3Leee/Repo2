package oop2Lesson6;

public class TestDriveAnimals {
    public static void main(String[] args) {
        Cat cat = new Cat("лола");
        cat.swim(2);
        cat.run(22);
        cat.countsCat();

        Dog dog = new Dog("Барсик");
        dog.DogSwim(2);
        dog.DogRun(33);
        dog.getCount();

        Animal.getCountAnimal();
    }
}