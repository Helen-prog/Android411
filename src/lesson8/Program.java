package lesson8;

public class Program {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.displayInfo();
//        p1.name = "Irina";
//        p1.age = 28;
//        System.out.println(p1.name);
//        Person p2 = new Person("Валентин");
//        p2.displayInfo();

//        int a = 225;
        Person p3 = new Person("Марина", 255);
//        p3.setName("Валерий");
//        p3.age = 20;
//        System.out.println(p3.getName());
//        p3.setAge(28);
//        p3.setAge(258);
        p3.displayInfo();
//        Person n = new Person();
//        n.displayInfo();
    }
}

class Person {
    private String name;  // свойства
    private int age;

//    {
//        name = "неизвестно";
//        age = 18;
//    }

//    public Person() {
////        this("неизвестно", 18);
//    }

//    public Person(String n) {
////        this(n, 18);
//        this.name = n;
//    }

    public Person(String name, int age) {
//        this.name = n;
//        this.age = a;
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age <110)
            this.age = age;
//        else {
//            System.out.println("Некорректное значение");
//        }
    }

    void displayInfo() {
        System.out.printf("Name: %s%nAge: %d%n", name, age);
    }
}
