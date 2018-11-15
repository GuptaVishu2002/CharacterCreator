    import javafx.application.Application;
    import javafx.event.ActionEvent;
    import javafx.event.EventHandler;
    import javafx.scene.Scene;
    import javafx.scene.control.CheckBox;
    import javafx.scene.control.Label;
    import javafx.scene.layout.GridPane;
    import javafx.stage.Stage;
     
    class CheckBoxAdd extends CheckBox {
        private Label coLabel;
        CheckBoxAdd(String s, Label label){
            super(s);
            this.coLabel = label;
        }
        public Label getCoLabel() {
            return coLabel;
        }
    }
     
    public class Ex7_5 extends Application {
        Label[] labels = new Label[5];
        CheckBoxAdd[] checks = new CheckBoxAdd[5];
        static String[] checkStrings = {
            "Param1",
            "Param2",
            "Param3",
            "Param4",
            "Param5"
        };
     
        public static void main(String[] args) {
            launch(args);
        }
     
        @Override
        public void start(Stage stage) throws Exception {
            GridPane pane = new GridPane();
            for (int i=0; i < 5; i++){
                labels[i] = new Label("not selected!!");
                checks[i] = new CheckBoxAdd(checkStrings[i], labels[i]);
                checks[i].setSelected(false);
                checks[i].setOnAction(new EventHandler<ActionEvent>(){
                        @Override
                        public void handle(ActionEvent e) {
                            CheckBoxAdd ob = (CheckBoxAdd)e.getSource();
                            String str = "not selected!!";
                            if (ob.isSelected()){
                                str = "selected!!";
                            }
                            ob.getCoLabel().setText(str);
                        }
                    });
                
                pane.add(checks[i], 0, i);
                pane.add(labels[i], 1, i);
            }
             
            Scene scene = new Scene(pane, 320, 120);
            stage.setScene(scene);
            stage.show();
        }
     
    }
