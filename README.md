🎮 Rock Paper Scissors Game (Java Console)
📌 Project Description
This is a simple console-based Rock Paper Scissors game developed using Java. The user plays against the computer, and the program keeps track of scores until the user chooses to exit.
🚀 Features
User vs Computer gameplay
Random computer move generation
Input validation (handles invalid inputs)
Continuous game loop until user exits
Score tracking system
Simple and interactive console UI with emojis
🛠️ Technologies Used
Java (Core Java)
Scanner class for user input
Random class for generating computer choices
📂 Project Structure

Main.java
▶️ How to Run the Project
Step 1: Install Java
Make sure Java is installed on your system.
You can check using:

java -version
Step 2: Compile the Code
Navigate to the folder where your file is located and run:

javac Main.java
Step 3: Run the Program

java Main
🎯 How the Game Works
The program starts and displays a welcome message.
The user is prompted to enter:
rock
paper
scissors
or exit to quit
The computer randomly selects one of the three options.
The winner is decided based on rules:
Rock beats Scissors
Paper beats Rock
Scissors beats Paper
Scores are updated after each round.
The game continues until the user types exit.
📊 Game Logic Rules
User Choice
Computer Choice
Result
Same
Same
Draw 🤝
Rock
Scissors
Win 🎉
Paper
Rock
Win 🎉
Scissors
Paper
Win 🎉
Otherwise
Any
Lose 😢
⚠️ Input Validation
The program only accepts:
rock
paper
scissors
exit
Any other input will show:

❌ Invalid input! Please try again.
📈 Score System
Keeps track of:
User Score
Computer Score
Displays after every round:

📊 Score → You: X | Computer: Y
🔚 Exit Condition
Type exit to stop the game.
Program will display:

👋 Thanks for playing!
💡 Future Improvements
Add GUI using Swing or JavaFX
Add sound effects
Add multiplayer mode
Store high scores
Add difficulty levels
👨‍💻 Author
Developed as a beginner-friendly Java console project
