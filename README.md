# ATM-Demo-Java
 A Java-based ATM demo project utilizing OOP principles, exception handling, collections, I/O, multithreading, memory management, and annotations.
# ATM Demo Project in Java

This is a simple ATM system built using **Core Java** concepts. The project demonstrates the usage of various Java principles such as **Object-Oriented Programming (OOP)**, **Exception Handling**, **Collections Framework**, **Java I/O**, **Multithreading**, and **Java Memory Management**.

## Features
- **Object-Oriented Programming**: Uses classes, objects, inheritance, and polymorphism to represent different entities in the ATM system (e.g., `ATM`, `Account`, `Transaction`).
- **Exception Handling**: Custom exceptions are handled for invalid account numbers, insufficient funds, etc.
- **Collections Framework**: Utilizes `ArrayList`, `HashMap`, and other collections to manage data like transaction history and user accounts.
- **Java I/O**: Saves transaction data to files and reads configuration settings.
- **Multithreading**: Handles concurrent user transactions to simulate multi-user access.
- **Java Memory Management**: Ensures optimal memory usage through proper object management and garbage collection.
- **String Handling**: Efficient handling of user inputs and account details.
- **Java Package Structure**: Organized into packages for better code maintainability (e.g., `com.atm.accounts`, `com.atm.transactions`).
- **JVM**: Compiled to bytecode, runs on JVM for platform independence.
- **Java Annotations**: Custom annotations used for validation (e.g., `@ValidAccount`).

## Prerequisites
- Java 8 or higher
- An IDE like **Eclipse** or **IntelliJ IDEA** (Optional)

## Installation

1. Clone this repository:
    ```bash
    git clone https://github.com/your-username/atm-demo-java.git
    ```
2. Open the project in your IDE.
3. Run the `ATM.java` file to start the ATM simulation.

## How to Use
1. Upon running, the program will ask for your ATM PIN.
2. Choose from available options:
    - **Check Balance**
    - **Deposit Funds**
    - **Withdraw Funds**
    - **View Transaction History**
3. The program will display relevant information and prompt for further input.
4. All user interactions are saved in a text file (e.g., `transactions.log`).

## Folder Structure

atm-demo-java/
│
├── src/                        # Source code folder
│   ├── com/atm/                # Base package for the ATM system
│   │   ├── accounts/           # Package containing account-related classes
│   │   ├── transactions/       # Package for handling transactions and history
│   │   ├── utilities/          # Utility classes (e.g., input handling, logging)
│   │   └── ATM.java            # Main class to run the ATM simulation
├── resources/                  # Folder for configuration files and logs
│   ├── config.properties       # Configuration file (e.g., default PIN, initial balance)
│   └── transactions.log        # Log file to store transaction history
└── README.md                   # Project documentation


## Key Classes
- **ATM.java**: Main class to simulate the ATM interface and interaction with users.
- **Account.java**: Represents a user account with balance and transaction details.
- **Transaction.java**: Handles transaction processing and logging.
- **TransactionHistory.java**: Manages the history of transactions using collections.
- **UserInputHandler.java**: Handles user input and validates entries.
  
## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing
Feel free to fork this project, create a pull request, or open issues for improvements and bug fixes.

## Acknowledgements
- Thanks to the open-source community for providing valuable libraries and tools.

---

**ATM Demo Project in Java**  
This project demonstrates a real-world example of applying Java's core concepts in a simple ATM system simulation.
