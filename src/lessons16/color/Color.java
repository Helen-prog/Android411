package lessons16.color;

public class Color {
    String name;

    public Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}
