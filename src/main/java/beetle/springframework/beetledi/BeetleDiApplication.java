package beetle.springframework.beetledi;

import beetle.springframework.beetledi.controller.ConstructorInjectedController;
import beetle.springframework.beetledi.controller.I18nController;
import beetle.springframework.beetledi.controller.MyController;
import beetle.springframework.beetledi.controller.PrimaryController;
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

        System.out.println("------ Primary");
        PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");
        System.out.println(primaryController.getGreeting());

        System.out.println("------ I18n");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.getGreeting());
    }

}
