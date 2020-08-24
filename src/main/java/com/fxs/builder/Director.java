package com.fxs.builder;

/**
 * Builder 只是个执行角色，它需要指导，指导者是 Director，所以，我们还需要定义
 */
public class Director {

    public void makeCake(CakeBuilder builder) {

        builder.buildCake(3);
        builder.buildCream("pink");
        builder.buildText("Happy birthday,frank is better!");
        builder.buildFruit("mango");
    }

}