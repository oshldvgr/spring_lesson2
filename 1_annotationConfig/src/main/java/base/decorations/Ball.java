package base.decorations;

import org.springframework.stereotype.Component;

@Component
public class Ball extends Decoration {
    @Override
    public String toString() {
        return ("Ball: " + super.toString());
    }
}
