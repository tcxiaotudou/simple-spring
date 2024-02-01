package cn.fciasth.context;

import cn.fciasth.beans.BeanDefinition;
import cn.fciasth.beans.BeanFactory;
import cn.fciasth.beans.SimpleBeanFactory;
import cn.fciasth.beans.XmlBeanDefinitionReader;
import cn.fciasth.core.ClassPathXmlResource;
import cn.fciasth.core.Resource;

/**
 * @author fciasth
 */
public class ClassPathXmlApplicationContext implements BeanFactory {

    BeanFactory beanFactory;

    public ClassPathXmlApplicationContext(String fileName) {
        Resource resource = new ClassPathXmlResource(fileName);
        SimpleBeanFactory beanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
        this.beanFactory = beanFactory;
    }

    @Override
    public Object getBean(String beanName) throws Exception {
        return beanFactory.getBean(beanName);
    }

    @Override
    public boolean containsBean(String name) {
        return this.beanFactory.containsBean(name);
    }

    @Override
    public void registerBean(String beanName, Object obj) {
        this.beanFactory.registerBean(beanName, obj);
    }

}
