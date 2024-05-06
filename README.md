# Decorator Pattern Example: Building Houses 🏠

## Introduction 🚀
This project demonstrates the usage of the decorator pattern in Java to build houses with additional features like gardens and pools.

## Classes and Interfaces 📚
- **House**: An interface representing the basic functionality of building a house.
- **BasicHouse**: A concrete implementation of the `House` interface representing a basic house without any additional features.
- **HouseDecorator**: An abstract class providing the base functionality for all decorators. It holds a reference to the decorated house object.
- **Garden**: A concrete decorator adding a garden feature to a house.
- **Pool**: A concrete decorator adding a pool feature to a house.
- **Main**: The main class to run the program and demonstrate the usage of decorators.

## Usage 🛠️
1. Create a basic house using the `BasicHouse` class.
2. Decorate the basic house with additional features like a garden or a pool using the `Garden` and `Pool` classes.
3. Call the `build()` method on the decorated house objects to build the houses with the added features.

## Note on Inheritance 🧬
- **Superclass and Subclass**: In this project, `BasicHouse` serves as the superclass, representing the core functionality of building a house. `Garden` and `Pool` are subclasses of `HouseDecorator`, adding additional features to the basic house.
- **Difference between `extends` and `implements`**: 
  - `extends` is used to establish an inheritance relationship between a superclass and a subclass, allowing the subclass to inherit attributes and methods from the superclass.
  - `implements` is used to indicate that a class implements a particular interface, providing concrete implementations for methods declared in that interface. Unlike inheritance, a class can implement multiple interfaces in Java.

