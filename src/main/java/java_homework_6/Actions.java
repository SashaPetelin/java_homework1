package java_homework_6;

import java.util.*;
public class Actions {
    private List<Laptop> laptops;
    private static Scanner scan = new Scanner(System.in);

    public Actions(List<Laptop> laptops) {
        this.scan = new Scanner(System.in);
        this.laptops = laptops;
    }

    public String Entry() {
        System.out.print("Введите номер пункта здесь: ");
        String item = scan.next();
        return item;
    }
    public void ChooseAction() {
        System.out.println("Выберите пункт меню для дальнейших действий:\n" +
                "1 - для вывода всего списка ноутбуков;\n" +
                "2 - для вывода ноутбука по определенному критерию;\n" +
                "3 - для завершения.");
        System.out.println();
        String choice = Entry();

        switch (choice) {
            case "1":
                printList();
                break;
            case "2":
                filtration();
                break;
            case "3":
                System.out.println("До свидания! Ждем Вас снова!");
                break;
        }
    }

    public void printList() {
        for (Laptop laptop : laptops) {
            {
                System.out.println(laptop);
            }
        }
    }

    public <laptops> void filtration() {
        scan = new Scanner(System.in);
        System.out.print("Выберите критерий:\n" +
                " '1' - оперативная память;\n" +
                " '2' - диагональ экрана;\n" +
                " '3' - тип матрицы;\n" +
                " '4' - цвет.");
        System.out.println();
        System.out.print("Ввод: ");
        String criterion = scan.nextLine();

        switch (criterion) {
            case "1":
                System.out.println("Введите размер RAM (8, 16, 32, 64)");
                System.out.print("Ввод: ");
                int ram = scan.nextInt();
                for (Laptop laptop : laptops) {
                    if (laptop.getRAM() == ram) {
                        System.out.println(laptop);
                    } else if (ram >= 64) {
                        System.out.println("Нет подходящих ноутбуков");
                        break;
                    }
                }
                break;
            case "2":
                System.out.println("Введите размер диагонали экрана (13,3 или 15,6)");
                System.out.print("Ввод: ");
                double diagonal = scan.nextDouble();
                for (Laptop laptop : laptops) {
                    if (laptop.getDiagonal() == diagonal){
                        System.out.println(laptop);
                    } else if (diagonal > 15.6) {
                        System.out.println("Нет подходящих ноутбуков");
                        break;
                    }
                }
                break;
            case "3":
                System.out.println("Введите тип матрицы (IPS или TN)");
                System.out.print("Ввод: ");
                String matrix = scan.nextLine().toUpperCase();
                for (Laptop laptop : laptops) {
                    if (Objects.equals(laptop.getMatrixType(), matrix)) {
                        System.out.println(laptop);
                    }
                }
                break;
            case "4":
                System.out.println("Введите цвет ноутбука (grey, black, white)");
                System.out.print("Ввод: ");
                String color = scan.nextLine().toLowerCase();
                for (Laptop laptop : laptops) {
                    if (Objects.equals(laptop.getColor(), color)) {
                        System.out.println(laptop);
                    }
                }
                break;
        }
    }
}