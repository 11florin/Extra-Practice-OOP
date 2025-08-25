# Contact Manager App (Java)

A simple **console-based Contact Manager** written in Java.  
This project demonstrates **basic object-oriented programming concepts** such as encapsulation, constructors, copying objects, and managing a collection of objects.

---

## 📌 Features
- Stores and displays a list of **8 default contacts**.
- Each contact has:
  - Name
  - Phone number
  - Birth date
  - Age (calculated automatically from the birth date)
- Edit contacts by selecting their index (0–7).
- Updates the contact list in real time after editing.
- Uses **OOP best practices**:
  - Separate classes for `Contact`, `ContactManager`, and `Main`.
  - Constructor overloading and a copy constructor.
  - Encapsulation with getters and setters.
  - `toString()` override for neat contact display.

---

## 🗂 Project Structure

contactApp/
part4/
Main.java // Application entry point
Contact.java // Contact class (data model)
ContactManager.java// Manages a list of contacts


---

## ▶️ How to Run
1. Clone this repository:
   ```bash
   git clone https: https://github.com/11florin/Extra-Practice-OOP.git

## Example Usage

Name: John Doe

Phone number: 555-123-4567

Birth Date: 01-01-1985

Age: 39 year old

You have 8 contacts. Enter 'continue' to edit them: continue

Choose an index from 0 to 7: 3

Name: Michael Brown

Phone Number: 555-000-1111

Birth Date: 15-05-1992

 ## Learning Outcomes

This project is great practice for:

Working with arrays of objects in Java.

Using constructors and copy constructors.

Managing user input with Scanner.

Formatting and parsing dates with DateTimeFormatter.

Applying OOP principles in a small but complete project.

## Licence

This project is released under the MIT Licence – feel free to use, modify, and share it.
