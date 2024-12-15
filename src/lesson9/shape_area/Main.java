package lesson9.shape_area;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника по формуле Герона: " + Area.triangleArea1(3, 4, 5));
        System.out.println("Площадь треугольника по формуле Герона: " + Area.triangleArea1(3, 4, 5));
        System.out.println("Площадь треугольника через основание и высоту: " + Area.triangleArea2(6, 7));
        System.out.println("Площадь треугольника через основание и высоту: " + Area.triangleArea2(6, 7));
        System.out.println("Количество подсчета площади: " + Area.getCount());
    }
}
