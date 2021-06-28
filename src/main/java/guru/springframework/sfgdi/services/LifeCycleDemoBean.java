package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("Constructor call of LifeCycleDemoBean");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware setBeanFactory call");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware setBeanName call");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy call");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet call");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware setApplicationContext call");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct call");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy call");
    }

    public void beforeInit() {
        System.out.println("CustomBeanPostProcessor before init");
    }

    public void afterInit() {
        System.out.println("CustomBeanPostProcessor after init");
    }

}
