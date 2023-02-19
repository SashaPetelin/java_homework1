package java_homework_4;

// Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.*;
public class HW4_Task1 {
    public static void main (String[] args) {
        StringsList();
    }

    public static void StringsList() {

        List<String> linkedList = new LinkedList<>();

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение строки\n" +
                    "Введите 'print', чтобы поменять местами первую и последнюю строку\n" +
                    "Введите 'revert' для удаления предыдущей введенной строки ");
            System.out.println();
            System.out.print("Ввод: ");
            String str = scanner.nextLine();
            System.out.println();
            linkedList.add(str);
            if (str.equals("print")) {
                linkedList.remove(linkedList.size()-1);
                System.out.println("Начальный список введенных данных = " + linkedList);
                String changeFirst = linkedList.get(0);
                String changeLast = linkedList.get(linkedList.size()-1);
                swap(linkedList, changeFirst, changeLast);
                System.out.println("Список, где последняя введенная строка - первая, а первая - последняя = " + linkedList);
                return;
            } else if (str.equals("revert")) {
                linkedList.remove(linkedList.size()-1);
                System.out.println("Начальный список введенных данных = " + linkedList);
                System.out.println("Удаленный элемент = " + (linkedList.get(linkedList.size()-2)));
                linkedList.remove(linkedList.size()-2);
                System.out.println("Список, где удалили предыдущее введенное значение = " + linkedList);
                return;
            }
        }
    }
    public static void swap(List<String> list, String element1, String element2) {
        int index1 = list.indexOf(element1);
        int index2 = list.indexOf(element2);
        list.set(index1, element2);
        list.set(index2, element1);
    }
}
