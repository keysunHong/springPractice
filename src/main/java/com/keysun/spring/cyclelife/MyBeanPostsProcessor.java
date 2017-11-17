package com.keysun.spring.cyclelife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by h on 2017/11/17.
 */
public class MyBeanPostsProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("car".equals(beanName)){
            Car car = (Car) bean;
            if(car.getColor() == null){
                System.out.println("调用BeanPostProcessor.postProcessBeforeInitialization(),color默认设置为黑色");
                car.setColor("黑色");
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("car".equals("car")){
            Car car = (Car)bean;
            if(car.getMaxSpeed()>=200){
                System.out.println("调用了BeanPostProcessor.postProcessAfterInitialization(),将maxSpeed调整为200");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }
}
