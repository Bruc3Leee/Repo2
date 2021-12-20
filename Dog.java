package oop2Lesson6;

public class Dog extends Animal {
    private int countDog;

    public Dog(String name) {
        super(name);
        countDog++;
    }
    public int getCount() {
        System.out.println("создано " + countDog + " собак\n");
        return countDog;
    }

    public void DogRun(int longG) {
        if (longG <= 500) {
            super.run(longG);
        } else {
            System.out.println("Ограничение бега собак");
        }
    }

    public void DogSwim(int longG) {
        if (longG <= 10) {
            super.swim(longG);
        } else {
            System.out.println("Ограничение плавания собак");
        }
    }
}
