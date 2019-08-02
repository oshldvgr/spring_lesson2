package base.configs;

import base.decorations.Ball;
import base.decorations.Bulb;
import base.decorations.Colors;
import base.decorations.Size;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DecorationConfig {

    @Bean
    @Scope("prototype")
    public Ball smallGoldBall() {
        Ball ball = new Ball();
        ball.setSize(Size.SMALL);
        ball.setColor(Colors.GOLD);
        return ball;
    }

    @Bean

    public Ball largeGreenBall() {
        Ball ball = new Ball();
        ball.setSize(Size.LARGE);
        ball.setColor(Colors.GREEN);
        return ball;
    }

    @Bean
    @Scope("prototype")
    public Bulb mediumBlueBulb() {
        Bulb bulb = new Bulb();
        bulb.setSize(Size.MEDIUM);
        bulb.setColor(Colors.BLUE);
        return bulb;
    }


    @Bean
    public Bulb smallRedBulb() {
        Bulb bulb = new Bulb();
        bulb.setSize(Size.SMALL);
        bulb.setColor(Colors.RED);
        return bulb;
    }

}
