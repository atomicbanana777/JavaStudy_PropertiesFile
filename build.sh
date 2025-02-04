cd $(dirname $0)
javac -d target src/myPropertiesFile/*.java
cd target ; jar cvfe myPropertiesFile.jar myPropertiesFile.StudyPropertiesFile myPropertiesFile/*.class
