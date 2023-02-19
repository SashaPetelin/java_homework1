package java_homework_2;

// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).

import java.util.Scanner;
public class HW2_Task1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово или фразу");
        String data = scan.nextLine();
        System.out.println(checkPalindrome(data));
    }
    public static boolean checkPalindrome(String line) {
        StringBuilder line2 = new StringBuilder(line.replaceAll("\\W", ""));
        return line.replaceAll("\\W", "").equalsIgnoreCase(line2.reverse().toString());
    }
}
