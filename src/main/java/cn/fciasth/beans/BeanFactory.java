package cn.fciasth.beans;

public interface BeanFactory {

    Object getBean(String beanName) throws Exception;

    void registerBeanDefinition(BeanDefinition beanDefinition);
}
