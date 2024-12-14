package lesson9.groups;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Student students[] = new Student[n];
        students[0] = new Student("Петров", "А.В.", 1);
        students[1] = new Student("Петров", "В.И", 1);
        students[2] = new Student("Иванов", "М.В.", 1);
        students[3] = new Student("Вербов", "И.М.", 2);
        students[4] = new Student("Долгих", "И.И.", 2);
        students[5] = new Student("Шишкин", "В.П.", 3);
        students[6] = new Student("Матрешкина", "А.В.", 3);
        students[7] = new Student("Волков", "П.В.", 3);
        students[8] = new Student("Колганов", "А.Б.", 3);
        students[9] = new Student("Репкин", "Д.В.", 3);

        Random rd = new Random();
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                students[i].addGrade(rd.nextInt(12) + 1);
            }
        }
        System.out.println("Все студенты: ");
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }
        System.out.println("\nСтуденты с хорошей успеваемостью:");
        for (int i = 0; i < students.length; i++) {
            if(students[i].isGood()){
                students[i].print();
            }
        }
    }
}
