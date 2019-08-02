package base.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@Import(DecorationConfig.class)

@ComponentScan("base")
public class ApplicationConfig {
}
