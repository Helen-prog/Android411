package lesson10.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(-10, 20, "green");
//        rect.setWidth(20);
//        rect.setHeight(-5);
        System.out.println("Ширина: " + rect.getWidth());
        System.out.println("Высоты: " + rect.getHeight());
        System.out.println("Цвет: " + rect.getColor());
        System.out.println("Площадь: " + rect.area());
    }
}
