Why do we convert StringBuilder to String in Java?
In Java, StringBuilder and String are both used to handle text, but they serve different purposes.
The StringBuilder class is used to create and modify strings efficiently because it is mutable — that means you can change its content (append, delete, insert, etc.) without creating new objects each time.

The String class, on the other hand, is immutable, meaning once a String object is created, it cannot be changed.

When we use StringBuilder
When we are repeatedly modifying or building a string (for example, concatenating many words in a loop), using StringBuilder is faster and memory-efficient.
Example:

StringBuilder sb = new StringBuilder();
sb.append("Java ");
sb.append("Programming");

🔁 Why conversion is needed

After finishing all the modifications, we often need the final result in the form of a String, because:
Many Java methods (like System.out.println(), file handling, etc.) accept only String parameters.
StringBuilder does not have many useful methods of String (like .substring(), .equals(), .contains()).

Hence, we convert it using the .toString() method.
Example
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
String str = sb.toString(); // Conversion to String
System.out.println(str);


Output:

Hello World
In short:
StringBuilder → used for creating or modifying text efficiently.

String → used for storing, displaying, or passing final text.
.toString() → used to convert a StringBuilder object into a String when the final text is ready.
