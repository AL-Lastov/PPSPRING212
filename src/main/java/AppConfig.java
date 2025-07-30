import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    @Scope("singleton")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "Baron")
    @Scope("prototype")
    public Cat getKittyCat() {
        Cat cat = new Cat();
        cat.setName("Baron");
        return new Cat(cat.getName(), 1_000_000_125_063L);
    }
}