package base.configs;

import base.ChristmasTree;
import base.annotations.Blue;
import base.annotations.Green;
import base.annotations.Red;
import base.decorations.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class DecorationConfig {

    @Bean
    @Scope("prototype")
    @Red
    @Primary
    public Ball smallRedBall() {
        Ball ball = new Ball();
        ball.setSize(Size.SMALL);
        ball.setColor(Colors.RED);
        return ball;
    }

    @Bean
    @Red
    public Bulb smallRedBulb() {
        Bulb bulb = new Bulb();
        bulb.setSize(Size.SMALL);
        bulb.setColor(Colors.RED);
        return bulb;
    }

    @Bean
    @Green
    public Ball largeGreenBall() {
        Ball ball = new Ball();
        ball.setSize(Size.LARGE);
        ball.setColor(Colors.GREEN);
        return ball;
    }

    @Bean
    @Blue
    @Scope("prototype")
    public Bulb mediumBlueBulb() {
        Bulb bulb = new Bulb();
        bulb.setSize(Size.MEDIUM);
        bulb.setColor(Colors.BLUE);
        return bulb;
    }

    @Bean
    public ChristmasTree christmasTree(
            @Blue Decoration firstDecoration,
            @Green Decoration secondDecoration,
            @Red Decoration thirdDecoration) {
        ChristmasTree tree = new ChristmasTree();
        tree.addDecoration(firstDecoration);
        tree.addDecoration(secondDecoration);
        tree.addDecoration(thirdDecoration);
        return tree;
    }


}
