package java_homework_4;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class HW4_Task2 {
    public static void main (String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("A");
        originalList.add("B");
        originalList.add("C");
        originalList.add("D");
        originalList.add("E");
        System.out.println("Начальный список " + originalList);
        System.out.println();
        System.out.println("Перевернутый список " + reverse(originalList));
    }

    public static LinkedList<String> reverse (LinkedList<String> list) {
        LinkedList<String> reverseList = new LinkedList<>();

        for(int i = 0; i < list.size(); i++) {
            String elem = list.get(i);
            reverseList.add(0, elem);
        } return reverseList;
    }
}
