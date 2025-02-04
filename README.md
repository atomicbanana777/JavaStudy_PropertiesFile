# JavaStudy_PropertiesFile
Study Java Properties File

In this study, I was using Java Class `Properties` to load and store properties file.
I also used try-with-resources which is Java SE 7 feature.

I think the most diffcult part is to get the path of the properties file 
since your JAR program can be placed in anywhere.

##To build
  `sh build.sh`
  Execute build.sh will build the program, it requires Java JDK (Java SE 7 or later)
  
  It will compile and package a JAR file and place them in `target` folder

##To run
  `sh run.sh`
  It will run the JAR file.

  The program will check whether you have `resources/myProp.prop`
  The properties file name and its folder are hard coded.

##To clean
  `sh clean.sh`
  It will remove everything in 'target` folder

##To do
  May be I should use `Maven` or `Ant` to handle the build and clean since most company use them.
  I also want to handle CSV file and JSON file.
