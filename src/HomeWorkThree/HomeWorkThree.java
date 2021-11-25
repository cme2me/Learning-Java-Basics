package HomeWorkThree;
import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(first(arr)));
    }

    public static int[] first(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }
}