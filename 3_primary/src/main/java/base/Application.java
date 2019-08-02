package base;


import base.decorations.Decoration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[]) {
        final AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.scan("base");
        ctx.refresh();

       System.out.println(ctx.getBean(Decoration.class).getClass().getSimpleName());

       ChristmasTree tree = ctx.getBean(ChristmasTree.class);
       System.out.println(tree.getFirstDecoration().getClass().getSimpleName());
       System.out.println(tree.getSecondDecoration().getClass().getSimpleName());
    }
}
