package seminar5;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDirectory {
    private HashMap<String, ArrayList<Integer>> studentMap = new HashMap<>();

    // Добавляет или обновляет запись о студенте
    public void addStudent(String name, Integer grade) {
// Напишите свое решение ниже
        studentMap.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
    }

    // Находит оценки студента по имени
    public ArrayList<Integer> findStudent(String name) {
// Напишите свое решение ниже
        return studentMap.getOrDefault(name, new ArrayList<>());
    }

    // Возвращает весь справочник студентов
    public HashMap<String, ArrayList<Integer>> getAllStudents() {
// Напишите свое решение ниже
        return studentMap;
    }

    // Удаляет запись о студенте по имени
    public void removeStudent(String name) {
// Напишите свое решение ниже
        studentMap.remove(name);
    }
}
