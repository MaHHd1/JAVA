# 🦁 Zoo Management System

> A comprehensive Java application demonstrating object-oriented programming, exception handling, collections, and functional programming through a zoo management simulation.

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Made with Love](https://img.shields.io/badge/Made%20with-❤️-red?style=for-the-badge)](https://github.com)

---

## 🎯 Project Overview

This project is a multi-module Java application developed through a series of progressive exercises. It simulates a complete management system for zoos, animals, employees, and students, demonstrating fundamental and advanced Java programming concepts.

**What This Project Does:**
- 🐾 Manages different types of animals (aquatic and terrestrial)
- 🏢 Handles zoo operations with capacity constraints
- 👥 Tracks employee-department assignments
- 🎓 Manages student records with functional programming
- 🔄 Implements complex object relationships and behaviors

---

## 🌟 Key Features

### Animal Management System
- **Dynamic Animal Tracking**: Add, remove, and search animals with validation
- **Type Hierarchy**: Support for Aquatic (Dolphins, Penguins) and Terrestrial animals
- **Behavioral Patterns**: Swimming capabilities, feeding systems (Carnivore/Herbivore/Omnivore)
- **Capacity Management**: Automatic checks for zoo limits (25 general, 10 aquatic)

### Zoo Operations
- **Multi-Zoo Support**: Compare different zoos by animal count
- **Smart Validation**: Age verification, duplicate prevention
- **Exception Safety**: Graceful handling of capacity and validation errors
- **Statistical Reports**: Animal counts, swimming depths, type distributions

### Employee & Department System
- **One-to-One Mapping**: Employees assigned to single departments
- **Dynamic Collections**: HashMap for fast lookups, TreeMap for sorted views
- **CRUD Operations**: Complete create, read, update, delete functionality
- **Search & Filter**: Find employees and departments efficiently

### Student Management
- **Functional Programming**: Lambda expressions for flexible operations
- **Stream Processing**: Filter, map, and collect student data
- **Custom Operations**: Sort by any criteria, create students dynamically
- **Modern Java**: Leverages Java 8+ functional interfaces

---

## 🧠 What I Learned

### 1. Object-Oriented Programming Mastery

**Encapsulation**
- Protected data with private attributes
- Controlled access through getters and setters
- Data validation in setter methods (age >= 0, non-empty names)

**Inheritance**
- Created animal type hierarchy (Animal → Aquatic/Terrestrial → Dolphin/Penguin)
- Understood IS-A relationships
- Properly used `super()` for parent class initialization
- Overrode methods like `toString()`, `equals()`, and `swim()`

**Polymorphism**
- Abstract classes (`Aquatic`) enforcing method implementation
- Interface-based contracts (`Carnivore`, `Herbivore`, `Omnivore`)
- Method overriding for specialized behaviors
- Runtime polymorphism with collections of parent types

**Abstraction**
- Defined abstract methods that subclasses must implement
- Created interfaces for behavior contracts
- Separated "what" from "how" in design

---

### 2. Advanced Java Concepts

**Exception Handling**
- Created custom exceptions (`ZooFullException`, `InvalidAgeException`)
- Implemented proper try-catch-finally blocks
- Understood checked vs unchecked exceptions
- Ensured program continues after exceptions with proper cleanup

**Generics**
- Built generic interfaces (`Carnivore<T>`, `Omnivore<T>`)
- Type-safe collections without casting
- Understood bounded type parameters

**Enumerations**
- Created `Food` enum (MEAT, PLANT, BOTH)
- Used enums for type safety instead of string constants

**Comparable Interface**
- Implemented `Comparable<Employe>` for natural ordering
- Understood the difference between `Comparable` and `Comparator`

---

### 3. Collections Framework Expertise

**HashMap**
- One-to-one key-value mappings (Employee → Department)
- Understood hash-based storage for O(1) lookups
- Handled duplicate keys (last write wins)
- Used `entrySet()`, `keySet()`, `values()` for iteration

**TreeMap**
- Automatic sorting by key (employee ID)
- Understood Red-Black tree implementation
- Converted HashMap to TreeMap for sorted views

**ArrayList**
- Dynamic arrays for student lists
- Add, remove, search operations
- Iteration patterns

**Stream API**
- Converted collections to streams
- Chained operations (filter → map → collect)
- Lazy evaluation concepts
- Terminal vs intermediate operations

---

### 4. Functional Programming in Java

**Lambda Expressions**
```java
students.forEach(s -> System.out.println(s));
students.stream().filter(s -> s.getAge() > 20);
```

**Functional Interfaces**
- **Consumer<T>**: Accepts input, returns nothing (e.g., printing)
- **Predicate<T>**: Tests conditions, returns boolean (e.g., filtering)
- **Function<T,R>**: Transforms input to output (e.g., extracting names)
- **Supplier<T>**: Produces values without input (e.g., object creation)
- **Comparator<T>**: Compares objects for sorting

**Method References**
- `Student::getName` instead of `s -> s.getName()`
- Cleaner, more readable code

**Stream Operations**
- `filter()`: Select elements matching criteria
- `map()`: Transform elements
- `collect()`: Convert stream to collection
- `count()`: Count elements
- `forEach()`: Iterate and perform action

---

### 5. Software Design Principles

**Package Organization**
- Separated concerns: `entities` vs `main`
- Proper naming: `tn.esprit.gestionzoo`
- Modular structure for maintainability

**Validation & Error Handling**
- Input validation before processing
- Meaningful error messages
- Fail-safe defaults (e.g., "Zoo Sans Nom")

**Code Reusability**
- Methods that do one thing well
- Avoiding code duplication
- Building on existing functionality

**Design Patterns**
- **Strategy Pattern**: Different feeding behaviors (Carnivore/Omnivore)
- **Template Method**: Abstract swim() in Aquatic, implemented by subclasses
- **Factory Pattern**: Supplier<Student> for object creation

---

### 6. Best Practices Implemented

✅ **Naming Conventions**: CamelCase, meaningful names
✅ **Access Modifiers**: Proper use of private/public/protected
✅ **Constants**: `static final` for immutable values (NBR_CAGES)
✅ **DRY Principle**: Don't Repeat Yourself
✅ **SOLID Principles**: Single Responsibility, Interface Segregation
✅ **Documentation**: Clear method purposes
✅ **Testing**: Comprehensive test cases in main methods

---

### 7. Problem-Solving Skills

**Real-World Scenarios**
- Managing limited resources (zoo capacity)
- Preventing duplicate entries
- Maintaining data integrity (one employee per department)
- Graceful degradation (exception handling)

**Algorithm Design**
- Search algorithms (linear search in arrays)
- Sorting with Comparators
- Array manipulation (removing with reorganization)
- Collection traversal and filtering

**Critical Thinking**
- When to use abstract classes vs interfaces
- Choosing appropriate data structures (HashMap vs TreeMap)
- Balancing flexibility with type safety

---

## 🚀 Technical Skills Gained

| Skill | Level | Application |
|-------|-------|-------------|
| OOP Principles | ⭐⭐⭐⭐⭐ | Inheritance, Polymorphism, Encapsulation |
| Exception Handling | ⭐⭐⭐⭐⭐ | Custom exceptions, try-catch blocks |
| Collections Framework | ⭐⭐⭐⭐⭐ | HashMap, TreeMap, ArrayList, Stream API |
| Functional Programming | ⭐⭐⭐⭐ | Lambdas, method references, functional interfaces |
| Generics | ⭐⭐⭐⭐ | Type-safe interfaces and collections |
| Design Patterns | ⭐⭐⭐⭐ | Strategy, Template Method, Factory |
| Code Organization | ⭐⭐⭐⭐⭐ | Package structure, modular design |

---

## 💡 Key Takeaways

1. **Object-Oriented Design is Powerful**: Proper use of inheritance and polymorphism makes code flexible and maintainable.

2. **Exceptions Improve Reliability**: Custom exceptions provide clear error handling and program stability.

3. **Collections are Essential**: Understanding when to use HashMap vs TreeMap vs ArrayList is crucial for efficient programs.

4. **Functional Programming is Elegant**: Lambda expressions and streams make code more concise and expressive.

5. **Validation Matters**: Always validate input data to prevent bugs and ensure data integrity.

6. **Abstraction Guides Design**: Abstract classes and interfaces define clear contracts for implementations.

7. **Testing is Critical**: Comprehensive testing reveals edge cases and validates functionality.

---

## 🎓 Learning Journey

This project was developed through **12 progressive exercises (Prosits)**, each building on previous concepts:

- **Prosits 3-4**: Foundation (classes, methods, packages)
- **Prosits 5-6**: Inheritance and polymorphism
- **Prosit 7**: Exception handling
- **Prosit 8**: Interfaces and generics
- **Prosit 11**: Collections framework
- **Prosit 12**: Functional programming

Each stage introduced new challenges and reinforced fundamental concepts, creating a comprehensive learning experience.

---

## 🛠️ Technologies & Tools

- **Java SE 8+**: Core language features
- **Collections Framework**: Data structure management
- **Stream API**: Functional operations
- **Exception Handling**: Error management
- **Generics**: Type safety
- **Lambda Expressions**: Modern Java syntax

---

## 🌟 Project Impact

This project demonstrates:
- ✨ **Technical Proficiency**: Advanced Java concepts and best practices
- 🏗️ **Architectural Thinking**: Proper design and organization
- 🐛 **Problem Solving**: Real-world scenarios and edge cases
- 📚 **Learning Ability**: Progressive skill development
- 💼 **Professional Standards**: Clean, maintainable, documented code

---

## 👨‍💻 Author

Created with passion and dedication to mastering Java programming.

---

**Happy Coding! 🚀**

> "Learning is not attained by chance, it must be sought for with ardor and attended to with diligence." - Abigail Adams
