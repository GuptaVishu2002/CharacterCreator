    import javafx.application.Application;
    import javafx.event.ActionEvent;
    import javafx.event.EventHandler;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.Label;
    import javafx.scene.control.TextField;
    import javafx.scene.layout.BorderPane;
    import javafx.stage.Stage;
     
    public class Ex7_4 extends Application {
        Label label;
        TextField field;
        Button button;
        
        public static void main (String[] args){
            launch(args);
        }
     
        @Override
        public void start(Stage stage) throws Exception {
            label = new Label("name: ");
            field = new TextField();
            field.setPromptText("input your name");
            button = new Button("Click");
     
            button.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent e) {
                        String msg = "input string: " + field.getText();
                        label.setText(msg);
                    }
                });
            
            BorderPane pane = new BorderPane();
            pane.setTop(label);
            pane.setCenter(field);
            pane.setBottom(button);
     
            Scene scene = new Scene(pane, 320, 240);
            stage.setScene(scene);
            stage.show();
        }
    }
