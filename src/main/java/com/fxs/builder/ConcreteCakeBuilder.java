package com.fxs.builder;

public class ConcreteCakeBuilder  extends CakeBuilder {

    private Product cake = new Product();

    public ConcreteCakeBuilder(){};

    @Override
    public  void buildCake(int level){
        cake.level = level;
    }
    @Override
    public void buildCream(String color){
        cake.color = color;
    }
    @Override
    public void buildText(String text){
        cake.text = text;
    }
    @Override
    public void buildFruit(String type){
        cake.fruit = type;
    }
    @Override
    public Product getCake(){
        return cake;
    }
}
