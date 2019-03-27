package ru.ithub.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        Using bean = (Using) context.getBean("using");
        System.out.println("Dependent bean name for using " + bean.getUsed().getName());
        Other bean2 = (Other) context.getBean("other");
        System.out.println("Dependent bean name for other " + bean2.getUsed().getName());
        ((ClassPathXmlApplicationContext) context).close();
    }
}
