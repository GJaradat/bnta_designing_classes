# Lab - Designing Classes

In this exercies your task is to design and implement three classes according to the instructions below. The start point includes a file called `Runner.java` which will test your code. As you progress through the exercise remove the comments from the relevant points and edit it as you need to. The code in `Runner` will give you some pointers if you aren't sure how to write your methods. For example, if the result of calling a method is being stored in a variable which is an `int` then the method needs to return an `int.

You should also draw class diagrams for each class and push them to GitHub along with your code.

## MVP

### Part 1 - `Rectangle`

1. Create a class to represent a `Rectangle`. The objects should have two properties: one for `length`, one for `width`. Assume that the dimensions can only be whole numbers.
2. Write a method which will calculate the area of the rectangle (`area = length * width`).
3. Write a method which checks if your rectangle is actually a square (it's length and width are the same). 

 
### Part 2 - `Computer`

1. Create a class to represent a `Computer`. A computer should have a numeric value representing how much storage space it has (which will be different for every computer) and a string representing the model of printer it is connected to. Every computer starts **without** a printer connected.
2. Use a getter to find out how much storage a computer has
3. Write a method to add more storage to the computer. We will need to say how much extra storage we want to add when we call the method.
4. Use a setter to update the printer property for the computer.


## Extensions

### Part 2b - `Computer` continued

5. Write a method called `printMessage` which prints a message using `System.out.println`. The message should be provided when the method is called but should **only print if there is a printer connected**.


### Part 3 - `ShoppingTrolley`

1. Create a class to represent a `ShoppingTrolley`. Each trolley should be able to hold multiple items which we will represent here using strings - eg. `"milk"`, "bread"`, etc. A new trolley should be empty when it is created.
2. Write a method to add an item to the trolley.
3. Write a method to count the number of items in the trolley.
4. Write a method which checks if an item is in the trolley. 