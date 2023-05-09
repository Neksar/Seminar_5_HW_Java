package Seminar_5_HW_Java;

import java.util.*;

public class homework_2 {
    public static void main(String[] args) {
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин",
                "Иван Ежов"};

        Map<String, Integer> nameCount = new TreeMap<>(Collections.reverseOrder());

        for (String employee : employees) {
            if (nameCount.containsKey(employee)) {
                nameCount.put(employee, nameCount.get(employee) + 1);
            } else {
                nameCount.put(employee, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}