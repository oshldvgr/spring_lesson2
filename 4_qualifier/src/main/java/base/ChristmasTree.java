package base;

import base.decorations.Decoration;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Component
@Scope("prototype")
public class ChristmasTree {

    private List<Decoration> decorations;

    @Autowired
    @Qualifier("redBall")
    private Decoration firstDecoration;

    @Autowired
    @Qualifier("blueBall")
    private Decoration secondDecoration;

    public ChristmasTree(List<Decoration> decorations) {
        this.decorations = decorations;
    }

    public ChristmasTree() {
        decorations = new ArrayList<>();
    }

    public void addDecoration(Decoration decoration) {
        decorations.add(decoration);
    }

    public void run() {
        System.out.println(decorations);
    }
}
