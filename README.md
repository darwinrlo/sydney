# Software construction using Java

This is meant to be a primer on building software in the Java ecosystem.

## Running the program

1. Build the program, which produces a JAR.
```bash
mvn clean compile assembly:single
```

2. Run the program.
```bash
java -jar target/Simple-1.0-jar-with-dependencies.jar
```
