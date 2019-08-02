package base.decorations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bulb")
public class Bulb extends Decoration {
    @Override
    public String toString() {
        return ("Bulb: " + super.toString());
    }
}
