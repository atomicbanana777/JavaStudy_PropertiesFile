# JavaStudy_PropertiesFile
Study Java Properties File

In this study, I used the Java class `Properties` to load and store properties files.
I also utilized the __try-with-resources__ feature, which is available in Java SE 7 and later.

I found the most challenging part to be determining the path of the properties file,
as the JAR program can be placed in any directory.

## To build
  Run the following command:
  
  ```
  sh build.sh
  ```
  
  Executing `build.sh` will compile and package the program into a JAR file. This requires:

  - Java JDK (Java SE 7 or later)

  - A Linux environment (to run the `sh` command)

The compiled JAR file will be placed in the target folder.

## To run
  Run the following command:

  ```
  sh run.sh
  ```
  
  This will execute the JAR file.

  The program will check for the existence of the properties file at:
  `<your .jar program path>/resources/myProp.prop`
  
  For example, if your JAR program is located at:
  `/home/JavaStudy_PropertiesFile/target/myPropertiesFile.jar`
  
  The program will look for:
  `/home/JavaStudy_PropertiesFile/target/resources/myProp.prop`
  
  The properties file name and its folder are hardcoded.
  
  If the program cannot find the properties file, it will create one automatically.

## To clean
  Run the following command:

  ```
  sh clean.sh
  ```
  
  This will remove the `target` folder.

## To do
  - Consider using __Maven__ or __Ant__ to handle the build and clean processes, as these tools are commonly used in most companies.

  - Explore handling __CSV__ and __JSON__ files in future studies.
