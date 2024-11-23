package lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "World";
//        str2 = str2 + "!";
//        System.out.println(str2);
//        String message = str1 + " " + str2;
//        System.out.println(message);

//        char[] helloArray = {'П', 'р', 'и', 'в', 'e', 'т'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);

//        String str1 = "Hello";
//        int a = 5;
//        String message = str1 + " " + a;
//        System.out.println(message);

//        String str1 = "2";
//        int a = 5;
//        String message = str1 + a;
//        System.out.println(message);  // 25

//        int a = 5;
//        String message = "" + a;
//        System.out.println(message);  // 5 - строка

//        String str1 = "2";
//        int a = 5;
//        int b = Integer.parseInt(str1);
//        int message = b + a;
//        System.out.println(message);  // 7

//        String str1 = "2";
//        int a = 5;
//        int message = Integer.parseInt(str1) + a;
//        System.out.println(message);  // 7

//        String str1 = "Hello";
//        int count = (str1 + 57).length();  // "Hello" + 57 => "Hello57".length()
//        System.out.println(count);


//        System.out.println(" ".length());

//        String name = "NiKitA";
////        String name2 = name.toLowerCase();
////        System.out.println(name2);
//        System.out.println(name.toLowerCase());
//        System.out.println(name);

//        String name = "NiKitA";
//        String name2 = name.toUpperCase();
//        System.out.println(name2);

//        String s = "Я буду хорошим программистом";
//        char res = s.charAt(7);  //
//        System.out.println(res);

        String s = "я буду хорошим программистом";
        System.out.println(s);
        int [] result = new int['я' - 'а' + 1];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'а' && ch <= 'я'){
                result[ch - 'а']++;
            }
        }
        System.out.println(Arrays.toString(result));

//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i + 'а') + " = " + result[i]);
//        }
    }
}
