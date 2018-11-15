    import javafx.application.Application;
    import javafx.scene.Scene;
    import javafx.scene.control.Label;
    import javafx.scene.layout.FlowPane;
    import javafx.stage.Stage;
     
    public class Ex7_2 extends Application {
        public static void main (String[] args){
            launch(args);
        }
     
        @Override
        public void start(Stage stage) throws Exception {
            Label label1 = new Label("Hello world!");
            Label label2 = new Label("Good morning!");
            Label label3 = new Label("Good afternoon!");
            Label label4 = new Label("Good evening!");
            FlowPane pane = new FlowPane();
            pane.getChildren().add(label1);
            pane.getChildren().add(label2);
            pane.getChildren().add(label3);
            pane.getChildren().add(label4);
            Scene scene = new Scene(pane, 320, 240);
            stage.setScene(scene);
            stage.show();
        }
    }
