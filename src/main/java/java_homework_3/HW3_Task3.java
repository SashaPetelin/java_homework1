package java_homework_3;

import java.util.*;
import java.util.stream.Collectors;
public class HW3_Task3 {
    public static void main(String[] args) {
        planetList();
    }
    public static void planetList() {
        List<String> planets = new ArrayList<>();
        Random rand = new Random();

        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 25; i++) {
            int randomIndex = rand.nextInt(solarSystemPlanets.length);
            planets.add(solarSystemPlanets[randomIndex]);
        }
        System.out.println("Сисок всех планет Солнечной системы" + Arrays.toString(solarSystemPlanets));
        System.out.println("Список с повторяющимися элементами " + planets);
        List<String> noDouble = planets.stream().distinct().collect(Collectors.toList());
        System.out.println("Список без повторяющихся элементов " + noDouble);
    }
}
