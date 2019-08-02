package base;


import base.configs.DecorationConfig;
import base.decorations.Decoration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[]) {
        final ApplicationContext ctx =
                new AnnotationConfigApplicationContext(DecorationConfig.class);

        System.out.println(ctx.getBean(Decoration.class).getClass().getSimpleName());

        ChristmasTree tree = ctx.getBean(ChristmasTree.class);
        tree.run();

    }
}
