package lesson14.enums;

import java.util.regex.Pattern;

enum RegEx {
    UPPER("[A-Z]+"),
    LOWER("[a-z]+"),
    NUMERIC("[+-]?[0-9]+");

    private final Pattern pattern;

    RegEx(final String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public boolean test(final String input){
        return pattern.matcher(input).matches();
    }
}

public class Base {
    public static void main(String[] args) {
        System.out.println(RegEx.UPPER.test("AKKLKK"));
        System.out.println(RegEx.LOWER.test("hello"));
        System.out.println(RegEx.NUMERIC.test("-789"));
    }
}
