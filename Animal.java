package oop2Lesson6;

public class Animal {
    public String name;
    public int longG;
    private static int countAnimal = 0;

    public Animal() {
        countAnimal++;
    }

    public static int getCountAnimal() {
        System.out.println("Создано " + countAnimal + " животных");
        return countAnimal;
    }



    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public Animal(int longG) {
        this.longG = longG;
    }

    public void swim(int longG) {
        System.out.println("Животое " + name + " проплыло " + longG + "м");
    }

    public void run(int longG) {
        System.out.println("Животное " + name + " пробежало " + longG + "м");
    }

    public int getLongG() {
        return longG;
    }

    public void setLongG(int longG) {
        this.longG = longG;
    }

    public static void getCountAnimal(int countAnimal) {
        Animal.countAnimal = countAnimal;
    }
}

