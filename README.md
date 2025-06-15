# Java OOP Interface Demo

This is a simple Java project that demonstrates key Object-Oriented Programming (OOP) concepts:
- **Interfaces**
- **Abstraction**
- **Polymorphism**
- **Inheritance**

The example uses `Cat` and `Dog` classes that implement a common `Animal` interface to showcase these principles.

---

## 📁 Project Structure

```
com.ruhuna.basic
│
├── Main.java         # Entry point of the program
├── Animal.java       # Interface with abstract methods
├── Cat.java          # Implements Animal
└── Dog.java          # Implements Animal
```

---

## 🧠 Concepts Demonstrated

- **Interface:** The `Animal` interface provides an abstract template that both `Cat` and `Dog` implement.
- **Abstraction:** Hides the specific implementation details and shows only method signatures.
- **Polymorphism:** Using `Animal cat1 = new Cat();` allows calling methods based on the interface type.
- **Inheritance:** Though Java doesn't support multiple class inheritance, interfaces enable type inheritance here.

---

## 🖥️ Output Example

```
I am eating fish
Meow
I am eating bones
Bark
I am eating fish
Meow
I am eating bones
Bark
```

---

## 🚀 How to Run

### Requirements:
- Java 8 or above
- IDE (IntelliJ, Eclipse, or VS Code) or command-line tools

### Run via command line:

```bash
javac com/ruhuna/basic/*.java
java com.ruhuna.basic.Main
```

---

## 🎯 Use Case

This mini-project is perfect for:
- Students learning Java basics
- Demonstrating OOP concepts
- Quick understanding of how interfaces work in Java

---

## 📚 Learning Goal

This project was created as part of a Web Development module to practice Java fundamentals before transitioning to Spring Boot.

---

## 🪪 License

This project is open source and available under the [MIT License](LICENSE).
