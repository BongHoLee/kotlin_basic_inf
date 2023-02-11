package com.basic.kotlin.sec3.lec10

fun main() {
    val penguin = Penguin("황제펭귄", 10)
}

class Penguin(
    species: String,
    val wingSize: Int
) : Animal(species, 2), Swimable, Flyable {
    private val WING_COUNT = 2


    override fun move() {
        println("펭귄이 움직입니다 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.WING_COUNT

    // 인터페이스의 property를 오버라이딩 해서 커스텀 getter로 사용 가능하다.
    override val flyableAbility: Int
        get() = this.wingSize + 10

    // 중복되는 인터페이스를 특정할 때는 super<Type>.함수
    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}
