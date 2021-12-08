package HomeWorkSix;

public class Animals {
    String name;
    String type;

    int maxRun;
    int maxSwim;

    public Animals(String name, String type, int maxRun, int maxSwim){
        this.name = name;
        this.type = type;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distantion){
        if(maxRun == 0){
            System.out.printf("%s %s не умеет бегать\n", type, name);
            return;
        }
        else if(distantion < 0 ){
            System.out.println("Для бега в обратном направлении введите то же число");
            return;
        }
        else if(distantion <= maxRun){
            System.out.printf("%s %s пробежал %d метров\n", type, name, distantion);
        }
        else{
            System.out.printf("%s %s не смог пробежать %d метров\n", type, name, distantion);
        }
    }

    public void swim(int distantion){
        if(maxSwim == 0 ){
            System.out.printf("%s %s не умеет плавать\n", type, name);
            return;
        }
        else if(distantion < 0 ){
            System.out.println("Для плавания в обратном направлении введите то же число");
            return;
        }
        else{
            System.out.printf("%s %s не смог проплыть %d метров\n", type, name, distantion);
        }

    }
}
