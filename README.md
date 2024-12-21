# Professional ePortfolio: EnhancedGameProject

Welcome to my professional ePortfolio for the CS 499 capstone project. This repository shows the skills I have learned and improved during my time in the Computer Science program.

## About the Project

The EnhancedGameProject is a Java-based game where players can track their scores and see a leaderboard. At first, the program did not save scores after closing, so all progress was lost. To fix this, I added a database that saves the scores permanently, making the program much more useful.

## Professional Narrative

### What the Project Includes
This project started with basic features, such as:
- Adding players
- Tracking scores
- Displaying a leaderboard

The big problem was that it could not save scores between sessions. I solved this by adding a SQLite database to store the scores. The key parts of this enhancement were:
- **Creating a Database**: I designed a table to store player names and scores.
- **Using SQL**: I wrote SQL commands to add, update, and retrieve data from the database.
- **Connecting to the Program**: I wrote a class called `LeaderboardDAO` to handle all the database work in the background.

### Improvements I Made
1. **Added a Database**: Now, the program saves scores, even after it is closed.
2. **Simplified File Access**: I worked on file paths to make sure the database works across different computers.
3. **Tested Everything**: I tested the program to make sure scores were saved and loaded correctly every time.

### What I Learned
While working on this project, I learned how to:
- Use relational databases like SQLite to save data.
- Write SQL queries to manage data.
- Fix issues with file paths so the database works smoothly on different systems.
- Test code to make sure it works consistently.

### Why This Project is Important
This project shows how I can improve a program by adding features that solve real problems. It’s a great example of how I can use databases to make software more reliable and useful.

## GitHub Pages Site
[Check out the live version here](https://MartLo28.github.io/EnhancedGameProject/)
