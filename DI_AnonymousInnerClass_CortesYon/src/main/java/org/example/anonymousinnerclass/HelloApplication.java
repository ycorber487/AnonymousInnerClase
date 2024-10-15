package org.example.anonymousinnerclass;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);

        Button btNew = new Button("New");
        btNew.setOnAction(e -> System.out.println("Nuevo proceso"));

        Button open = new Button("Open");
        open.setOnAction(e -> System.out.println("Abrir proceso"));

        Button save = new Button("Save");
        save.setOnAction(e -> System.out.println("Guardar proceso"));

        Button print = new Button("Print");
        print.setOnAction(e -> System.out.println("Imprimir proceso"));

        grid.add(btNew, 0, 0);
        grid.add(open, 1, 0);
        grid.add(save, 2, 0);
        grid.add(print, 3, 0);

        Scene scene = new Scene(grid,300,200);
        stage.setScene(scene);
        stage.setTitle("AnonymousInnerClass");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}