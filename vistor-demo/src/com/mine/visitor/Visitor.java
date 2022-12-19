package com.mine.visitor;

import com.mine.domain.Engineer;
import com.mine.domain.Manager;
// 访问者接口或抽象类 - 其中规定了对每种具体元素的访问策略，
// 因此要求具体的元素不能经常变更，否则需要修改Visitor及其子类或实现类
public interface Visitor {

    // 访问工程师类型
    void visit(Engineer engineer);

    // 访问经理类型
    void visit(Manager manager);
}