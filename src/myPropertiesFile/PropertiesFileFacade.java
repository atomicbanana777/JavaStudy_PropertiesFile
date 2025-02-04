package myPropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileFacade {
    private final String propertiesFolder = "resources";
    private final String propertiesName = "myProp.prop";
    private final String propertiesDiecotry;
    private final String propertiesPath;
    private Properties myProperties;

    public PropertiesFileFacade() throws URISyntaxException, IOException{
        String currentPath = StudyPropertiesFile.class
        .getProtectionDomain()
        .getCodeSource()
        .getLocation()
        .toURI()
        .getPath();
        
        propertiesDiecotry = currentPath.substring(0, currentPath.lastIndexOf(File.separator));
        propertiesPath = propertiesDiecotry + File.separator + propertiesFolder+ File.separator + propertiesName;
        myProperties = new Properties();

        //load properties
        try (FileInputStream propertiesFile = new FileInputStream(propertiesPath)){
            load(propertiesFile);
        } catch (FileNotFoundException e){
            //if not exist, create new properties with default value
            createDefaultPropertiesFile();
        }
    }

    public Properties getProperties(){
        return myProperties;
    }

    public void load(FileInputStream propertiesFile) throws IOException {
        myProperties.load(propertiesFile);
    }

    public void createDefaultPropertiesFile() throws IOException{
        myProperties.setProperty("name", "Peter");
        myProperties.setProperty("email", "PeterXXXX@gmail.com");
        myProperties.setProperty("age", "55");

        File directory = new File(propertiesDiecotry + File.separator + propertiesFolder);
        if(!directory.exists()){
            directory.mkdir();
        }
        try(FileOutputStream file = new FileOutputStream(propertiesPath)){
            myProperties.store(file, "This is my properties file");
        }
    }

    public Set<String> getAllKeys(){
        return myProperties.stringPropertyNames();
    }

    public Collection<Object> getAllValues(){
        return myProperties.values();
    }

}
