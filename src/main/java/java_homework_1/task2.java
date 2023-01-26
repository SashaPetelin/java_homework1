package java_homework_1;
import java.util.Scanner;
//Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class task2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Для определения необходимо ввести год: ");
        int year = keyboard.nextInt();
    // вводим логическую переменную, для которой истина - выполнение условия.
    // если выполняется - то вернется True и, соответственно, год високосный;
    // если нет - то вернется false и год - не високосный.
        boolean leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leap){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
