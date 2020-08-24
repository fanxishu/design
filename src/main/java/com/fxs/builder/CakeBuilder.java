package com.fxs.builder;

/**
 * 先定义一个抽象类 CakeBuilder 代表蛋糕的创建器 CakeBuilder.java
 */
public abstract class CakeBuilder {
    public abstract void buildCake(int level);
    public abstract void buildCream(String color);
    public abstract void buildText(String text);
    public abstract void buildFruit(String type);
    public abstract  Product getCake();
}
