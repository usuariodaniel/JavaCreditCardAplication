# Java Credit Card Application

This Java application simulates a credit card system. Users can input their credit card limit and make purchases. The program checks if the purchase amount exceeds the available balance and displays appropriate messages.

## Getting Started

1. **Prerequisites**: Make sure you have Java installed on your system.
2. **Clone the Repository**: Clone this repository to your local machine.
3. **Compile and Run**: Compile the `Main.java` file and run the program.

## How It Works

1. The user enters the credit card limit.
2. Inside a loop:
    - The user inputs the description and value of a purchase.
    - The program creates a `Compra` object (representing a purchase).
    - It checks if the purchase can be made (i.e., if the balance is sufficient).
    - If the purchase is successful, the user can continue or exit.
    - If the balance is insufficient, the program exits.
3. After exiting the loop:
    - The program displays all purchases made, sorted by description.
    - It also shows the remaining balance on the credit card.

## Classes

1. `Main`: Contains the main method to run the program.
2. `CartaoDeCredito`: Represents the credit card with methods for adding purchases and checking the balance.
3. `Compra`: Represents a single purchase with description and value.

## Customize

Feel free to customize this code to add more features or improve functionality. You can also create additional classes or enhance error handling.

## Connect with Me

Let's connect! You can find me on:

- [Linkedin](https://www.linkedin.com/in/daniel-sq/)
