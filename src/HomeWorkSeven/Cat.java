package HomeWorkSeven;

public class Cat {
    private String name;
    private boolean satiety;

    private final int DEFAULT_APPETITE = 10;

    public Cat(String name) {
        this.name = name;
    }

    public boolean eat(Plate plate) {
        if (plate.decreaseFood(DEFAULT_APPETITE)) {
            System.out.println("Cat " + name + " eat...");
            satiety = true;
            return true;
        } else {
            System.out.println("Cat " + name + " not eat...");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void fear(Dog dog) {
        System.out.println("Cat " + name + " fear dog " + dog.getName());
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
