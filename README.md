Task 1:

In the given scenario the most suitable Creational Pattern is Factory method.

  1. Encapsulation of Object Creation: The document creation process (whether it's a PDF or a Word file) can be separated into distinct classes. The factory function hides the details of object generation, and the client only interacts with the interface or abstract class.
  2. The open/closed principle states that the system may be readily modified to handle additional document types (such as Excel or Markdown) by developing new subclasses of the document factory. The system's basic logic remains intact, following the Open/Closed Principle (open for extension and closed for alteration).
  3. The Single Responsibility Principle states that each document type (PDF, Word, etc.) has its own class, ensuring that each class only has one responsibility: to create that specific document type.
  4. The solution is versatile since the client code does not need to know which type of document is being created. It just interacts with a basic DocumentFactory interface or abstract class, which makes it simple to add new document types in the future.

