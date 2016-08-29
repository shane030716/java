# Java Topics

* [Will the code inside the "finally" block still be executed if there is a return (or throw) statement inside the "try" or "catch" block?](#user-content-will-the-code-inside-the-finally-block-still-be-executed-if-there-is-a-return-or-throw-statement-inside-the-try-or-catch-block)

### [Will the code inside the "finally" block still be executed if there is a return (or throw) statement inside the "try" or "catch" block?](Finally.java)

The general rule is that 
if there is a return (or throw) statement in the try or catch block
the finally block will be executed before the result is returned but after the result is executed

Check out these [6 examples](Finally.java)
