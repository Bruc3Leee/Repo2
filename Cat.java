package oop2Lesson6;

public class Cat extends Animal{
    private int countCat;

    public Cat(String name) {
        super(name);
        countCat++;
    }

    public int countsCat() {
        System.out.println("создано " + countCat + " котов\n");
        return countCat;
    }

    public void run(int longG) {
        if (longG <= 200) {
            super.run(longG);
        } else {
            System.out.println("ограничение кота");
        }
    }

    public void swim(int longG) {
        System.out.println("коты не плавають");
    }
}
