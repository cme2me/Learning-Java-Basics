package HomeWorkSix;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cat("Папич"),
                new Dog("Веник"),
                new Cat("Персик"),
                new Dog("Лолик")

        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(150);
            animals[i].swim(7);
        }

    }
}
