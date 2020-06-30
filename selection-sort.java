import java.util.Scanner;

class selectionSort {
    public static void main(String[] args) {

        int[] intArray = { 20, -11, 35, -6, 17, 55 };

        for (int lastUnsorted = intArray.length - 1; lastUnsorted > 0; lastUnsorted--) {
            int larger = 0;
            for (int i = 1; i <= lastUnsorted; i++) {
                if (intArray[larger] < intArray[i]) {
                    larger = i;
                }
            }
            swap(intArray, larger, lastUnsorted);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}