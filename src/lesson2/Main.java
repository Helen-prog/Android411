package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = input.nextInt();
//        System.out.println("Вы ввели число: " + num);
//        System.out.print("Имя: ");
//        String name = input.nextLine();
////        String name = input.next();
//        System.out.print("Возраст: ");
//        int age = input.nextInt();
////        System.out.print("Рост: ");
////        float height = input.nextFloat();
////        System.out.printf("Имя: %s. Возраст: %d. Рост: %.2f %n", name, age, height);
//        System.out.println(name + " " + age);

//        System.out.print("Возраст: ");
//        int age = input.nextInt();  // 26\n
//        input.nextLine(); // \n


//        System.out.print("Рост: ");
//        float height = input.nextFloat(); // 1.7\n
//        input.nextLine();
//        System.out.print("Имя: ");
//        String name = input.nextLine();
//
//        System.out.println(name + " " + height);
//        input.close();
//        System.out.println("Введите четыре числа :");
//        System.out.print("1: ");
//        int num1 = input.nextInt();
//        System.out.print("2: ");
//        int num2 = input.nextInt();
//        System.out.print("3: ");
//        int num3 = input.nextInt();
//        System.out.print("4: ");
//        int num4 = input.nextInt();
//        System.out.printf("Результат : %.2f %n", (float) (num1 + num2) / (num3 + num4));
//        input.close();
//        int a = 5;
//        System.out.println(a + 10);  // 15, a = 5
////        a += 10;  // a = a + 10
//        a -= 2;  // a = a - 2
//        System.out.println(a);  //

//        int a, b, c, sum;
//        System.out.print("Введите 1 число: ");
//        a = input.nextInt();
//        System.out.print("Введите 2 число: ");
//        b = input.nextInt();
//        System.out.print("Введите 3 число: ");
//        c = input.nextInt();
//        sum = a + b + c;
//        System.out.println("Сумма чисел: " + sum);

//        int sum;
//        System.out.print("Введите 1 число: ");
//        sum = input.nextInt();
//        System.out.print("Введите 2 число: ");
//        sum += input.nextInt();
//        System.out.print("Введите 3 число: ");
//        sum += input.nextInt();
////        sum = a + b + c;
//        System.out.println("Сумма чисел: " + sum);

//        int a = 5;
//        int b = 5;
//        System.out.println(a == b); // false
//        System.out.println(a != b); // true
//        System.out.println(a > b); //
//        System.out.println(a >= b); //
//        System.out.println(a < b); //
//        System.out.println(a <= b); //

//        boolean a1 = 25 > 6 && 5 < 3  && 4 == 4 + 2;  // true && false && true => false
//        boolean a2 = 5 < 3;
//
//        System.out.println(a1);
//        System.out.println(!a2);

        /*
           if (условие){
                команда 1
           } else {
                команда 2
           }
        */

//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
//        if (age >= 18) {
//            System.out.println("Доступ на сайт разрешен");
//            System.out.println("Добро пожаловать");
//        } else {
//            System.out.println("Доступ запрещен");
//            System.out.println("Вход разрешен с 18 лет");
//        }

//        int num1 = 17;
//        int num2 = 7;
//        if (num1 > num2){
//            System.out.println("Первое число больше второго");
//        }
//        if (num1 < num2){
//            System.out.println("Первое число меньше второго");
//        }
//        if (num1 == num2){
//            System.out.println("Числа равны");
//        }

//        int num1 = 17;
//        int num2 = 7;
//        if (num1 > num2){
//            System.out.println("Первое число больше второго");
//        }
//        else if (num1 < num2){
//            System.out.println("Первое число меньше второго");
//        } else {
//            System.out.println("Числа равны");
//        }

//        int age = 25;
//        if (age >= 18 && age <= 65){  // ||
//            System.out.println("Вы можете работать");
//        } else {
//            System.out.println("Работать не обязательно");
//        }

//        int age = 5;
//        if (age < 18 || age > 65) {
//            System.out.println("Работать не обязательно...");
//        } else {
//            System.out.println("Можете работать...");
//        }
//        System.out.print("Введите первую сторону :");
//        int side1 = input.nextInt();
//        System.out.print("Введите вторую сторону :");
//        int side2 = input.nextInt();
//        System.out.print("Введите третью сторону :");
//        int side3 = input.nextInt();
//        if (side1 == side2 && side1 == side3 && side2 == side3) {
//            System.out.println("Треугольник равносторонний...");
//        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
//            System.out.println("Треугольник равнобедренный...");
//        } else {
//            System.out.println("Треугольник разносторонний...");
//        }

//        int day, time;
//        System.out.print("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5){
//            System.out.print("Рабочий день.\nВведите время: ");
//            time = input.nextInt();
//            if (time >= 9 && time <= 18){
//                System.out.println("Открыто");
//            } else {
//                System.out.println("Закрыто. Откроется в 9:00");
//            }
//        } else if (day == 6 || day == 7){
//            System.out.println("Выходной день.");
//        } else {
//            System.out.println("Такого дня недели не существует");
//        }

//        int n;
//        System.out.print("Введите кол-во ворон: ");
//        n = input.nextInt();
//        if (n >= 0 && n <= 9){
//            System.out.print("На ветке ");
//            if (n == 1){
//                System.out.println(n + " ворона");
//            } else if(n >= 2 && n <= 4){
//                System.out.println(n + " вороны");
//            } else {  // else if (n >= 5 && n <= 9 || n == 0){
//                System.out.println(n + " ворон");
//            }
//        } else {
//            System.out.println("Ошибка ввода данных");
//        }

//        int day;
//        System.out.print("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5) {
//            System.out.print("Рабочий день ");
//            if (day == 1) System.out.print("Понедельник");
//            if (day == 2) System.out.print("Вторник");
//            if (day == 3) System.out.print("Среда");
//            if (day == 4) System.out.print("Четверг");
//            if (day == 5) System.out.print("Пятница");
//        } else if (day == 6 || day == 7) {
//            System.out.print("Выходной день ");
//            if (day == 6) System.out.print("Суббота");
//            if (day == 7) System.out.print("Воскресение");
//        } else {
//            System.out.println("Такого дня недели не существует");
//        }

//        int number, res;
//        number = -5;
//        res = number >= 0 ? number : -number;
//        System.out.println(res);

//        int age;
//        System.out.print("Введите возраст: ");
//        age = input.nextInt();
//        System.out.println(age >= 18 ? "Приятного просмотра" : "Вам еще рано смотреть этот фильм");

//        int a = 20, b = 30;
//        System.out.println(a == b ? "a == b" : (a > b ? "a > b" : "b > a"));
//
//        int n = true ? (false ? 10 : 20) : 30;
//        System.out.println(n);  // 20

//        int a = 20, b = 0, c;
//        System.out.println(b == 0 ? "на ноль делить нельзя" : (float) a / b);

//        int n;
//        System.out.print("\tВыбор цвета светофора\n1 (11) - красный, 2 (22) - желтый, 3 (33) - зеленый: ");
//        n = input.nextInt();
//        switch (n) {
//
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета у светофора нет");
//        }
//        System.out.println("Код далее");

//        int month;
//        int numDay = 0;
//        int year;
//        System.out.print("Введите месяц числом: ");
//        month = input.nextInt();
//
//        switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDay = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDay = 30;
//                break;
//            case 2:
//                System.out.print("Введите год: ");
//                year = input.nextInt();
//                if(year % 4 == 0){
//                    numDay = 29;
//                } else {
//                    numDay = 28;
//                }
//                break;
//            default:
//                System.out.println("Такого месяца не существует");
//        }
//        if (month >= 1 && month <= 12){
//            System.out.println("Количество дней: " + numDay);
//        }

//        int n = 0;
//        System.out.print("\tВведите номер месяца: ");
//        n = input.nextInt();
//        switch (n) {
//            case 1:
//            case 2:
//            case 12:
//                System.out.print("Зима...");
//                System.out.print("!!!Зима...");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.print("Весна...");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.print("Лето...");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Оень...");
//                break;
//            default:
//                System.out.println("Такого месяца не существует.");
//                break;
//        }
//        input.close();

//        int n;
//        System.out.print("\tВведите номер месяца: ");
//        n = input.nextInt();
//        String s = switch (n) {
//            case 1, 2, 12 -> "Зима...";
//            case 3, 4, 5 ->  "Весна...";
//            case 6, 7, 8 ->  "Лето...";
//            case 9, 10, 11 ->  "Осень...";
//            default -> "Такого месяца не существует.";
//        };
//        System.out.print(s);

//        System.out.print("Введите балл по 12 бальной системе оценивания: ");
//        int num = input.nextInt();
//        System.out.print("Ваш балл по 5 бальной системе оценивания: ");
//        switch ((num >= 1 && num <= 3) ? 2 :
//                (num >= 4 && num <= 6) ? 3:
//                (num >= 7 && num <= 9) ? 4 :
//                (num >= 10 && num <= 12) ? 5 : 0){
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("Такого значения нет");
//        }

//        int i = 0;  // переменная счетчик
//        while (i < 5) {  // условие
//            System.out.println(i);
//            i++; // шаг цикла
//        }

//        int i = 5;
//        while (i > 0) {
//            System.out.println(i);
//            i--;
//        }

//        int i = 20;
//        while (i > 0) {
//            System.out.println(i);
//            i = i / 5;
////            i = i - 10;
////            i = i / 2;
//        }

//        int n, sum = 0;
//
//        System.out.print("Введите число: ");
//        while (input.hasNextInt()){
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n;  // sum = sum + n;
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//        int start, finish, sum = 0;
//        System.out.print("Введите начало диапазона: ");
//        start = input.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        finish = input.nextInt();
//        while (start <= finish){
//            if(start % 2 != 0)
//                sum += start;
//            start++;
//        }
//        System.out.println("Сумма нечетных чисел: " + sum);

//        int i = 0;
//        do{
//            System.out.println("i = " + i);
//            i++;
//        } while (i > 5);

//        while (i > 5){
//            System.out.println("i = " + i);
//            i++;
//        }

//        int num, sum = 0, count = 0;
//        float average;
//        do {
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if(num < 0){
//                sum += num; // sum = sum + num
//                count++;  // count = count + 1
//            }
//        } while (num != 0);
//        average = (float) sum / count;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f", average);


//        int num, sum = 0, count = 0;
//        float average;
//        System.out.print("Введите число: ");
//        num = input.nextInt();
//        if(num < 0){
//            sum += num; // sum = sum + num
//            count++;  // count = count + 1
//        }
//        while (num != 0){
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if(num < 0){
//                sum += num; // sum = sum + num
//                count++;  // count = count + 1
//            }
//        }
//        System.out.println("sum: " + sum);
//        System.out.println("count: " + count);
//        average = (float) sum / count;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f", average);

//        int number, copy, reverse_number = 0;
//        System.out.print("Введите число: ");
//        number = input.nextInt();  // 321
//        copy = number;  // 0
//        do{
//            reverse_number *= 10;  // reverse_number = reverse_number * 10;  reverse_number = 12 * 10 => 120
//            reverse_number += copy % 10;  // reverse_number = reverse_number + copy % 10; reverse_number = 120 + 3 => 123
//            copy /= 10;  // 3
//        } while (copy > 0);
//        System.out.println("Число " + number + (number == reverse_number ? " ":" не ") + "палиндром" );

//        int i = 0;
//        while (i < 10){
//            if (i == 3){
//                i++;  // 4
//                continue;
//            }
//            System.out.println(i);
//            if (i == 5){
//                break;
//            }
//            i++;
//        }
//        System.out.println("Цикл завершен");

//        int i = 0;
//        while (true) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }

//        int n;
//        while (true) {
//            System.out.print("Введите положительное число: ");
//            n = input.nextInt();
//            if (n < 0) {
//                break;
//            }
//        }

//        int n = 0, proizv = 0;
//        while (true) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            if (n == 0) break;
//            if (proizv == 0)
//                proizv++;
//            proizv *= n;
//        }
//        System.out.println("Произведение чисел : " + proizv);
//        input.close();

//        int n = 0, proizv = 1;
//        while (true) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            if (n == 0) break;
//            proizv *= n;
//        }
//        System.out.println("Произведение чисел : " + proizv);
//        input.close();

//        int i = 1;
//        while (i < 5){
//            System.out.println("Внешний цикл: i = " + i);
//            int j = 1;
//            while (j < 4){
//                System.out.println("\tВнутренний цикл: j = " + j);
//                j++;  // j == 4
//            }
//            i++;  // i == 5
//        }

//        int i = 1;
//        while (i < 10){
//            int j = 1;
//            while (j < 10){
//                System.out.print(i + " * " + j + " = " + i * j + "\t\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while (i < 4) {
//            int j = 1;
//            while (j < 7) {
//                System.out.print("^");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                if (j % 2 == 0) {
//                    System.out.print("+");
//                } else {
//                    System.out.print("-");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                System.out.print(i % 2 == 0 ? "+" : "-");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;  // 2
//        while (i < 5) {
//            int j = 0;  // 3
//            while (j < 5) {
//                System.out.print(i == j ? "+" : " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int j = 0;
//        do{
//            System.out.println(j);
//            j++;
//        } while (j < 5);

//        int i = 0;
//        for (;;){
//            System.out.println(i);
//            if (i == 4){
//                break;
//            }
//            i++;
//        }

//        int count = 0;
//        for(int i = 0; i < 6; i++){
//            System.out.print("-> ");
//            if(input.hasNextInt()){
//                count++;
//            }
//            input.nextLine();
//        }
//        System.out.println("Вы ввели чисел: " + count);

//        int n;
//        System.out.print("Количество символов: ");
//        n = input.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.print("*");
//        }

//        int n, orient;
//        String symbol;
//        System.out.print("Кол-во символов: ");
//        n = input.nextInt();
//        System.out.print("Тип символа: ");
//        symbol = input.next();
//        System.out.print("0 - горизонтальная\n1 - вертикальная\nориентация линии: ");
//        orient = input.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            if(orient == 1){
//                System.out.println(symbol);
//            } else {
//                System.out.print(symbol + " ");
//            }
//        }

//        int n;
//        System.out.print("Введите целое число: ");
//        n = input.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            if(n % i == 0){
//
//                System.out.print(i + " ");
//            }
//        }

//        for (int i = 10; i < 100; i++) {  // i++ => i = i + 1
//            if(i / 10 == i % 10)  // 12  1 == 2
//                System.out.print(i + " ");
//        }

//        for (int i = 10; i <= 100; i = i + 10) {  // i += 10  =>  i = i + 10
//            System.out.print(i + " ");
//        }

//        int a = 0;
//        for (int i = 5, a = 0; i > 0; i--, a++){
//            System.out.print("Шаг: " + a + " Значение: ");
//            System.out.println(i);
//        }

//        for (int i = 0; i < 3; i++) {
//            System.out.println("+++");
//            for (int j = 0; j < 2; j++) {
//                System.out.println("-----");
//            }
//        }

//        int w, h;
//        System.out.print("Введите ширину прямоугольника: ");
//        w = input.nextInt();
//        System.out.print("Введите высоту прямоугольника: ");
//        h = input.nextInt();
//
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                if(i == 0 || i == h - 1 || j == 0 || j == w - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 8; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 8; i++) { // i = 2
//            for (int j = 0; j < 8; j++) { // j = 0
//                if (i <= j)  // 2 >= 2
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}