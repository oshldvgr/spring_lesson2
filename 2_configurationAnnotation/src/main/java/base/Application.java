package base;

import base.decorations.Ball;
import base.decorations.Bulb;
import base.decorations.Decoration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[]) {
        final AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.scan("base");
        ctx.refresh();

        ChristmasRoom christmasRoom = ctx.getBean(ChristmasRoom.class);
        ChristmasTree mainTree = christmasRoom.getMainTree();
        mainTree.addDecoration(ctx.getBean("largeGreenBall", Decoration.class));
        mainTree.addDecoration(ctx.getBean("smallGoldBall", Ball.class));
        mainTree.addDecoration(ctx.getBean("smallRedBulb", Bulb.class));

        ChristmasTree additionalTree = christmasRoom.getAdditionalTree();
        additionalTree.addDecoration(ctx.getBean("largeGreenBall", Ball.class));
        additionalTree.addDecoration(ctx.getBean("smallRedBulb", Bulb.class));
        christmasRoom.run();


    }
}
