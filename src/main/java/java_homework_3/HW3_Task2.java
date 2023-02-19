package java_homework_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class HW3_Task2 {
    public static void main(String[] args) {
        List<Integer> initialList = new ArrayList<>(Arrays.asList(46, 234, 465, 97, 3, -355, 0));
        System.out.println("Максимальное значение = " + Collections.max(initialList));
        System.out.println("Минимальное значение = " + Collections.min(initialList));
        averageValue(initialList);
    }
    public static void averageValue(List<Integer>list) {
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Среднее арифметическое = " + sum/list.size());
    }
}
