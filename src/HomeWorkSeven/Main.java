package HomeWorkSeven;

public class Main {
    public static void main(String[] args) {


        Box box1 = new Box("Red", 5);
        Box box2 = new Box("red", 5);

        System.out.println(box1.equals(box2));
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());

        System.out.println(box1);

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");

        StringBuilder sb = new StringBuilder("java");
        sb.append(12312);
        sb.append("zxczx");
       sb.append("zxczx").append(5 == 7).append(System.lineSeparator()).append(7 + 5);
        sb.reverse();
        sb.insert(4, "qq");
        sb.delete(6, 9);
        sb.replace(6, 11, "*");
        sb.setLength(sb.length() - 2);
        String s = sb.toString();
        System.out.println(s);


        Cat cat = new Cat("Barsik");
        Plate plate = new Plate(100);

        cat.eat(plate);

        System.out.println(plate.getFood());

        Dog dog = new Dog("Tuzik");
        dog.scare(cat);

        Cat[] cats = new Cat[]{
                new Cat("Barsik"),
                new Cat("Barsik2"),
                new Cat("Barsik3"),
                new Cat("Barsik4"),
                new Cat("Barsik5")
        };



        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }

    }
}
