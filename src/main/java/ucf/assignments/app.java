package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import com.example.mcqueencop3330assignment4.HelloApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// The max amount of objectives will be set to 100, MAX list = 100

public class app extends Application{

    public static void main(String[] args) {
        launch();

        //initialize an array call list
        /*then prompt for the user to either add and action to a list, print the items on the list
        or exit the prompt
        once the choice has been made a call to the corresponding method will be made.
        */
    }



    public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(app.class.getResource("app-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Click to open TO-DO list");
        stage.setScene(scene);
        stage.show();
}
public static String[] collectItems(String list[]) {
    /*this method will take in an empty array initialized in main
    then return an array with  however many items were added*/
    return new String[0];
}

public static void printList(String[] list){
    /* this method will print out the current list of actions or will return "list is empty" if the list is empty */
}
public static String[] createList(int num,int MAX, String title,String date,String description){
        String[] list = new String[0];
        /* This method will create the string array that will be a to-list, with a given title
        */

        return list;

}
   public static void editList(String list){

        //this method will allow us to edit portins of a given todolist
   }
}
