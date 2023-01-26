package java_homework_1;

// Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class task1 {
    public static void main(String[] args) {
        int[] Arr = new int[]{5, 8, 1, -5, 4, 17, 7, 8, 3, 0, 6};
        System.out.println("Максимальное значение " + Max_val(Arr));
        System.out.println("Минимальное значение " + Min_val(Arr));
    }

    public static int Max_val(int[] nums) {
        int max = nums[0];
        int i = 0;
        while(i<nums.length){
            if(nums[i]>max){
               max = nums[i];
               i++;
            } else {
                i++;
            }
        } return max;
    }

    public static int Min_val(int[] nums) {
        int min = nums[0];
        int i = 0;
        while(i<nums.length){
            if(nums[i]<min){
                min = nums[i];
                i++;
            } else {
                i++;
            }
        } return min;
    }
}

