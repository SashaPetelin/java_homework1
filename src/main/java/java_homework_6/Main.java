package java_homework_6;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Apple", "Pro", 13.3, "IPS", 8, "grey", 115000);
        Laptop laptop2 = new Laptop("HP", "Pavilion", 15.6, "IPS", 8, "black", 96000);
        Laptop laptop3 = new Laptop("Lenovo", "IdeaPad", 15.6, "TN", 8, "black", 70000);
        Laptop laptop4 = new Laptop("DELL", "Latitude", 15.6, "IPS", 8, "black", 51000);
        Laptop laptop5 = new Laptop("Acer", "Extensa", 15.6, "TN", 4, "black", 31000);
        Laptop laptop6 = new Laptop("ASUS", "ROG", 15.6, "IPS", 16, "white", 128000);
        Laptop laptop7 = new Laptop("MSI", "Raider", 15.6, "IPS", 32, "black", 190000);

        List<Laptop> list = List.of(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7);

        Actions actions;
        actions = new Actions(list);
        actions.ChooseAction();

    }
}
