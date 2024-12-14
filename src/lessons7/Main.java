package lessons7;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 5910. Hel_lo World. Ели[-ели]. 2000000000000000000";
//        String s = "Суворова Виктория, Россия,  г. Сочи,     +7 999 555-77-33";
//        String s = "05-03-1987 // Дата рождения";
//        String s = "\\d+";
//        String s2 = s.replaceAll("\\s//.*", "").replaceAll("-",".");
//        System.out.println("Дата рождения: " + s2);  // Дата рождения: 05.03.1987
//        String[] arr = s.split("\\.");
//        String[] arr = s.split(",\\s*");
//        System.out.println(Arrays.toString(arr));
//        for(String temp:arr){
//            System.out.println(temp);
//        }

//        String s = "one\ntwo\none";
//        String s = "Goods - 500$";
//        String s = "Java,\njava,\nJAVA";
//        String s = "<body>Пример жадного соответствия регулярных выражений</body>";
//        String s = "Егорова Алиса Александровна";
//        String s = "Word2016, PS6, AI5";
//        String s = "He";
//        String s = "Ольга и Виталий отлично учатся";
//        String s = "int = 4, float= 4.0f, double  = 8.0";
//        String s = "127.0.0.1";
//        String s = "192.168.255.255";
//        String pattern = "[21][0-9][0-9][0-9]";
//        String pattern = "[А-яЁё]";  // "[А-Яа-яЁё]"
//        String pattern = "[A-Za-z]";  //
//        String pattern = "[А-яЁё\\[\\]-]";
//        String pattern = "[^0-9]";
//        String pattern = "\\.";
//        String pattern = "\\d";  // цифра [0-9]
//        String pattern = "\\D";  // не цифра [^0-9]
//        String pattern = "\\s";  // пробел
//        String pattern = "\\S";  // не пробел
//        String pattern = "\\w";  // [A-Za-z0-9_]
//        String pattern = "\\W";  // не [A-Za-z0-9_]
//        String pattern = "\\AЯ ищу";  // поиск с начала строки
//        String pattern = "Ели\\[-ели\\].\\z";  // поиск в конце строки
//        String pattern = "\\d?";
//        System.out.println("Исходная строка: " + s);
//        String pattern = "я";
//        String pattern = "\\d #поиск цифр";
//        String pattern = "one.\\w+";
//        String pattern = "\\w+$";
//        String pattern = "500$";
//        String pattern = "(?mi)^java";
//        String pattern = "<.*?>";
//        String pattern = "А.+?а";
//        String pattern = "([a-z]+)(\\d*)";
//        String pattern = "(.(.(.))(.*))";
//        String pattern = "Петр|Ольга|Виталий";
//        String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)";
//        String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
//        String pattern = "(\\d{1,3}\\.){3}\\d{1,3}";
        String pattern = "\\d+";

//        String pattern = "20*";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
//        Pattern regex = Pattern.compile(pattern, Pattern.COMMENTS);
//        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
//        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE);
//        Pattern regex = Pattern.compile(pattern, Pattern.LITERAL);
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
//        System.out.println(matcher.find());
//        matcher.find();
//        System.out.println(matcher.groupCount());
//        for (int i = 0; i <= matcher.groupCount(); i++) {
//            System.out.println(i + ": " + matcher.group(i));
//        }
        while (matcher.find()){
//            System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end() - 1));
//            System.out.println(s.substring(matcher.start(), matcher.end()));
            System.out.println(matcher.group());
//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
        }
    }
}

/* Кол-во повторений
 + - от 1 до бесконечности
 * - от 0 до бесконечности
 ? - от 0 до 1
*/

/*
*?, +?, ??
{m,n}?, {m,}?
*/