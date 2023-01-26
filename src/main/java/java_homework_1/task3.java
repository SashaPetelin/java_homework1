package java_homework_1;
import java.util.Arrays;

// Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class task3 {
    public static void main(String[] args){
    int[] nums = {3,2,5,3,4,8,3,1,2,6,3};
    int digit = 3;
    Reform(nums,digit);
    }

    public static void Reform (int[] array, int num){
        int i = 0;
        int j = array.length-1;
        while (i<j){
            if (array[i] == num && array[j] != num){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            } else if (array[i] != num) {
                i++;
            } else if (array[j] == num) {
                j--;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
