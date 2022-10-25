package org.school;
import java.util.Arrays;

public class FirstApp {
    public static void main(String[] args) {
        draw();
    }
    public static void draw() {
        String[] str = {"banana", "orange", "apple"};
        for (String x : str) {
            System.out.println(x);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println(Arrays.toString(str));
        System.out.println("BANANA \nORANGE \nAPPLE");
        String text = """
                Pears
                Banana
                Orange
                Apple
                Plum
                """;
        System.out.println(text);
    }
    }


