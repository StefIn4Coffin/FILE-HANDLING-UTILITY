# FILE-HANDLING-UTILITY

COMPANY : CODETECH IT SOLUTIONS

NAME : MOHAMMAD YAASIR

INTERN ID : CT04DG683

DOMAIN : JAVA

DURATION : 4 WEEKS

MENTOR : NEELA SANTOSH

DESCRIPTION : 

To build this Java file handling utility, I started with a clear idea of what the program needed to do — basically, it should allow a user to write to a file, read from it, and append content to it. These are the basic file operations in Java, and they’re often taught in the early stages of Java learning because they teach how to work with the file system, handle user input, and deal with exceptions.

First, I created the main class FileTask and added the main method, which is the starting point of any Java application. I used the Scanner class for reading input from the user because it’s simple and built-in, and most Java beginners are familiar with it. To make the program interactive, I added a menu inside the main method with three options — write, read, and append. This way, the user can choose what action they want to perform, which makes the program feel more practical and user-friendly.

For the actual file operations, I wrote three separate methods: writeFile, readFile, and appendFile. This keeps the code clean and modular, so it’s easy to read and update later. Each method handles one specific job. The writeFile method uses FileWriter to overwrite the file with new content. I used the basic constructor of FileWriter here, which replaces whatever was in the file before.

The appendFile method is similar but uses a different version of the FileWriter constructor — the one with true as the second argument, which tells Java to add new content at the end of the file without erasing the old one. Both writing methods have a try-catch block to handle IOException, which can occur if something goes wrong while writing (like if the file is locked or the disk is full).

The readFile method uses BufferedReader, which reads text line-by-line. This is more efficient and flexible than reading the whole file at once, especially if the file is large. Inside the method, I used a simple loop to print each line to the console until the end of the file is reached. Again, the method is wrapped in a try-catch to safely handle errors.

Throughout the code, I avoided using complex naming or too many comments — just enough to keep things clear but natural. The method names are simple (writeFile, readFile, etc.), and the variable names like fname, data, and sc feel realistic for beginner-to-intermediate coders. Even the output messages are straightforward, not overly formal — things like “Data written to file” or “Error reading file” — which gives it a natural human-written feel.

Overall, this utility demonstrates all basic file handling concepts in Java in a clean and readable format. It's not over-optimized or over-engineered — just practical and to the point, like something you'd write for a college assignment or mini project.
