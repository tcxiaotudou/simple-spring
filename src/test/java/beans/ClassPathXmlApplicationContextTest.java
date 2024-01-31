package beans;

import cn.fciasth.context.ClassPathXmlApplicationContext;
import org.junit.Test;

public class ClassPathXmlApplicationContextTest {

    @Test
    public void testClassPathXmlApplicationContext() throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService) ctx.getBean("aservice");
        aService.sayHello();
    }
}
