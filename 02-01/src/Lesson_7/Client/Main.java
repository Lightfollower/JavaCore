package Lesson_7.Client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Lesson_7/Client/sample.fxml"));

    Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = loader.load();
        controller = loader.getController();
        primaryStage.setTitle("chat 2k19");
        Scene scene = new Scene(root, 350, 370);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> {
            try {
                System.out.println("onClose");
                controller.out.writeUTF("/end");
                super.stop();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

//    @Override
//    public void stop() throws Exception {
//        System.out.println("somebody calls");
//        controller.out.writeUTF("/end");
//        super.stop();
//    }

    public static void main(String[] args) {
        launch(args);
    }
}
