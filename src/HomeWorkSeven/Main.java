package HomeWorkSeven;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Papich"),
                new Cat("Venik"),
                new Cat("Filtr")
        };

        Plate plate = new Plate(25);

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
        }

        for (int i = 0; i < cats.length; i++){
            System.out.println(cats[i]);
        }
    }


}
