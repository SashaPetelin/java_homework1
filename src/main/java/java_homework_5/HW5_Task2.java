package java_homework_5;

// Пусть дан список сотрудников
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import com.sun.source.tree.BreakTree;

import java.io.*;
import java.util.*;
import java.util.HashMap;

public class HW5_Task2 {
    public static void main(String[] args) {
        System.out.println(ReadFile());
        System.out.println();
        System.out.println("Сортировка по количеству повторяющихся имен:  " + Unique(ReadFile()));
    }

    public static HashMap<Integer,String> ReadFile() {
        HashMap<Integer, String> employees = new HashMap<>();
        try {
            File file = new File("C:\\Users\\Дом\\IdeaProjects\\java_lessons\\src\\main\\java\\java_homework_5\\employees.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            int i = 1;
            while (line != null) {
                employees.put(i, line);
                line = reader.readLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static Map<String, Integer> Unique (HashMap<Integer,String> name) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> values = new ArrayList<>(name.values());
        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            sb.append(value);
            sb.append(" ");
        }
//        return sb;
        String str = sb.toString();
        String [] namesSurnames = str.split(" ");
        for (int i = 0; i < namesSurnames.length; i += 2) {
            if (map.containsKey(namesSurnames[i])) {
                map.replace(namesSurnames[i], map.get(namesSurnames[i]) + 1);
            } else {
                map.put(namesSurnames[i], 1);
            }
        }
//        return map;
        Map<String, Integer> sort = new LinkedHashMap<>();
        int max = 1;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                if (map.get(key) == i) {
                    sort.put(key, map.get(key));
                }
            }
        }
        return sort;
    }
}