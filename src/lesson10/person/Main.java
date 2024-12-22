package lesson10.person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Батодалаев", "Даши", 16);
        System.out.println(human);
//        System.out.println(human.toString());


        Student student1 = new Student(human, "Физика", "Ф-23", 0, 0);
        System.out.println(student1);

        Student student = new Student("Загидуллин", "Линар", 32, "Математика", "MM_220", 90, 95);
        System.out.println(student);

        Graduate graduate1 = new Graduate(student, "Математические вычисления");
        System.out.println(graduate1);

        Graduate graduate = new Graduate("Шугани", "Сергей", 25, "Сети", "DS_11", 80, 20, "Защита персональных данных");
        System.out.println(graduate);

        Specialist specialist = new Specialist(graduate, 5);
        System.out.println(specialist);
    }
}
