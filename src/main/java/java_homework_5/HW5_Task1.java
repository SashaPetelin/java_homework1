package java_homework_5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.*;

public class HW5_Task1 {
    public static void main(String[] args) {
        CreatingPhoneBook();
    }

    public static void CreatingPhoneBook() {
        HashMap<String, String> phoneBook = new HashMap<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Хотите завести контакт в телефонную книгу?\n" +
                    "Введите Y, если да. Введите N, если нет (при этом справочник появится на экране).");
            System.out.println();
            System.out.print("Ввод: ");
            String answer = scanner.nextLine();
            System.out.println();
            if (answer.equals("Y")) {
                System.out.print("Введите номер телефона: ");
                String num = scanner.nextLine();
                String phoneNumber = num.replaceAll("[^0-9]", "");
                System.out.print("Введите Фамилию, Имя и Отчество: ");
                String name = scanner.nextLine();
                phoneBook.put(phoneNumber, name);
                System.out.println();
            } else if (answer.equals("N") && !(phoneBook.isEmpty())) {
                System.out.println("Телефонный справочник = " + phoneBook);
                return;
            } else {
                System.out.println("Справочник пустой!");
                return;
            }
        }
    }
}

