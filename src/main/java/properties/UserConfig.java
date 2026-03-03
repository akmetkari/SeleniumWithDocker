package properties;

import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;

public final class UserConfig {
    private UserConfig() {
    }

    @Getter
    static Properties properties;

    static {
        properties = ConfigFactory.create(Properties.class);
    }

 // Changed from static field to a method to ensure initialization
    public static Properties getProperties() {
        return ConfigFactory.create(Properties.class);
    }
}
