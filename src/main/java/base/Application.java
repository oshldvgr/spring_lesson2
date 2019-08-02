package base;
import base.decorations.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String args[]) {
        final ApplicationContext ctx =
                new AnnotationConfigApplicationContext(Application.class);

    }
}
