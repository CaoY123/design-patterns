package com.mine.domain;

import com.mine.visitor.Visitor;

import java.util.Random;

// 经理 - ConcreteElement
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}