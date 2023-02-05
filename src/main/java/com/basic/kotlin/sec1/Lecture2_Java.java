package com.basic.kotlin.sec1;

import com.basic.kotlin.Person;

public class Lecture2_Java {
    public static void main(String[] args) {
        Person person = new Person("lee");
        String log = String.format("사람의 이름은 %s 입니다.", person.getName());

        StringBuilder builder = new StringBuilder();
        builder.append("사람의 이름은");
        builder.append(person.getName());
        builder.append("입니다.");
    }
}
