package lesson14.enums;

enum Seasons {
    WINTER("Зима"),
    SUMMER("Лето"),
    SPRING("Весна"),
    AUTUMN("Осень");

    private String title;

    Seasons(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '}';
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println(Seasons.WINTER);
        for (Seasons s : Seasons.values()){
            System.out.println(s.name());
        }

        int ind = Seasons.AUTUMN.ordinal();
        System.out.println(ind);
        System.out.println(Seasons.values().length);

//        Seasons arg = Seasons.SPRING;
//
//        switch (arg){
//            case WINTER:
//                System.out.println("Сейчас зима"); break;
//            case SUMMER:
//                System.out.println("Сейчас лето"); break;
//            case SPRING:
//                System.out.println("Сейчас весна"); break;
//            case AUTUMN:
//                System.out.println("Сейчас осень"); break;
//        }
    }
}
