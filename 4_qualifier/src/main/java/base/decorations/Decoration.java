package base.decorations;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public abstract class Decoration {
    private Colors color;
    private Size size;

    @Override
    public String toString() {
        return (color + " " + size + " hash-code: " + this.hashCode());
    }
}
