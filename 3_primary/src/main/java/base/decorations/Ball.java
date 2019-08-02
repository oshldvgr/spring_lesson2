package base.decorations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Ball extends Decoration {
    @Override
    public String toString() {
        return ("Ball: " + super.toString());
    }
}
