package HomeWork7;

public class TestDriveCatPlate {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("барсик", 15);
        cats[1] = new Cat("Сименс", 1);
        cats[2] = new Cat("том", 15);
        cats[3] = new Cat("белок", 122);
        cats[4] = new Cat("желток", 12);

        Plate plate = new Plate(100);
        plate.addFood(22);

        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.satiety(plate);
        }
    }
}
