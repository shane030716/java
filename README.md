# Java Topics

* [Will the code inside the "finally" block still be executed if there is a return (or throw) statement inside the "try" or "catch" block?](#user-content-will-the-code-inside-the-finally-block-still-be-executed-if-there-is-a-return-or-throw-statement-inside-the-try-or-catch-block)
* [What happens when you pass a null argument to an overload method?](#user-content-what-happens-when-you-pass-a-null-argument-to-an-overload-method)
* [Serialization and Deserialization](#serialization-and-deserialization)

### [Will the code inside the "finally" block still be executed if there is a return (or throw) statement inside the "try" or "catch" block?](src/Finally.java)

The general rule is that 
if there is a return (or throw) statement in the try or catch block, 
the finally block will be executed before the result is returned but after the result is executed. ("result" means the code after the "return" keyword)

Check out these [6 examples](src/Finally.java)

### [What happens when you pass a null argument to an overload method?](NullInOverloadMethods.java)

If you pass a null argument to a method that matches multiple signatures, what will happen to this ambiguity?

### [Serialization and Deserialization](src/Serialization.java)

What is Serialization and Deserialization? What is the `Serializable` interface and the `transient` keyword?
Will take a look at `ObjectInputStream` and `ObjectOutStream`, too 

#### To to list:

- [x] `finally`
- [x] `null` argument in overload method
- [ ] `synchronized`
- [ ] `volatile`
- [ ] generics
- [ ] strong and weak reference
- [ ] private constructer
- [ ] `public`, `protected`, `private` and no modifier
- [ ] checked vs unchecked exception
- [ ] threads
- [ ] sockets
- [ ] `static` block
- [x] serialization / deserialization and the `transient` keyword
- [ ] streams
