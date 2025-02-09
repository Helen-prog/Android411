package lessons16.color;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"red", "orange", "aqua", "pink", "gray", "blue", "white", "black", "yellow", "brown"};

        HashMap<String, Color> map = addColorsToMap(colors);
        int i = 1;
        for(Map.Entry<String, Color> pair : map.entrySet()){
            System.out.println(i + ") " +  pair.getKey() + ": " + pair.getValue());
            i++;
        }
    }

    public  static HashMap<String, Color> addColorsToMap(String[] colors){
        HashMap<String, Color> color = new HashMap<>();
        for (String str: colors){
            color.put(str, new Color(str));
        }
        return color;
    }
}
