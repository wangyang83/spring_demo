import com.wy.Person;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Instant;

/**
 * @author: 王阳
 * Date:     2020/5/14 10:28
 * Description:
 */
public class TestApplication {
    public static Logger logger = Logger.getLogger(TestApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //根据id获取bean
        //Spring就是一个大工厂（容器）专门生成bean bean就是对象
        Person person = (Person) applicationContext.getBean("personOne");
        //输出获取到的对象
        System.out.println("person = " + person);
    }
}
