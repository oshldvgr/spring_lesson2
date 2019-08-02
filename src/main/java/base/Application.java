package base;
import base.decorations.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String args[]) {
        Christmastree tree = new Christmastree();
        Ball ball = new Ball();
        Bulb bulb = new Bulb();

        ball.setColor(Colors.BLUE);
        ball.setSize(Size.LARGE);

        bulb.setColor(Colors.GOLD);
        bulb.setSize(Size.SMALL);

        List<Decoration> listBall = new ArrayList<>();
        listBall.add(ball);
        listBall.add(bulb);
        tree.setDecorations(listBall);

        tree.run();

    }
}
