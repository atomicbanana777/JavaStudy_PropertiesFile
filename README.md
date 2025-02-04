# JavaStudy_PropertiesFile
Study Java Properties File

In this study, I used the Java class `Properties` to load and store properties files.
I also utilized the __try-with-resources__ feature, which is available in Java SE 7 and later.

I found the most challenging part to be determining the path of the properties file,
as the JAR program can be placed in any directory.

## To build
  `sh build.sh`
  
  Execute build.sh will build the program, it requires Java JDK (Java SE 7 or later)
  and Linux environment (To run `sh` command)
  
  It will compile and package a JAR file and place them in `target` folder

## To run
  `sh run.sh`
  
  It will run the JAR file.

  The program will check whether you have `<your .jar program path>/resources/myProp.prop`
 
  e.g. your JAR program located in `/home/JavaStudy_PropertiesFile/target/myPropertiesFile.jar`

  The program try to look for `/home/JavaStudy_PropertiesFile/target/resources/myProp.prop`
  The properties file name and its folder are hard coded.

  If the program cannot find the properties file, it will create one.

## To clean
  `sh clean.sh`
  
  It will remove `target` folder

## To do
  May be I should use `Maven` or `Ant` to handle the build and clean since most company use them.
  I also want to handle CSV file and JSON file.
