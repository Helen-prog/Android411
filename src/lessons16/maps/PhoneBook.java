package lessons16.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();  // {"Зотов": [778899, 112233, 445577], "Калинкин": [449988, 116655], "Романов": [889922]}
        addNumber("Зотов", 778899, bookPhone);
        addNumber("Зотов", 112233, bookPhone);
        addNumber("Калинкин", 449988, bookPhone);
        addNumber("Романов", 889922, bookPhone);
        addNumber("Зотов", 445577, bookPhone);
        addNumber("Калинкин", 116655, bookPhone);
        printBook(bookPhone);
    }

    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);  // [889922]
            map.put(key, list);
        }
    }

    public static void printBook(HashMap<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";  // 778899, 112233, 445577,
            int i = 1;  // 3
            for(int el : item.getValue()){
                    phones = phones + el + ", ";
//                phones = phones + el + (item.getValue().size() == i ? "" : ", ") ;
//                i++;
            }
            phones = phones.substring(0, phones.length() - 2);
            System.out.printf("%s: %s%n", item.getKey(), phones);
        }
    }
}
