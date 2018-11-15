import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Scene6Controller implements Initializable {
    public CharaList charaList;

    public Label logLabel0; // defined at fxml 
    public Label logLabel1; // defined at fxml 
    public Label logLabel2; // defined at fxml 
    public Label logLabel3; // defined at fxml 
    public Label logLabel4; // defined at fxml 
    public Label logLabel5; // defined at fxml 
    public Label[] logLabel;  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
	charaList = new CharaList();
	logLabel = new Label[6];
	logLabel[0] = logLabel0;
	logLabel[1] = logLabel1;
	logLabel[2] = logLabel2;
	logLabel[3] = logLabel3;
	logLabel[4] = logLabel4;
	logLabel[5] = logLabel5;
	printAllChara();
    }
    
    public void partyButtonAction(ActionEvent event) {
			printAllChara();
    }
    
    public void innButtonAction(ActionEvent event) {
	for(int i=0; i < charaList.getSize(); i++){
	    Chara c = charaList.getChara(i);
	    int maxhp = c.getHp().getCurMax();
	    int my = c.getMny().getCur();
	    my = my + (int)(10 * Math.random());
	    c.getMny().setCur(my);
	    c.getHp().setCur(maxhp);
	}
	printAllChara();
    }
    
    public void battleButtonAction(ActionEvent event) {
	for(int i=0;i<charaList.getSize();i++){
	    Chara c = charaList.getChara(i);
	    int hp = c.getHp().getCur();
	    int df = c.getDef().getCur();
	    int lk = c.getLuk().getCur();
	    int my = c.getMny().getCur();
	    my = my + (int)(10 * Math.random());
	    hp = Damage(df, hp, lk);
	    c.getHp().setCur(hp);
	    c.getMny().setCur(my);
	}
	printAllChara();
    }
    
    public void BarButtonAction(ActionEvent event) {
	charaList.addChara();
	printAllChara();
    }

    public void printAllChara(){
	for(int i=0;i<Math.min(charaList.getSize(),6);i++){
	    Chara c = charaList.getChara(i);
	    logLabel[i].setText(c.toString());
	}
    }
    
    public int Damage(int df, int hp, int lk){
    	int value=df;
    	for(int i=0;i<charaList.getSize();i++){
			if(df >= 200){
				if(lk>=200){
					for(int j=0;j<4;j++){
						if(j==2){
							hp = hp - (int)(3 * Math.random());
							value = hp;
							break;
						}	
					}
				break;
				}	
				if(lk < 200 && lk >= 100){
					for(int j=0;j<4;j++){
						if(j==2 || j==1 || j==3){
							hp = hp - (int)(3 * Math.random());
							value = hp;
							break;
						}	
					}	
				break;
				}
				if(lk < 100){
					hp = hp - (int)(3 * Math.random());
					value = hp;
					break;
				}
			}
			else if(df < 200 && df >= 100){
				if(lk>=200){
					for(int j=0;j<4;j++){
						if(j==2){
							hp = hp - (int)(6 * Math.random());
							value = hp;
							break;
						}	
					}
				break;
				}	
				if(lk < 200 && lk >= 100){
					for(int j=0;j<4;j++){
						if(j==2 || j==1 || j==3){
							hp = hp - (int)(6 * Math.random());
							value = hp;
							break;
						}	
					}	
				break;
				}
				if(lk < 100){
					hp = hp - (int)(6 * Math.random());
					value = hp;
					break;
				}
			}	
			else if(df < 100){	
				if(lk>=200){
					for(int j=0;j<4;j++){
						if(j==2){
							hp = hp - (int)(10 * Math.random());
							value = hp;
							break;
						}	
					}
				break;
				}	
				if(lk < 200 && lk >= 100){
					for(int j=0;j<4;j++){
						if(j==2 || j==1 || j==3){
							hp = hp - (int)(10 * Math.random());
							value = hp;
							break;
						}	
					}	
				break;
				}
				if(lk < 100){
					hp = hp - (int)(10 * Math.random());
					value = hp;
					break;
				}
			}	
    	}
    	return value;
    }

}

