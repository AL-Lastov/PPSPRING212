import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("Baron");
        Cat cat2 = (Cat) applicationContext.getBean("Baron");

        System.out.println("HelloWorld beans are the same? " + bean1.equals(bean2));
        System.out.println("Cat beans are the same? " + cat1.equals(cat2));


    }
}