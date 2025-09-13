import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Создание переменной типа List для хранения строк
        List<String> names = new ArrayList<>();

        // Добавление элементов в список
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Вывод элементов списка
        for (String name : names) {
            System.out.println(name);
        }
    }
}