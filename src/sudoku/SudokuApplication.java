package sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sudoku.userInterface.*;


import java.io.IOException;

public class SudokuApplication extends Application{

    // user interface
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // actual user interface
        // stage object is the window
        uiImpl = new UserInterfaceImpl(primaryStage);

        try {
            // build logic, code required to wire things together
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}

