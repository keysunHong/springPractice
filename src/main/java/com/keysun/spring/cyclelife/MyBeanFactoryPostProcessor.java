package com.keysun.spring.cyclelife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by h on 2017/11/20.
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("car");
        beanDefinition.getPropertyValues().addPropertyValue("brand","奇瑞QQ");
        System.out.println("调用了BeanFactoryPostProcessor.postProcessBeanFactory,修改品牌红旗为QQ");
    }
}
