package com.mine;

import com.mine.utils.BusinessReport;
import com.mine.visitor.CEOVisitor;
import com.mine.visitor.CTOVisitor;

public class Client {

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}