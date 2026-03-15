# LLD - Tic-Tac-Toe Game in Java

A console-based **Tic-Tac-Toe game** implemented in Java, supporting two players with dynamic board size.  
This project demonstrates **object-oriented programming**, **Java basics**, and **game logic implementation**.

---

## Features

- Two-player Tic-Tac-Toe game (X and O).  
- Supports **dynamic board sizes** (n x n).  
- Validates moves and prevents overwriting cells.  
- Checks for **winner** and **draw** conditions.  
- Simple console-based interface.  
- Demonstrates **OOP concepts**: encapsulation, classes, and method abstraction.  

---

## Project Structure
```plaintext
TicTacToe/
├── src/
│   ├── App.java          // Main class with game loop
│   ├── Game.java         // Handles game logic and player switching
│   ├── Board.java        // Represents the board and its operations
│   ├── Cell.java         // Represents individual board cells
│   ├── Player.java       // Stores player details (name, symbol, id)
│   └── Symbol.java       // Enum for X, O, and EMPTY symbols
└── README.md             // Project documentation
```

## Classes and Design
```plaintext
1. App.java

Entry point of the application.

Handles user input and starts the game loop.

2. Game.java

Maintains list of players.

Handles player switching and orchestrates the game.

3. Board.java

Represents the board as a 2D array of Cell.

Methods:

placeMove(int row, int col, Symbol symbol) → place a symbol on the board

isEmpty(int row, int col) → check if a cell is empty

isFull() / isDraw() → check for full board / draw

checkWinner(int row, int col, Symbol symbol) → determine if a player has won

4. Cell.java

Represents a single cell on the board.

Contains row, column, and symbol.

5. Player.java

Stores player details:

name

symbol (X/O)

playerId

6. Symbol.java

Enum for X, O, and EMPTY.

Gameplay

Start the game and enter the board size (n).

Two players are created with assigned symbols (X and O).

Players take turns entering the row and column to place their symbol.

The game continues until:

One player wins → checkWinner() triggers.

The board is full → game ends in a draw.

The board is displayed after each move.
```
