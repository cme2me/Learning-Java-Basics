package HomeWorkSeven;

public class Cat {
    private String name;
    private boolean fullStomach;

    private final int DEFAULT_APPETITE = 10;

    public Cat(String name){
        this.name = name;
    }

    public boolean eat(Plate plate){
        if(plate.decreaseFood(DEFAULT_APPETITE)){
            System.out.println("Cat" + name + "eating");
            fullStomach = true;
            return true;
        }
        else{
            System.out.println("Cat" + name + "still hungry");
            return false;
        }
    }

    public String getName(){
        return name;
    }

    public void fear(Dog dog){
        System.out.println("Cat" + name + "fear dog");
    }

    public boolean isFullStomach() {
        return fullStomach;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", fullStomach=" + fullStomach +
                '}';
    }
}
