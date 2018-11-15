    import javafx.application.Application;
    import javafx.scene.Scene;
    import javafx.scene.control.Label;
    import javafx.scene.layout.BorderPane;
    import javafx.stage.Stage;
     
    public class Ex7_1 extends Application {
        public static void main (String[] args){
            launch(args);
        }
     
        @Override
        public void start(Stage stage) throws Exception {
            int toggle = 0;
            Label label = new Label("Hello world!");
            BorderPane pane = new BorderPane();
            pane.setCenter(label);
            Scene scene = new Scene(pane, 320, 240);
     
            stage.setScene(scene);
            stage.show();
        }
    }
