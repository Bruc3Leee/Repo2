package HomeWork7;

public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public boolean satiety(Plate s) {
        if (appetite > s.getFood()) {
            System.out.println("кот " + name + " не покушал");
            return false;
        } else {
            System.out.println("кот " + name + " сыт");
            return true;
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
