## Paper-Rock-Scissors
### Introduction
This is a simple console based implementation of the
Paper-Rock-Scissors. The user plays
against the computer 'n' number times before the game 
ends.

### Requirements
- Java 17 or newer (built with Java 23)

### How to run the program
Step 1: Open terminal and navigate to the unzipped folder `paper-rock-scissors`

Step 2: Run the program
```
java -jar paper-rock-scissors.jar
```

### How to play
1. Execute the program in the terminal.
2. Enter the number of games you want to play.
3. In each round, type `rock`, `paper`, or `scissors`.
4. Type `exit` at any prompt to quit the game early.

### Development
#### Export game as JAR file
Step 1: Compile the project
```
javac -d out $(find src/main/java -name "*.java")
```

Step 2: Package the JAR file
```
jar cfm paper-rock-scissors.jar manifest.txt -C out .
```

#### Testing
Run all tests
```
mvn test
```

Add any tests you like to the test classes in `src/test/java/io/github/dccunning/`
