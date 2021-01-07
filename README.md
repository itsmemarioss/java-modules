# Java Modules

## How to compile

First compile greet module
    
````
    javac greet/module-info.java ^
    greet/com/itsmemario/greet/Greeter.java ^
    greet/com/itsmemario/greet/internal/GreeterImpl.java
````

Then compile the application module with the first module ont he module path

````
    javac -p greet ^
    hello/module-info.java ^
    hello/com/itsmemario/hello/HelloWorld.java 
````
## How to run

````
    java -p greet;hello -m com.itsmemario.hello/com.itsmemario.hello.HelloWorld
````