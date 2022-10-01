package util;

import java.io.IOException;
import java.util.Properties;

public enum ApplicationProperties {

    INSTANCE;
    private final Properties properties;

    ApplicationProperties() {

        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
    public String getTeamName() {
        return properties.getProperty("teamName");
    }
    public int getWicketKeeperCount() {
        return Integer.parseInt(properties.getProperty("wicketKeeperCount"));
    }
    public int getForeignPlayer() {
        return Integer.parseInt(properties.getProperty("foreignPlayer"));
    }
}
