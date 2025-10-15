# 🎲 Snakes & Ladders – Console Application

## Overview
This project is a simple console-based implementation of the **Snakes & Ladders** game, created as part of the **Technogise coding exercise**.

The program simulates moves on a Snakes & Ladders board, based on the player’s current position and dice outcome.

It follows:
- ✅ **Object-Oriented Design**
- ✅ **SOLID principles**
- ✅ **Test-Driven Development (TDD)**
- ✅ **Clean Code Practices**
- ✅ **Simple modular design with boundary handling**

---

## 🧩 Problem Summary
You are required to simulate a Snakes & Ladders board of **100 cells**.

- Player starts at position `00` (off the board).
- The board has **4 snakes** and **4 ladders** (predefined positions).
- Input: Current position & dice outcome (`1–6`).
- Output: New position after applying dice and any snakes/ladders.
- The game ends when the player reaches **exactly 100**.
- If a move goes **beyond 100**, the player stays in the current position.

---

## ⚙️ Technologies Used
| Component | Description |
|------------|--------------|
| **Language** | Java 17 |
| **Build Tool** | Maven |
| **Testing** | JUnit 5 |
| **Design Principles** | TDD, SOLID, Clean Code |
| **Execution Type** | Console Application (no UI) |

---

## 🧱 Project Structure
```
src/
 ├── main/java/com/saransh/snakesandladders/snakes_and_ladders/
 │     ├── App.java                 # Console runner (I/O)
 │     ├── GameEngine.java          # Core game rules
 │     └── model/
 │           ├── Board.java         # Holds snakes and ladders
 │           ├── Snake.java
 │           ├── Ladder.java
 │
 └── test/java/com/saransh/snakesandladders/snakes_and_ladders/
       ├── AppTest.java
       ├── GameEngineTest.java
       ├── GameEngineBoundaryTest.java
       ├── GameEngineSnakesLaddersTest.java
       ├── GameEngineValidationTest.java
       ├── GameEngineWinTest.java
       └── BoardDefaultTest.java
```

---

## 🚀 How to Run

### 1️⃣ Build the project
```bash
mvn clean compile
```

### 2️⃣ Run tests
```bash
mvn test
```
All tests must pass — showing that the logic was developed using TDD (Red → Green → Refactor).

### 3️⃣ Run the console app
```bash
mvn exec:java -Dexec.mainClass=com.saransh.snakesandladders.snakes_and_ladders.App
```

---

## 🧮 Input & Output Examples

### ✅ Format
```
<current>,<dice>
```
or
```
<current> <dice>
```

---

### 🧠 Sample Runs

| Input | Output | Explanation |
|--------|---------|-------------|
| `04,5` | `New position: 9` | Simple move |
| `34,3` | `New position: 85` | Ladder from 37 → 85 |
| `83,4` | `New position: 32` | Snake from 87 → 32 |
| `96,5` | `New position: 96` | 96 + 5 = 101 (>100), stay |
| `99,1` | `Yay!! You won!!` | Exact 100 reached → Game ends |

---

## 🐍 Default Board Configuration

| Ladders (bottom → top) | Snakes (head → tail) |
|-------------------------|----------------------|
| 7 → 33 | 36 → 19 |
| 22 → 58 | 65 → 35 |
| 37 → 85 | 87 → 32 |
| 51 → 72 | 99 → 10 |

---

## 🧪 Design & Development Approach

### 🔹 Test-Driven Development (TDD)
The solution was built incrementally:
1. **Red:** Write failing test for a rule (e.g., boundary move, ladder behavior).
2. **Green:** Write minimal code to pass the test.
3. **Refactor:** Clean up while keeping tests green.

### 🔹 SOLID Principles
- **S**ingle Responsibility:  
  Each class (Board, Snake, Ladder, GameEngine) has a distinct purpose.
- **O**pen/Closed:  
  Board can be extended with new configurations without modifying logic.
- **L**iskov Substitution:  
  Components can be tested and reused independently.
- **I**nterface Segregation:  
  Not applied explicitly due to project simplicity, but structure supports it.
- **D**ependency Inversion:  
  GameEngine depends on abstract Board behavior, not hardcoded values.

---

## 🧠 Key Assumptions
- Game starts at **0** (off the board).
- Dice outcomes are **1–6** only.
- If a move exceeds 100, player stays in current position.
- Snakes and ladders are **one-step effects only** (no chaining).
- Player wins only by landing **exactly on 100**.
- Input validation handled by `GameEngine`.

---

## ✅ Final Output Example

**Run:**
```bash
$ mvn exec:java -Dexec.mainClass=com.saransh.snakesandladders.snakes_and_ladders.App
Snakes & Ladders - Console (single-move input)
Enter input as: <current>,<dice>  e.g. 04,5  OR  'exit' to quit.
Input: 04,5
New position: 9
Input: 34,3
New position: 85
Input: 99,1
Yay!! You won!!
```

---

## 👨‍💻 Author
**Saransh Rai**  
Email: rsaransh.72@gmail.com
GitHub: [https://github.com/rsaransh72/snakes-and-ladders](https://github.com/rsaransh72/snakes-and-ladders)

