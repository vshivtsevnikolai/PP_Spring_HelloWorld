import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hello1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hello2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("First pair = " + (hello1 == hello2));
        System.out.println("Second pair = " + (cat1 == cat2));
    }
}