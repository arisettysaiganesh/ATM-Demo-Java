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
  
### Directory Breakdown:
1. **`atm-demo-java/`** (root directory): This is the top-level directory of your ATM demo project, which contains all the source code, resources, and documentation.

2. **`src/`**: The folder where your **Java source code** resides.
   - **`com/atm/`**: The main base package of the ATM system.
     - **`accounts/`**: This package contains classes related to user accounts. For example:
       - `Account.java`: A class that represents an individual user account with attributes like balance, account number, and methods to deposit, withdraw, etc.
     - **`transactions/`**: This package handles all aspects related to transactions. For example:
       - `Transaction.java`: A class that represents a transaction (either a deposit or withdrawal).
       - `TransactionHistory.java`: A class that manages the transaction history using collections like `ArrayList`.
     - **`utilities/`**: Utility classes that provide additional functionality. For example:
       - `UserInputHandler.java`: A class responsible for handling user input, validating it, and possibly formatting or sanitizing it.
       - `Logger.java`: A class for logging important events like transactions or errors.
     - **`ATM.java`**: This is the entry point of the program. It manages user interactions, displays the menu, takes input, and delegates operations to the relevant classes.

3. **`resources/`**: This folder contains non-code resources needed for the project.
   - **`config.properties`**: A properties file that could contain configuration settings for the ATM system, such as default PIN, maximum withdrawal limit, etc.
   - **`transactions.log`**: A text file where transaction logs are stored. This file can be used to track the history of transactions made by users.

4. **`README.md`**: The markdown file that provides project details, how to set it up, how to use it, and the concepts covered in the ATM demo project.

---

### Example Class Descriptions:

1. **`ATM.java`**:
   - Entry point of the ATM program.
   - Displays the ATM menu (e.g., balance check, withdraw, deposit).
   - Takes user input and delegates operations to account and transaction classes.
   - Handles basic error checking and prompts the user for valid input.

2. **`Account.java`**:
   - Represents a user’s account with balance, account number, and methods for deposits/withdrawals.
   - Includes validation for operations (e.g., insufficient funds for withdrawals).

3. **`Transaction.java`**:
   - Represents a transaction (either a deposit or withdrawal).
   - Logs transaction details like type, amount, and account involved.

4. **`TransactionHistory.java`**:
   - Keeps track of all the transactions in memory using collections like `ArrayList` or `LinkedList`.
   - Allows querying the transaction history for a given account.

5. **`UserInputHandler.java`**:
   - Takes care of receiving and validating user input.
   - Ensures that inputs like PIN, withdrawal amounts, etc., are within acceptable limits.

6. **`Logger.java`**:
   - Logs transactions and errors to the `transactions.log` file or the console.
   - May use Java's built-in logging utilities or simple file-writing operations.

---

### How to Use the Project:
Once you've set up the project (by cloning or extracting the repository), follow these steps to use it:
1. Run the `ATM.java` file.
2. Enter your PIN when prompted.
3. Choose one of the available operations:
   - Check Balance
   - Deposit Funds
   - Withdraw Funds
4. Transaction history is logged and can be viewed from the console or by checking the `transactions.log` file.

---

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing
Feel free to fork this project, create a pull request, or open issues for improvements and bug fixes.

## Acknowledgements
- Thanks to the open-source community for providing valuable libraries and tools.

---

**ATM Demo Project in Java**  
This project demonstrates a real-world example of applying Java's core concepts in a simple ATM system simulation.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing
Feel free to fork this project, create a pull request, or open issues for improvements and bug fixes.

## Acknowledgements
- Thanks to the open-source community for providing valuable libraries and tools.

---

**ATM Demo Project in Java**  
This project demonstrates a real-world example of applying Java's core concepts in a simple ATM system simulation.
