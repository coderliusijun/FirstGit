import MyAdvice.MyBeforeAdvice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MyService;
import service.MyServiceImpl;

public class Test {
    @org.junit.Test
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        MyService myService=applicationContext.getBean("myServiceImpl",MyService.class);
        myService.add();
        myService.delete();
        myService.find();
    }
}
