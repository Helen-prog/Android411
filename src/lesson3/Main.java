package lesson3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int mas[] = new int[4];
//        int[] mas2 = new int[5];
//
//        int mas3[];
//        mas3 = new int[4];

//        int mas[] = new int[]{2, 7, 5, 3};
//        int mas[] = {2, 7, 5, 3};

//        int mas[] = new int[4];
//        mas[0] = 5;
//        mas[1] = 2;
//        mas[2] = 7;
//        mas[3] = mas[1] + mas[2];
//
////        System.out.println(mas[0]);
////        System.out.println(mas[1]);
////        System.out.println(mas[2]);
////        System.out.println(mas[3]);
////        System.out.println(mas.length);
////
////        int last = mas[mas.length - 1];
////        System.out.println(last);
//        for (int i = 0; i < mas.length; i++) {
//            System.out.println(mas[i]);
//        }

//        int n = 10;
//        int[] mas = new int[n];
//        System.out.println(mas.length);
//        mas[n - 1] = 2;  // mas[9] = 2
//        mas[n - 2] = 3;  // mas[8] = 3
//        mas[1] = 6;
//        mas[n / 5] = mas[n - 1] + mas[n - 2]; // mas[2] = mas[9] + mas[8] => 5
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }

//        int[] array = new int[4];
//        System.out.print("-> ");
//        array[0] = input.nextInt();
//        System.out.print("-> ");
//        array[1] = input.nextInt();
//        System.out.print("-> ");
//        array[2] = input.nextInt();
//        System.out.print("-> ");
//        array[3] = input.nextInt();
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//        int n;
//        System.out.print("Кол-во элементов массива: ");
//        n = input.nextInt();
//
//        int[] array;
//        if (n < 5) {
//            array = new int[n];
//            for (int i = 0; i < array.length; i++) {
//                System.out.print("-> ");
//                array[i] = input.nextInt();
//            }
//        } else {
//            array = new int[n];
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        for(int i = array.length - 1; i >= 0; i--){
//            System.out.print(array[i] + " ");
//        }
//        int[] array = {1, 4, 6, 3, 8};
//        System.out.println(array);
//        System.out.println(Arrays.toString(array));

//        int n, sum = 0;
//        int[] array;
//        System.out.print("n = ");
//        n = input.nextInt();
//        array = new int[n];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] < 0){
//                sum += array[i];  // sum = sum + array[i]
//            }
//        }
//        System.out.println("Сумма отрицательных элементов массива: " + sum);

//        int min;
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        min = array[0];  // min = 9
//        // [9, 5, 4, 6, 3]
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min){  // 3 < 4
//                min = array[i];  // min = 3
//            }
//        }
//        System.out.println("Минимальный элемент в массиве: " + min);

//        int n;
//        int[] array;
//        int sum = 0;
//        System.out.print("n= ");
//        n = input.nextInt();
//        array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("->");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length - 1; i++) {  // i = 0; i < 5
//            if (array[i] < array[i + 1]) {
//                System.out.print(array[i + 1]);
//            }
//        }
//        for (int i = 1; i < array.length; i++) {  // i = 1; i < 6
//            if (array[i] > array[i - 1]) {
//                System.out.print(array[i] + " ");
//            }
//        }

//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length + 5];
//
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1[i];
//        }
//
//        for (int i = 0; i < a2.length; i++) {
//            System.out.print(a2[i] + " ");
//        }

//        double a = Math.random();  // [0;1)
//        System.out.println(a);

        // (Math.random() * (max-min)) + min  => Math.random() * (3 - 0) + 0 => Math.random() * 3
//        double a = Math.random() * 3;  // [0;3)
//        System.out.println(a);

//        double a = 2 + Math.random() * 5;  // [2;7)
//        System.out.println(a);
//
//        // (Math.random() * (max-min)) + min  => Math.random() * (7 - 2) + 2 => Math.random() * 5 + 2
//        double b = Math.random() * 5 + 2;  // [2;7)
//        System.out.println(b);

        // (Math.random() * (max-min)) + min  => Math.random() * (5 - (-5)) + (-5) => Math.random() * 10 - 5
//        double b = Math.random() * 10 - 5;  // [-5;5)
//        System.out.println(b);

//        int a = (int) (Math.random() * 3);  // [0;3)
//        System.out.println(a);

//        int a = 3 + (int) (Math.random() * 2);  // [3;5)
//        System.out.println(a);

//        int a = (int) (Math.random() * (10 + 1)) - 5;  // [-5;5]
//        System.out.println(a);

        // [-2;5)
        // (Math.random() * (max-min)) + min
        // Math.random() * (5 - (-2)) + (-2) => Math.random() * 7 - 2
//        int b = (int) (Math.random() * 7) - 2 ;
//        System.out.println(b);

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 10);
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 12 + 2);  // [2;14)
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 31 - 15);  // [-15;16)
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);
//        }
//        System.out.println(Arrays.toString(array));
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            } else {
//                sum += array[i];
//            }
//        }
//        System.out.println("Количество четных элементов: " + count);
//        System.out.println("Сумма нечетных элементов: " + sum);

//        int[] numbers = {10, 20, 30, 40, 50};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        for(int x : numbers){  // int x = 10;
//            System.out.print(x + " ");
//        }

//        String[] names = {"Олег", "Иван", "Дима", "Юля"};
//        for (String name: names){
//            System.out.print(name + "\t");
//        }

//        int[] array = new int[50];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (i * Math.random());
//        }
//        for (int i : array) {
//            System.out.print(i + " ");
//        }

//        int[] array = new int[12];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);
//        }
//        for (int x : array) {
//            System.out.print(x + " ");
//        }

//        System.out.print("Введите начало диапазона: ");
//        int k = input.nextInt();  // 5
//        System.out.print("Введите конец диапазона: ");
//        int n = input.nextInt();  // 10
//
////        int[] array = new int[n];
//        if(k > n){
//            int temp = k;
//            k = n;
//            n = temp;
//        }
//        int[] array = new int[n - k + 1];
//        for (int i = 0, j = k; i <= n - k; i++, j++) {
//            array[i] = j;
//            System.out.print(array[i] + "\t");
//        }
//
//        System.out.println("\n" + Arrays.toString(array));

//        int h = 16;
//        int w = h * 2 - 1;  // 13
//        int m = w / 2;  // 6
//
//        for (int i = 0, l = m, r = m; i < h; i++, l--, r++) {
//            for (int j = 0; j < w; j++) { // l = 4, j = 7, r = 8
//                if(j >= l && j <= r)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

//        String[] cities = {"Брянск", "Иркутск", "Владивосток", "Армавир"};
//        String[] cities2 = new String[cities.length + 1];
//
//        for (int i = 0; i < cities.length; i++) {
//            cities2[i] = cities[i];
//        }
//
//        cities2[cities.length] = "Красноярск";
//        System.out.println(Arrays.toString(cities2));

        // ArrayList
//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Брянск");
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Армавир");
//        cities.add(1, "Красноярск");
//        System.out.println(cities);
//        System.out.println(cities.get(2));  // cities[2]
//        cities.set(2, "Курск");  // cities[2] = "Курск"
//        System.out.println(cities.size());
//
//        cities.remove(1);
//        cities.remove("Владивосток");

//        for (String city : cities) {
//            System.out.print(city + "\t");
//        }

//        for (int i = 0; i < cities.size(); i++) {
//            System.out.print(cities.get(i) + "\t");
//        }

//        System.out.println("\n" + cities.indexOf("Владивосток"));
//
//        if(cities.contains("Курск")){
//            System.out.println("ArrayList содержит Курск");
//        }

//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка: ");
//        while ((n = input.nextInt()) > 0){
//            mas.add(n);
//        }
//        System.out.println(mas);
//        System.out.print("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//        System.out.println(mas);

//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int) (Math.random() * 100));
//        }
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);  // mas[0]
//        for (int i = 0; i < 10; i++) {
//            if(mas.get(i) > max){
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax: " + max);
////        ind = mas.indexOf(max);  // индекс максимального элемента
////        mas.remove(ind);
//        mas.remove(mas.indexOf(max));
//        mas.add(0, max);
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }

//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
//        ArrayList<Integer> c = new ArrayList<>();
//
//        for (int i = 0; i < a.size(); i++) {
//            c.add(a.get(i));
//            c.add(b.get(i));
//        }
//
//        for (int i = a.size(); i < b.size(); i++) {
//            c.add(b.get(i));
//        }
//
////        for (int i = 0; i < b.size(); i++) {
////            if (i < a.size()) {
////                c.add(a.get(i));
////            }
////            if (i < b.size()) {
////                c.add(b.get(i));
////            }
////        }
//        System.out.println(c);

//        int[][] num = {
//                {0, 1, 2, 3},
//                {4, 5, 6, 7},
//                {8, 9, 10, 11}
//        };
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }

//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        char[][] graph = new char[n][n];
//        for (int i = 0; i < graph.length; i++) {
//            System.out.println(Arrays.toString(graph[i]));
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                graph[i][j] = '*';
//            }
//        }
//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < graph[i].length; j++) {
//                System.out.print(graph[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int n = 4, m = 3, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 31) - 20;
//            }
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//                if(mas[i][j] < 0){
//                    count++;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + count);

//        int a = 3;
//        int b = 3;
//        int first = 0;
//        int second = 0;
//        int third = 0;
//        int[][] array = new int[a][b];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                int random = ((int) (Math.random() * 101));
//                array[i][j] = random;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == 0) {
//                    first += array[i][j];
//                } else if (i == 1) {
//                    second += array[i][j];
//                } else {
//                    third += array[i][j];
//                }
//            }
//        }
//        System.out.println("Сумма элементов первой строки: " + first);
//        System.out.println("Сумма элементов второй строки: " + second);
//        System.out.println("Сумма элементов третьей строки: " + third);
//    }

//        int[][] mas = new int[3][5];
//        int pos = 0;
//        int sum = 0;
//        int minsum = Integer.MAX_VALUE;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 100); // заполняем случайными от 0 до 100
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                sum += mas[i][j];
//            }
//            if (minsum > sum) {
//                minsum = sum;
//                pos = i;
//            }
//            System.out.println("Сумма элементов " + (i + 1) + " строки: " + sum);
//            sum = 0;
//        }
//        System.out.println("Строка с минимальной суммой элементов " + minsum + " имеет номер: " + (pos + 1));

        // Зубчатый массив
//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print("-> ");
//                mas[i][j] = input.nextInt();
//            }
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};

//        int[][] mas = new int[][]{{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//        int[][] mas = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//        System.out.println(mas);

//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][] mas = new int[5][];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = new int[mas.length - i];
//        }
//        int count = 10;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int n = 16;
//        int[][] tp = new int[n][];
//        for (int i = 0; i < tp.length; i++) {
//            tp[i] = new int[i + 1];
//            tp[i][0] = 1;
//            tp[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                tp[i][j] = tp[i - 1][j - 1] + tp[i - 1][j];
//            }
//        }
//        for (int i = 0; i < tp.length; i++) {
//            for (int j = 0; j < tp.length - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < tp[i].length; j++) {
//                if (tp[i][j] > 9) {
//                    System.out.print(tp[i][j] + "  ");
//                } else {
//                    System.out.print(tp[i][j] + "   ");
//                }
//            }
//            System.out.println();

//        }


    }
}
