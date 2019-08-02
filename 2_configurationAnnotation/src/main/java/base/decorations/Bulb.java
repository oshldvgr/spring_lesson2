package base.decorations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Bulb extends Decoration {
    @Override
    public String toString() {
        return ("Bulb: " + super.toString());
    }
}
