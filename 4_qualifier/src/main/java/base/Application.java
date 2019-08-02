package base;


import base.decorations.Decoration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String args[]) {
        final ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(ctx.getBean(Decoration.class).getClass().getSimpleName());

        ChristmasTree tree = ctx.getBean(ChristmasTree.class);
        System.out.println(tree.getFirstDecoration().getClass().getSimpleName() + " " + tree.getFirstDecoration());

        System.out.println(tree.getSecondDecoration().getClass().getSimpleName() + " " + tree.getSecondDecoration());
    }
}
