package amazonPomClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
    public static String getTD(String key) throws IOException {
        FileInputStream file=new FileInputStream("src/test/java/TestData/data.properties");
        Properties p=new Properties();
        p.load(file);
        String Values=p.getProperty(key);
        return Values;
    }
}
