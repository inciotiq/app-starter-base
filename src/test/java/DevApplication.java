import com.iotiq.application.Application;
import configuration.ContainersConfig;
import org.springframework.boot.SpringApplication;

public class DevApplication {

    public static void main(String[] args) {
        SpringApplication
                .from(Application::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
