import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
    private static final Scanner sc = new Scanner(System.in);

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static int[] inputArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int sumElements(int[] array) {
        int summ = 0;
        for (int i=0; i<array.length;i++)
        {
            summ = summ + array[i];
        }
        return summ;
    }

    public static long getCountOfEven(int[] array) {
        int summ = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]%2==0){
                summ = summ + array[i];
            }
        }
        return summ;
    }

    public static long getCountOfRanged(int l, int r, int[] array) {
        int summ = 0;
        for (int i = 0; i<array.length; i++){
            if ((i>=l)||(i<=r)){
                summ = summ + array[i];
            }
        }
        return summ;
    }

    public static boolean isPositiveArray(int[] array) {
        int b = array.length;
        int summ = 0;
        boolean checking = true;
        while (checking == true){
            for (int i = 0; i<b; i++){
                if (array[i]<0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
}
