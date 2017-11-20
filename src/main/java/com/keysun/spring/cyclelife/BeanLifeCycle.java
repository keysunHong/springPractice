package com.keysun.spring.cyclelife;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * Created by h on 2017/11/17.
 */
public class BeanLifeCycle {
    private static void lifeCycleInBeanFactory(){
        Resource resource = new ClassPathResource("keysun-context.xml");
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader((DefaultListableBeanFactory) beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
        ((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyBeanPostsProcessor());
        ((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
        Car car = (Car)beanFactory.getBean("car");
        car.introduce();
        car.setColor("红色");

        Car car2 = (Car)beanFactory.getBean("car");
        System.out.println("car==car2:"+(car==car2));
        ((DefaultListableBeanFactory)beanFactory).destroySingletons();
    }

    private static void lifeCycleInApplicationContext(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:keysun-context.xml");
        Car car = (Car)applicationContext.getBean("car");
        car.introduce();
    }
    public static void main(String[] args) {

        //lifeCycleInBeanFactory();
        lifeCycleInApplicationContext();
    }
}
