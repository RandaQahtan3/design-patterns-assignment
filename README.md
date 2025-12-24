# Design Patterns Assignment

## Project Description
This repository contains my solution for the Design Patterns assignment.  
The project focuses on applying object-oriented design principles to solve two different problems:
- A document editor that supports multiple document formats.
- A car configuration system that allows flexible and incremental car construction.

The implementation demonstrates the practical use of design patterns taught during the course.



## Implemented Design Patterns

### 1. Factory Pattern – Document Editor
The document editor is designed so that it does not depend on concrete document types such as PDF or Word.

A common Document interface defines the basic behavior of all documents.  
Concrete implementations (e.g. PDF, Word) implement this interface.

A DocumentFactory class is responsible for creating the correct document type based on a given input (for example, "PDF" or `"WORD"`).  
This allows new document formats to be added later without changing the editor logic.



### 2. Builder Pattern – Car Configuration
The car configuration system is implemented using the Builder pattern.

A CarBuilder class is used to construct a Car object step by step.  
This approach makes it possible to:
- Add optional features (engine type, transmission, safety features, exterior options).
- Create different car configurations without using large constructors.
- Keep the construction process clear and readable.

The final Car object is created only after all required configuration steps are completed.



### 3. Separation of Responsibilities
Each part of the assignment is implemented in a separate module:
- The document editor logic is isolated from the car configuration logic.
- Each module has its own structure and responsibility.

This separation improves readability, maintainability, and makes future extensions easier.



### 4. Extensibility and Maintainability
The design allows:
- Adding new document formats with minimal changes.
- Adding new car options or configuration steps without modifying existing code.
- Keeping the core logic independent from concrete implementations.



## Bonus
The project is structured using a modular approach (Maven modules), where each main part of the assignment is separated into its own module with a clear purpose.

This structure reflects real-world project organization and improves scalability.



## Conclusion
This project demonstrates the use of Factory and Builder design patterns in practical scenarios.  
The solution follows object-oriented design principles and provides a clean and extensible structure.
