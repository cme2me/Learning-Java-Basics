package hw2;

public class HomeWorkTwo {
    public static void main(String[] args) {
        from10to20(1,13);
        minusOrPluse(-10);
    }
    public static void from10to20(int a, int b){
        int sum = (a+b);

        if(sum>=10 && sum<=20){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
    public static void minusOrPluse(int a) {
        if (a > -1) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}

