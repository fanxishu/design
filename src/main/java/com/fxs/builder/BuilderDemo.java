package com.fxs.builder;

/**
 * Director 定义了 Builder 工艺的细节。上面的代码表示要做 3 层粉色奶油的蛋糕，水果是芒果，上面有指定字迹。
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Director director = new Director();
        ConcreteCakeBuilder builder = new ConcreteCakeBuilder();
        director.makeCake(builder);
        Product cake = builder.getCake();
        System.out.println(cake.toString());
    }
}