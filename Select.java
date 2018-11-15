import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class Select {
    @FXML
    private CheckBox checkBox1 ;
    @FXML
    private CheckBox checkBox2 ;
    @FXML
    private CheckBox checkBox3 ;
    @FXML
    private Button submitButton ;

    private ObservableSet<CheckBox> selectedCheckBoxes = FXCollections.observableSet();
    private ObservableSet<CheckBox> unselectedCheckBoxes = FXCollections.observableSet();

    private IntegerBinding numCheckBoxesSelected = Bindings.size(selectedCheckBoxes);

    private final int maxNumSelected =  2; 

    public void initialize() {
        configureCheckBox(checkBox1);
        configureCheckBox(checkBox2);
        configureCheckBox(checkBox3);

        submitButton.setDisable(true);

        numCheckBoxesSelected.addListener((obs, oldSelectedCount, newSelectedCount) -> {
            if (newSelectedCount.intValue() >= maxNumSelected) {
                unselectedCheckBoxes.forEach(cb -> cb.setDisable(true));
                submitButton.setDisable(false);
            } else {
                unselectedCheckBoxes.forEach(cb -> cb.setDisable(false));
                submitButton.setDisable(true);
            }
        });


    }

    private void configureCheckBox(CheckBox checkBox) {

        if (checkBox.isSelected()) {
            selectedCheckBoxes.add(checkBox);
        } else {
            unselectedCheckBoxes.add(checkBox);
        }

        checkBox.selectedProperty().addListener((obs, wasSelected, isNowSelected) -> {
            if (isNowSelected) {
                unselectedCheckBoxes.remove(checkBox);
                selectedCheckBoxes.add(checkBox);
            } else {
                selectedCheckBoxes.remove(checkBox);
                unselectedCheckBoxes.add(checkBox);
            }

        });

    }

}
