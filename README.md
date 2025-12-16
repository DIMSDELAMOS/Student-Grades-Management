# Student Grade Sorter 🎓

A simple Java console application designed to manage and sort student grades. The program allows the user to input student details dynamically and automatically sorts the grades in ascending order.

## Features
* **Dynamic Input:** Asks the user for the total number of students.
* **Data Collection:** Captures Student Name, ID (AM), and Grade for each entry.
* **Data Structure:** Uses `ArrayList` to store data dynamically.
* **Sorting Algorithm:** Utilizes `Collections.sort()` to organize grades from lowest to highest.
* **Console Output:** Displays the entry process and the final sorted list of grades.

## How to Run
1.  Ensure you have Java installed.
2.  Compile the file:
    ```bash
    javac Student.java
    ```
3.  Run the application:
    ```bash
    java Student
    ```

## Usage Example
```text
How many students are there?
> 2

Give the 1 student's name
> Giannis
Give the 1 student's am
> 12345
Give the 1 student's grade
> 8

Give the 2 student's name
> Maria
Give the 2 student's am
> 12346
Give the 2 student's grade
> 10

[8, 10]
