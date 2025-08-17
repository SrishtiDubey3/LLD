# Low Level Design (JAVA)

## 🧠 Design Patterns in Java

This repository demonstrates the implementation of Core Object-Oriented Design Patterns in Java, including:

### - Creational Design Pattern
✅ Singleton Design Pattern  
✅ Factory Method Pattern  
✅ Abstract Factory Pattern  
✅ Builder Pattern  

### - Structural Design Pattern
✅ Adapter  
✅ Decorator  
✅ Composite  

### - Behavirol Pattern
✅ Observer Design Pattern  
✅ Strategy Design Pattern  
✅ Command Design Pattern  
✅ Chain of Responsibilty Design Pattern  
✅ Iterator Design Pattern  

Each pattern is implemented with clean code, comments, and structured folder organization to make learning and usage easy and effective.  


---

  
## All Design Patterns - Quick Notes

#### 1️⃣ Singleton  
Idea: Only one object exists in the whole system.  
When to use: When you want only ONE instance of a class, like one President of a country or one Control Room.  
Example: TV Remote — no matter who uses it, there’s just ONE that controls the TV.

#### 2️⃣ Adapter  
Idea: Makes two incompatible things work together.  
When to use: When you have existing code that doesn’t fit with new code.  
Example: Mobile charger adapter — it lets a charger with a different plug work in your socket.

#### 3️⃣ Iterator
Idea: Lets you move through items in a collection one by one without knowing how it’s stored.  
When to use: When you want to go through a list, set, or collection easily.  
Example: TV channel remote’s "Next" button — you don’t care about how channels are stored, you just go next-next-next.

#### 4️⃣ Factory Method
Idea: Creates objects without telling you the exact class name.  
When to use: When you don’t want to expose object creation logic.  
Example: Ice cream shop — you say "I want chocolate," and they give you a chocolate ice cream without you making it yourself.

#### 5️⃣ Bridge
Idea: Separates an object’s abstraction from its implementation so they can change independently.  
When to use: When you have many combinations of objects and implementations.  
Example: TV and remote — any brand of remote can control any brand of TV if connected.

#### 6️⃣ Observer
Idea: One-to-many relationship — when one changes, others get notified.  
When to use: For event systems like notifications.  
Example: You subscribe to a YouTube channel — when the creator uploads, all subscribers are notified.

#### 7️⃣ Abstract Factory
Idea: Creates families of related objects without specifying exact classes.  
When to use: When your system needs to be independent of how objects are created.  
Example: Furniture factory — one factory makes a whole family: chair, table, and sofa in the same style.

#### 8️⃣ Composite
Idea: Treat individual objects and groups of objects the same way.  
When to use: When you have hierarchies like folders and files.  
Example: A folder can contain files or other folders — but you can "open" both the same way.

#### 9️⃣ Strategy  
Idea: Define different algorithms and make them interchangeable at runtime.  
When to use: When you want multiple ways to do something.  
Example: Google Maps routes — you can choose "by car," "by bike," or "on foot" without changing the app.

#### 🔟 Builder
Idea: Step-by-step construction of complex objects.  
When to use: When an object has many parts and combinations.  
Example: Making a burger — you add bun, patty, cheese, sauce step-by-step until complete.

#### 1️⃣1️⃣ Decorator
Idea: Add features to an object without changing its structure.  
When to use: When you want to extend functionality at runtime.  
Example: Ice cream cone — start with vanilla, then add sprinkles, nuts, and syrup.

#### 1️⃣2️⃣ Command
Idea: Wrap a request as an object so you can undo/redo it later.
When to use: For actions like "Undo" in an editor.
Example: TV remote button — each button sends a specific command to the TV.

1️⃣3️⃣ Prototype
Idea: Create new objects by cloning an existing one.
When to use: When creating objects is expensive or complex.
Example: Copying a drawing by photocopying instead of drawing it again.

1️⃣4️⃣ Facade
Idea: Provide a simple interface to a complex system.
When to use: When you want to hide complexity from the user.
Example: TV remote — instead of adjusting circuits manually, you press one button to turn on TV.

1️⃣5️⃣ State
Idea: Change object behavior based on its state.
When to use: When object’s actions depend on current condition.
Example: Mobile phone — behavior changes if it’s locked, unlocked, or in low-battery mode.

1️⃣6️⃣ Flyweight
Idea: Share objects to save memory.
When to use: When many similar objects exist.
Example: A game with trees — instead of creating 1,000 separate trees, reuse one tree model with different positions.

1️⃣7️⃣ Template Method
Idea: Base class defines the skeleton of an algorithm, and subclasses fill in the details.
When to use: When you want to keep structure same but change steps.
Example: Making tea or coffee — boil water (same), add tea leaves or coffee powder (different).

1️⃣8️⃣ Proxy
Idea: Controls access to another object.
When to use: When you want to add security, logging, or lazy loading.
Example: Security guard — you can’t enter directly, guard checks your ID first.

1️⃣9️⃣ Visitor
Idea: Add new operations to objects without changing them.
When to use: When you want to perform different tasks on elements of an object structure.
Example: Doctor visiting patients — doctor changes what they do depending on patient type.

2️⃣0️⃣ Mediator
Idea: Central object that controls communication between others.
When to use: When many objects communicate in a complex way.
Example: Air traffic control tower — pilots talk to tower, tower coordinates all planes.

2️⃣1️⃣ Memento
Idea: Save and restore object state without exposing details.
When to use: For undo functionality.
Example: Video game save point — you can return to the saved state anytime.

2️⃣2️⃣ Chain of Responsibility
Idea: Pass request along a chain until one handles it.
When to use: When you don’t know who will handle the request.
Example: Customer service — your complaint passes from receptionist → manager → director until solved.

---

## 📁 Project Structure

---

## 🛠 Technologies Used

- Java 8+  
- Eclipse IDE (or any Java IDE)  
- OOP & SOLID Principles  

---

## 💡 How to Run

1. Clone the repository:
On CMD (Windows)/ Bash(Mac) run:
>git clone https://github.com/SrishtiDubey3/LLD.git
>cd LLD

2. Open the folder in Eclipse or your preferred Java IDE.

3. Navigate to the respective pattern’s Main.java file inside folders like factory-method, abstract-factory, or builder.

4. Run the Main class to see the pattern in action.

---

🤝 Contributing
Feel free to fork this repository, raise issues, or submit pull requests if you'd like to add more patterns or enhancements.

---
