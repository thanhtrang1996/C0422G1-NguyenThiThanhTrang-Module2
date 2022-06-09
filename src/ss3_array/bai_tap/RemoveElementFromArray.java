package ss3_array.bai_tap;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 0};
        int x = 7;
        int index = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
                count++;
                for (int j = index; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        if (count == 0) {
            System.out.println("Not found");
        }
        System.out.println(Arrays.toString(array));
    }

}
