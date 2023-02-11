package com.basic.kotlin.sec3.lec10;

public class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimable{

    private final int WING_COUNT = 2;

    public JavaPenguin(String species) {
        super(species, 2);
    }

    @Override
    public void move() {
        System.out.println("펭귄은 파닥파닥");
    }

    @Override
    public int getLegCount() {
        return super.getLegCount() + this.WING_COUNT;
    }

    @Override
    public void act() {
        JavaSwimable.super.act();
        JavaFlyable.super.act();
    }
}
