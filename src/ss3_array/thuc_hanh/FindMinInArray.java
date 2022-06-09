package ss3_array.thuc_hanh;
public class FindMinInArray {
    public static void main(String[] args) {
        int[] array = {4,5,1,9,8,12,4,6,2};
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min){
                min = array[i];
                index = i;
            }

        }
        System.out.println("The smallest element in the array is :" + min + " Index : " + index);
    }
}
