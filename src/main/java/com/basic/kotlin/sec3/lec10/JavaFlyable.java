package com.basic.kotlin.sec3.lec10;

public interface JavaFlyable {
    // default 메서드
    default void act() {
        System.out.println("파닥파닥");
    }

}
