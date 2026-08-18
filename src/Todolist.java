/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Todolist {
    static ArrayList<Task> task = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void addTask() {
        
        System.out.println("enter your task title:");
        String title = sc.nextLine();
        
        System.out.println("enter the pirority of the task:");
         String priority = sc.nextLine();
         
         System.out.println("enter the duedate for the task:");
         String dueDate = sc.nextLine();
         
         Task t= new Task(title, priority, dueDate, false);
         task.add(t);
        
    }
    public static void viewTask(){
        System.out.println("YOUR TASKS:");
        for(Task currentTas : task){
             System.out.println("title:"+ currentTas.getTitle());
             System.out.println("priority:"+ currentTas.getPriority());
             System.out.println("duedate:"+ currentTas.getDueDate());
             System.out.println("Completed:" + currentTas.isCompleted());
         }
    }
    
    public static void completeTask(){
        System.out.println("enter the task's number you want to complete");
        int taskNumber= sc.nextInt();
        sc.nextLine();
        Task selectedTask= task.get(taskNumber-1);
        selectedTask.setCompleted(true);
        System.out.println("task completed!");
    
    }
    public static void deleteTask(){
        System.out.println("enter the task number you want to delete: ");
        int taskNumber= sc.nextInt();
        sc.nextLine();
        if(taskNumber >= 1&& taskNumber<= task.size()){
        Task selectedTask= task.remove(taskNumber-1);
            System.out.println("task deleted successfully!");
      }else{
            System.out.println("invalid task number!");
        }
    }
    
    
    
    public static void main(String[] args) {
       
      int choice= 0;
      while(choice !=5){
      System.out.println("TO-DO LIST");
          System.out.println("1. add task");
          System.out.println("2. view tasks");
          System.out.println("3. complete task");
          System.out.println("4. delete task");
          System.out.println("5. Exit");
          System.out.println("choose an option: ");
          
          choice= sc.nextInt();
          sc.nextLine();
          
          switch(choice){
              case 1:
                  addTask();
                  break;
                  
              case 2:
                  viewTask();
                  break;
                  
              case 3:
                  completeTask();
                  break;
                  
              case 4:
                  deleteTask();
                  break;
                  
              case 5:
                  System.out.println("Goodbye!");
                  break;
                  
              default:
                  System.out.println("invalid choice!");
          }
      }
         
       Scanner sc= new Scanner(System.in);
         viewTask();
        
         
    }
    
}
