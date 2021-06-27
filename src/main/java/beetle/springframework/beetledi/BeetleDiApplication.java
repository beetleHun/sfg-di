package beetle.springframework.beetledi;

import beetle.springframework.beetledi.controller.ConstructorInjectedController;
import beetle.springframework.beetledi.controller.MyController;
import beetle.springframework.beetledi.controller.PropertyInjectedController;
import beetle.springframework.beetledi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeetleDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BeetleDiApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        String greeting = controller.sayHello();
        System.out.println(greeting);

        System.out.println("------ Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------ Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------ Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
