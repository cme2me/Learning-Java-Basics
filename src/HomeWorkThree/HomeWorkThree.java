package HomeWorkThree;
import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(first(arr)));

        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > 6){
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));


        System.out.println(arrQWE(10)); // 4 задание не смог
    }

    public static int[] first(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }
    public static int[][] arrQWE(int x){
        int[][] arr4 = new int[x][x];
        for (int i = 0; i < x; i++) {
            arr4[i][i] = 1;
            arr4[i][x - 1 - i] = 1;
        }
        return arr4;
    }
}