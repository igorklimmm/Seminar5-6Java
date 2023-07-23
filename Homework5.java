import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.ArrayList;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, 
// что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

public class Homework5 {
    

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов И.А.", 890011111, bookPhone);
        addNumber("Иванов И.А.", 890022222, bookPhone);
        addNumber("Баранов М.И", 890044444, bookPhone);
        addNumber("Сусанов А.Ю", 890055555, bookPhone);
        addNumber("Иванов И.А.", 890033333, bookPhone);
        addNumber("Баранов М.И", 890044445, bookPhone);
        printBook(bookPhone);
       }
}


   