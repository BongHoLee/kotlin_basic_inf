package com.basic.kotlin.sec3.lec10

interface Swimable {
    // 코틀린에서는 인터페이스에 default 메서드를 바로 만들 수 있다.(default 키워드가 없어도)
    fun act() {
        println("어푸어푸")
    }
}
