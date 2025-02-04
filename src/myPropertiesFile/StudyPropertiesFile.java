package myPropertiesFile;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

public class StudyPropertiesFile{
    public static void main(String[] agrs) throws IOException, URISyntaxException{
        System.out.println("Hello World!");

        PropertiesFileFacade myPropertieFacade = new PropertiesFileFacade();
        Properties properties = myPropertieFacade.getProperties();

        System.out.println("email: " + properties.get("email"));
        System.out.println(myPropertieFacade.getAllKeys());
        System.out.println(myPropertieFacade.getAllValues());
    }
}