import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
        TestBean bean = (TestBean) context.getBean ("testBean");

        System.out.println (bean.toString ());

        context.close ();
    }
}
