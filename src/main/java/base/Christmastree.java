package base;

import base.decorations.Decoration;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Christmastree {

    private List<Decoration> decorations;

    public Christmastree(List<Decoration> decorations) {
        this.decorations = decorations;
    }

    public Christmastree() {
    }

    public void run() {
        System.out.println(decorations);
    }

}
