package java_homework_2;

import java.io.*;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.
public class HW2_Task2 {
    public static void main(String[] args) {
        String line = addTest();
        System.out.println(line);
        System.out.println(line.length());
        writeToFile(line);
    }
    public static String addTest () {
        StringBuilder test = new StringBuilder("TEST");
        for (int i = 0; i < 99; i++) {
            test.append("TEST");
        }
        String newTest = test.toString();
        return newTest;
    }
    public static void writeToFile (String str) {
        try (FileWriter writer = new FileWriter("file.txt", false)) {
            // запись строки
            writer.write(str);
            writer.flush();
            writer.close();
            System.out.println("Успешно!");
        } catch (IOException e) {
            System.out.println("Ошибка!" + e.getMessage());
        }
    }
}
