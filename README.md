# GoogleGuice

Google Guice is an open-source dependency injection framework for Java. It was developed by Google and released as an open-source project in 2008.

**Dependency Injection:**

In Java applications, different objects need to work together to make the software function. To handle complex projects well, it's important to make these objects as independent as possible from one another. This allows for easier reuse and testing.

Dependency Injection, also known as "wiring," is a technique that helps connect these parts while still keeping them separate and self-reliant. it manages the dependencies between various components of a software application.

Lets take an example to dependency injection using Guice step by step.

**Example**



1. **Lack of Flexibility**: With this design, you are tightly bound to the **`OracleConnection`** class. If you ever need to switch to a different database system (e.g., MySQL, PostgreSQL), you would need to modify the **`DatabaseApp`** class. This violates the Open-Closed Principle, one of the SOLID principles of object-oriented design, which suggests that classes should be open for extension but closed for modification.
2. **Difficult Testing**: Writing unit tests for the **`DatabaseApp`** class becomes challenging because it's tightly coupled to the **`OracleConnection`**. You cannot easily substitute a mock or stub for testing purposes.
3. **Reusability**: The **`DatabaseApp`** class cannot be easily reused in other parts of your codebase because it is specifically tied t


**Design principle:**

it  is a guideline about what is the right way and what is the wrong way to design your application. Design principles always talk about what to do instead of how to do it.

**Design patterns**:

A generic and reusable solution for commonly occurring problems. Design patterns talk about how to solve the problems in a given software design context by providing clear methodologies.
The first step towards making your code cleaner, readable, decoupled, maintainable, and modular is to learn the design principle called **DIP**.

**Dependency Inversion Principle (DIP)**:

DIP is a design principle that promotes loose coupling in software systems. It emphasizes two key principles:

1. **High-level modules should not depend on low-level modules. Both should depend on abstractions.**
    - High-level modules are components responsible for defining the core functionality of an application.
    - Low-level modules are components that handle specific, lower-level tasks.
    - Rather than having high-level modules directly depend on low-level modules, both should rely on abstractions or interfaces.
2. **Abstractions should not depend on details. Details should depend on abstractions.**
    - Abstractions, such as interfaces or abstract classes, define a contract without specifying implementation details.
    - Implementation details, which are specific to low-level modules, should depend on and adhere to the abstractions.

By adhering to the Dependency Inversion Principle, you achieve greater flexibility and maintainability. High-level modules can interact with any low-level module that conforms to the same abstraction, allowing for easy substitution and extension of components without altering the core functionality of the system.

**Inversion of Control (IoC):**

IoC is a design approach that promotes loosely coupled systems by shifting control from the main program to external entities or frameworks. It separates the core logic of a program from activities like managing dependencies and controlling application flow.

IoC achieves decoupling, testability, extensibility, and maintainability by changing how components interact and depend on each other.

**Implementing DIP through IoC**:

The Dependency Inversion Principle (DIP) suggests that high-level modules should not depend on low-level modules directly. Both should rely on abstractions. IoC helps achieve this abstraction by inverting control in the following ways:

**1. Inverting the Interface**:

- High-level modules define interfaces, and low-level modules implement them.
- High-level modules interact with low-level modules through these interfaces, reducing direct dependencies.
- This separation enables flexibility and modularity.

**2. Inverting Object Creation**:

- Move the creation of dependency objects from the main program to external entities or frameworks.
- External entities handle object creation and provide instances to the program.
- This decouples the program from specific implementations, making it adaptable to changes.

**3. Inverting Flow**:

- Change the flow of application execution by relying on external control mechanisms.
- Control flow decisions are handled by external entities, allowing the program to focus on its core functionality.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/efe26d57-3164-4d74-ab9b-0e6d9777bd71/ee2ad647-271d-4845-8521-ced95ea78b18/Untitled.png)

**Inverting the Interface Example**:

Inverting the interface involves allowing high-level modules to define interfaces, and low-level modules adhere to these interfaces. High-level modules interact with low-level modules through the shared interface, promoting flexibility and decoupling.

**Different Ways to Invert Object Creation**:

Inversion of object creation is essential for achieving decoupling. This can be accomplished through various design patterns:

- **Factory Pattern**: Delegates object creation to factory classes, which generate objects based on client requirements.
- **Service Locator**: A central registry manages the creation and location of services based on client requests.
- **Dependency Injection (DI)**: Dependencies are injected into a class from external sources, typically through constructor injection or setters.

**Dependency Injection (DI)**:

DI is a method to implement IoC by passing dependencies to a class rather than having the class create its dependencies. DI relies on abstractions, allowing the program to remain unaware of concrete implementations until runtime.

DI simplifies decoupling and promotes flexibility. External containers, such as Spring or Guice, handle the management and injection of dependencies, making code cleaner and more maintainable.

**IoC Containers**:

IoC containers, also known as DI containers, make managing dependencies in software easier. They take care of creating objects, setting them up, and managing their lifecycle, saving developers from dealing with complicated wiring code.

These containers help keep the creation of objects separate, eliminating the need for intricate wiring code. This separation makes it easier to change parts of your code without affecting others, promoting a more flexible and maintainable system. It also opens the door to using advanced techniques like aspect-oriented programming (AOP).

In the Java world, you'll often hear about IoC containers like Spring, Google Guice, and Dagger. They're tools that make it even simpler to handle dependencies and enhance the overall quality of your software.

In summary, IoC and DI are clever design concepts that lead to code that's easier to work with. They achieve this by reducing how tightly different parts of your code are connected and providing more flexibility when dealing with dependencies and how control flows. IoC containers take this a step further by making dependency management a breeze and offering extra features to improve your software's quality.

**Need for DI:**

1. **Reduced Coupling:** DI reduces tight coupling between classes, making it easier to change or swap dependencies.
2. **Flexibility:** Allows adapting to changing requirements and configurations.
3. **Reusability:** Promotes component reuse across different contexts.
4. **Separation of Concerns:** Keeps concerns separated, improving code organization.
5. **Easier Maintenance:**   configuration changes, reducing code modifications.

**Dependency Injection (DI):** It's a design pattern that promotes loose coupling between components in software. DI is a method to implement IoC by passing dependencies to a class rather than having the class create its dependencies. DI relies on abstractions, allowing the program to remain unaware of concrete implementations until runtime.

To address these issues, you can introduce dependency injection, which allows you to inject the database connection as a dependency into the **`DatabaseApp`** class. Here's a revised version of your code:

In this revised code, **`DatabaseApp`** no longer creates an instance of **`OracleConnection`** internally. Instead, it accepts a **`DatabaseConnection`** as a constructor parameter. This makes the class more flexible, testable, and reusable. You can create different implementations of **`DatabaseConnection`** for different database systems and inject the appropriate one when using the **`DatabaseApp`** class.
