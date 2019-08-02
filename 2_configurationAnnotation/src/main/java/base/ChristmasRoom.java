package base;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@NoArgsConstructor
@Getter
public class ChristmasRoom {

    private ChristmasTree mainTree;
    private ChristmasTree additionalTree;


    @Autowired
    public ChristmasRoom(ChristmasTree mainTree) {
        this.mainTree = mainTree;
    }

    @Autowired
    public void setAdditionalTree(ChristmasTree tree) {
        this.additionalTree = tree;
    }

    public void run() {
        System.out.println("MainTree: "+mainTree.hashCode());
        mainTree.run();
        if (additionalTree != null) {
            System.out.println("AdditionalTree: "+additionalTree.hashCode());
            additionalTree.run();
        }
    }


}
