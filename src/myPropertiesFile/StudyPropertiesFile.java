package myPropertiesFile;

import java.io.IOException;
import java.net.URISyntaxException;

public class StudyPropertiesFile{
    public static void main(String[] agrs) throws IOException, URISyntaxException{
        System.out.println("Hello World!\nThis is Java Properties File Study");

        PropertiesFileFacade myPropertieFacade = new PropertiesFileFacade();

        System.out.println("The properties file located in: " + myPropertieFacade.getPropertiesPath());
        System.out.println("The keys:" + myPropertieFacade.getAllKeys());
        System.out.println("The values:" + myPropertieFacade.getAllValues());
    }
}