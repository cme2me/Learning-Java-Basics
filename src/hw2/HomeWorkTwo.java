package hw2;

public class HomeWorkTwo {
    public static void main(String[] args) {
        from10to20(1,13);
        minusOrPluse(-10);
        fullOrNot(5);
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
    public static int fullOrNot(int a){
        if(a<0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        return a;
    }
}

