package com.keysun.spring.cyclelife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by h on 2017/11/17.
 */
public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean {

    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("调用构造方法!");
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()方法设置属性");
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getBeanName() {
        return beanName;
    }

    public void introduce(){
        System.out.println("brand:"+brand+" color:"+color+" maxSpeed:"+maxSpeed);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory方法");
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String beanName) {
        System.out.println("调用BeanAware.setBeanName()");
        this.beanName = beanName;
    }

    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destory()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet()");
    }

    public void myInit(){
        System.out.println("调用init-method所指定的myInit方法,将maxSpeed指定为240");
        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.0000");
        String format = df.format("22.3000");
        System.out.println(format);
    }

    public void myDestory(){
        System.out.println("执行destory-method中指定的myDestory方法");
    }
}
