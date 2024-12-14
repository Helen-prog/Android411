package lessons7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Practice {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
//            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15T21:25. Минуты, в диапазоне от 00 до 59. 2021-06-15T01:09.";
//            String s = "Цифры: 7, +17, -42, 0013, 0.3";
//            String s = "author=Пушкин А.С.; title  = Евгений Онегин; price =200; year= 1831";
//            String s = "12 сентября 2024 года 456789123";
//            String s = "+7 499 456-45-78, +74994564578, +7 (499) 456 45 78, 74994564578";
//            String s = "Java_mas-ter123";
//            String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 5910. Hel_lo World. Ели[-ели]. 2000000000000000000";
//            String pattern = "[0-2][0-9]:[0-5][0-9]";
//            String pattern = "[+-]?[\\d.]+";  // 7 +17 -42 0013 0.3
//            String pattern = "[+-]?\\d+\\.?\\d*";  // 7 +17 -42 0013 0.3
//            String pattern = "\\w+\\s*=\\s*[А-я0-9 .]+";
//            String pattern = "\\w+\\s*=[^;]+";
//            String pattern = "\\d{2,}";
//            String pattern = "\\+?7\\d{10}";
//            String pattern = "^\\w+\\s\\w+";
//            String pattern = "\\w+\\s\\w+$";
//            String pattern = "^[\\w-]{3,16}$";  // [A-Za-z0-9_-]

            System.out.print("Введите дату в формате dd-mm-YYYY: ");  // 19-01-2024
            String s = input.nextLine();
            String pattern = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])$";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s);

//            System.out.println(matcher.find());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException pse){
            System.out.println("Неправильное регулярное выражение: " + pse.getMessage());
            System.out.println("Описание: " + pse.getDescription());
            System.out.println("Позиция: " + pse.getIndex());
            System.out.println("Неправильный шаблон: " + pse.getPattern());
        }
    }
}
