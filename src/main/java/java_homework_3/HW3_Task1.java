package java_homework_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class HW3_Task1 {
    public static void main(String[] args) {
        List<Integer> initialList = new ArrayList<>(Arrays.asList(21, 46, 2, -67, 8, 31, 54));
        System.out.println("Начальный список чисел = " + initialList);

        for (Iterator<Integer> iterator = initialList.iterator(); iterator.hasNext();) {              // Для перебора списка используем метод Iterator(чтобы итерация каждый раз шла сначала), и при помощи
            Integer number = iterator.next();                                                         // метода remove() удалить из списка элемент, если он четный
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Список без четных чисел =  " + initialList);
    }
}
