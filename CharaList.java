import java.util.ArrayList;

public class CharaList {
    private CharaCollection charaCollection;
    private ArrayList<Chara> charaList;

    CharaList(){
	charaCollection = new CharaCollection();
	charaList = new ArrayList<Chara>();
	addChara();
	addChara();
	addChara();
    }

    public void addChara() {
	charaList.add(charaCollection.getNewChara());
    }

    public Chara getChara(int a) {
	return charaList.get(a);
    }

    public int getSize() {
	return charaList.size();
    }
}

