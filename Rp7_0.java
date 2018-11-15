    import javafx.application.Application;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.Label;
    import javafx.scene.control.TextField;
    import javafx.scene.layout.BorderPane;
    import javafx.scene.layout.Pane;
    import javafx.stage.Stage;
    import javafx.fxml.FXMLLoader;
     
    public class Rp7_0 extends Application {
        Stage stage;
        
        @Override
        public void start(Stage primaryStage) throws Exception {
            stage = primaryStage;
            primaryStage.setTitle("RP7 GAME");
            Pane myPane_top = (Pane)FXMLLoader.load(getClass().getResource("scene6.fxml"));
            Scene myScene = new Scene(myPane_top);
            primaryStage.setScene(myScene);
            primaryStage.show();
        }
        
        public static void main(String[] args) {
            launch(args);
        }
    }
