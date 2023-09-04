import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld newBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(newBean.getMessage());

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        Cat beanNewCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanNewCat.getMessage());

        boolean equalsHelloWorldBean = (bean.equals(newBean));
        boolean equalsCatBean = (beanCat.equals(beanNewCat));

        System.out.println(equalsHelloWorldBean);
        System.out.println(equalsCatBean);
    }
}