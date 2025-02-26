package com.example.hardcodedcontactinfo;
// is this necessary? came with code when opened javafx file in intellij

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class HardcodedContactInfo extends Application {
    @Override // <-- what does this do?
    public void start(Stage stage) {

        // creates text objects for all the info
        Text name = new Text(50, 50, "Full Name: Pedro Herrera");
        Text email = new Text(50, 80, "Full Email: herrerap3@montclair.edu");
        Text major = new Text(50,110, "Major: Computer Science");

        // groups/holds all the text objects together
        Group root = new Group(name, email, major);

        // creates the canvas or scene with the group root above
        //which sets the window size + background color
        Scene scene = new Scene(root, 400, 200);
        scene.setFill(Color.rgb(230, 230, 250)); // purple(lavender)!

        // sets the title of the window
        stage.setTitle("Pedro's Hardcoded Contact Information");

        // sets the scene for the "stage" or canvas
        stage.setScene(scene);

        // shows the "stage" or canvas
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }   // launches the javafx stage or canvas
}