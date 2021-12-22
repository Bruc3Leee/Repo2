package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food + ".\n");
    }

    public void decreaseFood(int n) {
        food -= n;
        if (food < n) {
            System.out.println("не хватает еды");
            food += n;
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int p) {
        System.out.printf("Текущее количество еды: %s\n Добавленное еды: %s\n", food, p);
        food += p;
        System.out.println("Всего еды: " + food);
    }
}
