Task 1:

In the given scenario the most suitable Creational Pattern is Factory method.

  There are 4 reasons:
  1. Encapsulation of Object Creation: The document creation process (whether it's a PDF or a Word file) can be separated into distinct classes. The factory function hides the details of object generation, and the client only interacts with the interface or abstract class.
  2. The open/closed principle states that the system may be readily modified to handle additional document types (such as Excel or Markdown) by developing new subclasses of the document factory. The system's basic logic remains intact, following the Open/Closed Principle (open for extension and closed for alteration).
  3. The Single Responsibility Principle states that each document type (PDF, Word, etc.) has its own class, ensuring that each class only has one responsibility: to create that specific document type.
  4. The solution is versatile since the client code does not need to know which type of document is being created. It just interacts with a basic DocumentFactory interface or abstract class, which makes it simple to add new document types in the future.

Task 2:

This circumstance lends itself well to the Abstract Factory design.

  There are 3 reasons:
  1. Families of Related Objects: Each theme (Light Theme, Dark Theme, etc.) is a collection of related components (buttons, checkboxes). The Abstract Factory approach works well for building families of linked items without identifying their particular classes.
  2. Open/Closed Principle: The system may be simply upgraded to include new themes (e.g., "Blue Theme") by introducing new factory classes that generate the new theme's components without altering old code.
  3. Consistency Across Themes: This pattern guarantees that all components (buttons, checkboxes, etc.) are built consistently inside the same theme, resulting in a unified appearance and feel.
