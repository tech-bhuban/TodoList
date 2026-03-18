


import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            
            int choice = input.nextInt();
            input.nextLine(); // consume newline
            
            if(choice == 1) {
                System.out.print("Enter task: ");
                String task = input.nextLine();
                tasks.add(task);
                System.out.println("Task added!");
            }
            else if(choice == 2) {
                System.out.println("\nYour Tasks:");
                for(int i = 0; i < tasks.size(); i++) {
                    System.out.println((i+1) + ". " + tasks.get(i));
                }
            }
            else if(choice == 3) {
                System.out.print("Enter task number to remove: ");
                int num = input.nextInt();
                if(num > 0 && num <= tasks.size()) {
                    tasks.remove(num-1);
                    System.out.println("Task removed!");
                }
            }
            else if(choice == 4) {
                System.out.println("Goodbye!");
                break;
            }
        }
        
        input.close();
    }
}

// # Simple To-Do List

// ## What it does
// A program to help you remember your tasks.

// ## How it works
// 1. Shows menu with options
// 2. You choose what to do
// 3. Program remembers your tasks

// ## Menu Options
// - **Add Task**: Type a new task
// - **Show Tasks**: See all your tasks
// - **Remove Task**: Delete a task when done
// - **Exit**: Close the program

// ## Example
