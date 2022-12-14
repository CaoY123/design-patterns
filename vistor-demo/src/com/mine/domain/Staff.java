package com.mine.domain;

import com.mine.visitor.Visitor;

import java.util.Random;

// 员工基类 - 相当于元素接口或元素抽象类(Element)
public abstract class Staff {

    public String name;
    public int kpi;// 员工KPI

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    // 核心方法，接受Visitor的访问
    public abstract void accept(Visitor visitor);
}