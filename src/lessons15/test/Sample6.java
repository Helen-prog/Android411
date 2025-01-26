package lessons15.test;

interface Converter<F, T>{
    T convert(F from);
}

public class Sample6 {
    public static void main(String[] args) {
        // Converter<String, Integer> converter = (from) -> Integer.valueOf(from);  // parseInt(String s)
        Converter<String, Integer> converter = Integer::valueOf;  // parseInt(String s)
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}
