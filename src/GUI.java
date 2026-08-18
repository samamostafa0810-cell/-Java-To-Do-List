/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author sama
 */
public class GUI extends Application {
  static ArrayList<Task> task = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        
      Label to= new Label("TO-DO LIST");
      Label l= new Label("manage your tasks easily");
      
      Button b1= new Button("ADD TASK");
      Button b2= new Button("VIEW TASKS");
      Button b3= new Button("COMPLETE TASK");
      Button b4= new Button("DELETE TASK");
      Button b5= new Button("EXIT");
      
      GridPane g1= new GridPane();
      g1.add(to, 0, 0, 2,1);
      g1.add(l, 0, 1);
      g1.add(b1, 0, 2);
      g1.add(b2, 0, 3);
      g1.add(b3, 0, 4);
      g1.add(b4, 0, 5);
      g1.add(b5, 0, 6);
      g1.setHgap(15);
      g1.setVgap(15);
      g1.setAlignment(Pos.CENTER);
      
      
      Label l1= new Label("ADD TASK");
      Label l2= new Label("task title: ");
      Label l3= new Label("priority: ");
      Label l4= new Label("due date: ");
      
      Button ba= new Button("ADD TASK");
      Button bb= new Button("BACK");
      
      TextField tl2= new TextField();
      TextField tl4= new TextField();
      
      String[] PRIORITY={"HIGH", "MEDIUM", "LOW"};
      ComboBox<String> priorityBox= new ComboBox<>();
      priorityBox.getItems().addAll(PRIORITY);
      priorityBox.setPromptText("Select priority");
      
      GridPane g2= new GridPane();
      g2.add(l1, 0, 0, 2, 1);
      g2.add(l2, 0, 1);
      g2.add(tl2, 1, 1);
      g2.add(l3, 0, 2);
      g2.add(priorityBox, 1, 2);
      g2.add(l4, 0, 3);
      g2.add(tl4, 1, 3);
      g2.add(ba, 1, 4);
      g2.add(bb, 1, 5);
      g2.setHgap(15);
      g2.setVgap(15);
      g2.setAlignment(Pos.CENTER);
      
      Scene s2= new Scene(g2, 350, 350);
       b1.setOnAction((ActionEvent) ->{
            primaryStage.setScene(s2);
            primaryStage.show();
        });
       
       Label v= new Label("YOUR TASKS");
       
       TextArea taskArea = new TextArea();
       taskArea.setEditable(false);
       taskArea.setPrefSize(350, 350);
       
       Button bk= new Button("BACK");
       
       GridPane g3= new GridPane();
       g3.add(v, 0, 0, 2, 1);
       g3.add(taskArea, 0, 1);
       g3.add(bk, 0, 2);
       g3.setHgap(15);
       g3.setVgap(15);
       g3.setAlignment(Pos.CENTER);
       
              
       Scene s3= new Scene(g3, 450, 450);
       b2.setOnAction((ActionEvent) ->{
           taskArea.clear();
           for(int i=0; i< task.size(); i++){
            Task currentTask = task.get(i);   
            taskArea.appendText(
            (i + 1) + ". " +
            currentTask.getTitle() +
            " | Priority: " +
            currentTask.getPriority() +
            " | Due Date: " +
            currentTask.getDueDate() +
            " | Completed: " +
            currentTask.isCompleted() +
            "\n"
        );
           }
           
           
            primaryStage.setScene(s3);
            primaryStage.show();
        });
       
       Label cc= new Label("COMPLETE TASK");
       Label st= new Label("select task: ");
       
       Button bc= new Button("COMPLETE");
       Button bbc= new Button("BACK");
       
      ComboBox<String> completeBox= new ComboBox<>();
      completeBox.setPromptText("Select task");
      
      GridPane g4= new GridPane();
      g4.add(cc, 0, 0, 2, 1);
      g4.add(st, 0, 1);
      g4.add(completeBox, 1, 1);
      g4.add(bc, 0, 2);
      g4.add(bbc, 0, 3);
      g4.setHgap(15);
      g4.setVgap(15);
      g4.setAlignment(Pos.CENTER);
      
      Scene s4= new Scene(g4, 350, 350);
       b3.setOnAction((ActionEvent) ->{
           completeBox.getItems().clear();
           for(int i= 0; i<task.size(); i++){
               completeBox.getItems().add((i+1) + ". " + task.get(i).getTitle());
           }
           
            primaryStage.setScene(s4);
            primaryStage.show();
        });
       
       Label d= new Label("DELETE TASK");
       Label sd= new Label("select task: ");
       
       Button bd= new Button("DELETE");
       Button back= new Button("BACK");
       
      ComboBox<String> deleteBox= new ComboBox<>();
      deleteBox.setPromptText("Select task");
       
      GridPane g5= new GridPane();
      g5.add(d, 0, 0, 2, 1);
      g5.add(sd, 0, 1);
      g5.add(deleteBox, 1, 1);
      g5.add(bd, 0, 2);
      g5.add(back, 0, 3);
      g5.setHgap(15);
      g5.setVgap(15);
      g5.setAlignment(Pos.CENTER);
      
      Scene s5= new Scene(g5, 350, 350);
       b4.setOnAction((ActionEvent) ->{
        deleteBox.getItems().clear();
        for(int i = 0; i < task.size(); i++){
            deleteBox.getItems().add(
            (i+1) + ". "+ task.get(i).getTitle());
        }
            primaryStage.setScene(s5);
            primaryStage.show();
        });
       
       ba.setOnAction((ActionEvent)->{
        String title= tl2.getText();
        String priorities= priorityBox.getValue();
        String dueDate= tl4.getText();
        
        if (title.isEmpty() && priorities == null && dueDate.isEmpty()) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all task information.");
        alert.showAndWait();
        return;

    }
        if(title.isEmpty()){
        Alert a2= new Alert(Alert.AlertType.ERROR);
        a2.setTitle("Missing Information");
        a2.setHeaderText(null);
        a2.setContentText("Please select a task.");
        a2.showAndWait();
        return;
        }
       
        if(priorities== null){
        Alert a3= new Alert(Alert.AlertType.ERROR);
        a3.setTitle("Missing Information");
        a3.setHeaderText(null);
        a3.setContentText("Please select a priority.");
        a3.showAndWait();
        return;
    }        
        if(dueDate.isEmpty()){
        Alert a4= new Alert(Alert.AlertType.ERROR);
        a4.setTitle("Missing Information");
        a4.setHeaderText(null);
        a4.setContentText("Please enter a due date.");
        a4.showAndWait();
        return;
    }
        
        
        Task t= new Task(title, priorities, dueDate, false);
        task.add(t);
        
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Success");
    alert.setHeaderText(null);
    alert.setContentText("Task added successfully!");
    alert.showAndWait();
    tl2.clear();
    tl4.clear();
    priorityBox.getSelectionModel().clearSelection();
    
    });
       
       bc.setOnAction((ActionEvent)->{
           int selectedIndex = completeBox.getSelectionModel().getSelectedIndex();
           if(selectedIndex == -1){
               System.out.println("please select a task!");
               return;
           }
           Task selectedTask = task.get(selectedIndex);
           selectedTask.setCompleted(true);
           System.out.println("task completed!");
           completeBox.getItems().remove(selectedIndex);
       });
       
       bd.setOnAction((ActionEvent)->{
           int selectedIndex = deleteBox.getSelectionModel().getSelectedIndex();
           if(selectedIndex == -1){
               System.out.println("please select a task!");
               return;
           }
           task.remove(selectedIndex);
           System.out.println("task deleted successfully!");
           deleteBox.getItems().remove(selectedIndex);
       });
       
       Alert a1= new Alert(Alert.AlertType.INFORMATION,("CLOSING THE APP!"));
        b5.setOnAction((ActionEvent event)->{
            a1.showAndWait();
            primaryStage.close();
        });
        
       
      Scene s1= new Scene(g1, 350, 350);
      bb.setOnAction((ActionEvent) ->{
        primaryStage.setScene(s1);
        primaryStage.show();
      }); 
      bk.setOnAction((ActionEvent) -> {
       primaryStage.setScene(s1);
       primaryStage.show();
    });
      
      bbc.setOnAction((ActionEvent) -> {
       primaryStage.setScene(s1);
       primaryStage.show();
    });
      
      back.setOnAction((ActionEvent) -> {
       primaryStage.setScene(s1);
       primaryStage.show();
    });

      primaryStage.setTitle("TO-DO LIST");
      primaryStage.setScene(s1);
      primaryStage.show();
      
      
      s1.getStylesheets().add(
    getClass().getResource("fcss.css").toExternalForm()
);

s2.getStylesheets().add(
    getClass().getResource("fcss.css").toExternalForm()
);

s3.getStylesheets().add(
    getClass().getResource("fcss.css").toExternalForm()
);

s4.getStylesheets().add(
    getClass().getResource("fcss.css").toExternalForm()
);

s5.getStylesheets().add(
    getClass().getResource("fcss.css").toExternalForm()
);
    }    
    public static void main(String[] args) {
        launch(args);
    } 
}
