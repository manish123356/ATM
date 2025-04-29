# 🏧 ATM Management System - Java OOP Project

## 📌 Project Overview

The **ATM Management System** is a Java-based console application that simulates the core functionalities of an Automated Teller Machine (ATM). This project is developed using **Object-Oriented Programming (OOP)** principles and is ideal for understanding real-world banking system behaviors in a modular and maintainable structure.

The program allows users to securely interact with a virtual ATM to perform actions such as withdrawing cash, depositing funds, checking balances, and viewing transaction history. It mimics how physical ATMs work and emphasizes clean architecture and proper object-oriented design patterns.

---

## 🎯 Project Objectives

- Simulate ATM operations in a console environment.
- Apply Java OOP concepts like encapsulation, abstraction, and polymorphism.
- Handle secure user authentication and account management.
- Provide an interactive, menu-driven interface.

---

## ⚙️ Core Features

- 🔐 **PIN-based User Authentication**
- 💰 **Check Account Balance**
- 🏦 **Deposit Money**
- 💸 **Withdraw Money**
- 📜 **Transaction History**
- 🚪 **Logout / Exit System**
- 📂 **Optional: File-based or Database storage for persistence**

---

## 🧱 Project Structure (OOP Design)

The application follows an OOP-based structure with clear responsibility separation:

- `User.java` – Contains user-specific data like account number, PIN, balance, and transaction list.
- `ATM.java` – Handles core banking operations such as deposit, withdraw, and balance check.
- `Transaction.java` – Models transaction records with type, amount, and timestamp.
- `ATMApp.java` – Main class with the user interface logic and interaction loop.
- `DataManager.java` – Handles saving/loading data to and from files (for persistence).
