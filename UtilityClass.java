import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
    public static String getTD(String key) throws IOException {
        FileInputStream file=new FileInputStream("/home/prav/IdeaProjects/Selenium/src/test/java/properties.properties");
        Properties p=new Properties();
        p.load(file);
       String Values=p.getProperty(key);
       return Values;
    }
}
