package application.java;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main( String[] args ) {
        launch( args );
    }

    @Override
    public void start( Stage primaryStage ) throws Exception {
        initView( primaryStage );
    }

    private void initView( Stage primaryStage ) throws Exception {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation( Main.class.getResource("../resources/view/RootLayout.fxml") );

        BorderPane layout = loader.load();

        Scene scene = new Scene(layout);

        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
