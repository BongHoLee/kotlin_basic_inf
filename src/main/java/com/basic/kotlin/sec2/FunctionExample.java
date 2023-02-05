package com.basic.kotlin.sec2;

public class FunctionExample {

    public void repeat(String str, int number, boolean useNewLine) {
        for (int i = 0; i < number; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int number) {
        repeat(str, number, true);
    }

    public void repeat(String str) {
        repeat(str, 3);
    }
}
