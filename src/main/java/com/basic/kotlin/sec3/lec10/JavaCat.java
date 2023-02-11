package com.basic.kotlin.sec3.lec10;

public class JavaCat extends JavaAnimal {

    public JavaCat(String species) {
        super(species, 4);
    }

    @Override
    protected void move() {
        System.out.println("고양이가 사뿐사뿐 걸어가~");
    }
}

