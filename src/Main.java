public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 5;
        int b = -40;
        int c = a+b;

        if(c >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
      int value = 80;
      if(value <= 0){
          System.out.println("Красный");
      }
      else if(value >= 0 && value <= 100){
          System.out.println("Жёлтый");
      }
      else if (value > 100){
          System.out.println("Зеленый");
      }
    }
}
