package cn.fciasth.beans;

public interface BeanFactory {

    Object getBean(String beanName) throws Exception;

    boolean containsBean(String name);

    void registerBean(String beanName, Object obj);

}
