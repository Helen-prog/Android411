package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("На каком вы этаже: ");
//        int n1 = input.nextInt(); // 5
//        elevator(n1);
//        int[] mas = {1, 3, 5, 7, 9};
//////        System.out.println(sumList(mas));
//        System.out.println(sumList(0, mas));  // 25
//        System.out.println(Arrays.toString(mas));

        System.out.println(toStr(254, 16));
    }

    public static String toStr(int n, int base) {  // n = 15
        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (n < base)  // 15 < 16
            return convert[n];  // convert[15] => "F"
        else
            return toStr(n / base, base) + convert[n % base];  // toStr(254 / 16, 16) + convert[254 % 16] => convert[14]
        // => "E"
    }

//    public static int sumList(int i, int[] arr){  // i = 4, arr = {1, 3, 5, 7, 9}
//        if(i == (arr.length - 1))  // i == 4
//            return arr[i];  // 9
//        System.out.println(Arrays.toString(arr));
//        return arr[i] + sumList(i + 1, arr);  // 1 + 3 + 5 + 7 + 9
//    }


//    public static int sumList(int[] arr){ // arr = {1, 3, 5, 7, 9}
//        int sum = 0;
//        for(int i: arr){
//            sum += i;  // sum = sum + i => 25 = 16 + 9
//        }
//        return sum;  // 25
//    }

//    public static void elevator(int n){  // 0
//        if(n == 0){
//            System.out.println("Вы в подвале");
//            return;
//        }
////        System.out.println("=> " + n);
//        elevator(n - 1);  // стек: 5 4 3 2 1
//        System.out.print(n + " ");
//    }
}





