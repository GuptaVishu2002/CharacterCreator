import java.util.ArrayList;

public class CharaCollection {
    static private ArrayList<Chara> charaCollectionList;

    CharaCollection(){
	charaCollectionList = new ArrayList<Chara>();
	
	addChara(new Chara("DD01",
				     new Param("HP" ,  17, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 50, 255),
				     new Param("MNY", 50, 500)));
	addChara(new Chara("DD02",
				     new Param("HP" ,  15, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 100, 255),
				     new Param("MNY", 100, 500)));
	addChara(new Chara("DD03",
				     new Param("HP" ,  15, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 200, 255),
				     new Param("MNY", 50, 500)));
	addChara(new Chara("DD04",
				     new Param("HP" ,  15, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 50, 255),
				     new Param("MNY", 200, 500)));
	addChara(new Chara("DD05",
				     new Param("HP" ,  15, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 100, 255),
				     new Param("MNY", 50, 500)));
	addChara(new Chara("DD06",
				     new Param("HP" ,  15, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 200, 255),
				     new Param("MNY", 100, 500)));
	addChara(new Chara("DD07",
				     new Param("HP" ,  15, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 50, 255),
				     new Param("MNY", 50, 500)));
	addChara(new Chara("DD08",
				     new Param("HP" ,  15, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 100, 255),
				     new Param("MNY", 200, 500)));
	addChara(new Chara("DD09",
				     new Param("HP" ,  15, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 200, 255),
				     new Param("MNY", 50, 500)));
	addChara(new Chara("DD10",
				     new Param("HP" ,  15, 50),
				     new Param("STR", 100, 255),
				     new Param("DEF", 100, 255),
				     new Param("LUK", 100, 255),
				     new Param("MNY", 100, 500)));
	addChara(new Chara("BB01",
				     new Param("HP" ,  50, 100),
				     new Param("STR", 200, 255),
				     new Param("DEF", 200, 255),
				     new Param("LUK",  50,  40),
				     new Param("MNY", 50, 500)));
	addChara(new Chara("BB02",
				     new Param("HP" ,  40, 100),
				     new Param("STR", 200, 255),
				     new Param("DEF", 200, 255),
				     new Param("LUK", 200,  40),
				     new Param("MNY", 200, 500)));
	addChara(new Chara("BB03",
				     new Param("HP" ,  40, 100),
				     new Param("STR", 200, 255),
				     new Param("DEF", 200, 255),
				     new Param("LUK",  10,  40),
				     new Param("MNY", 50, 500)));
	addChara(new Chara("BB04",
				     new Param("HP" ,  40, 100),
				     new Param("STR", 200, 255),
				     new Param("DEF", 200, 255),
				     new Param("LUK",  10,  40),
				     new Param("MNY", 100, 500)));
	addChara(new Chara("FF01",
				     new Param("HP" , 120, 100),
				     new Param("STR",  50, 255),
				     new Param("DEF",  50, 255),
				     new Param("LUK", 100, 255),
				     new Param("MNY", 50, 500)));
	addChara(new Chara("FF02",
				     new Param("HP" , 100, 100),
				     new Param("STR",  50, 255),
				     new Param("DEF",  50, 255),
				     new Param("LUK", 100, 255),
				     new Param("MNY", 100, 500)));
	addChara(new Chara("FF03",
				     new Param("HP" , 100, 100),
				     new Param("STR",  50, 255),
				     new Param("DEF",  50, 255),
				     new Param("LUK", 200, 255),
				     new Param("MNY", 50, 500)));
	addChara(new Chara("FF04",
				     new Param("HP" , 100, 100),
				     new Param("STR",  50, 255),
				     new Param("DEF",  50, 255),
				     new Param("LUK",  50, 255),
				     new Param("MNY", 200, 500)));
	addChara(new Chara("FF05",
				     new Param("HP" , 100, 100),
				     new Param("STR",  50, 255),
				     new Param("DEF",  50, 255),
				     new Param("LUK", 100, 255),
				     new Param("MNY", 100, 500)));
	addChara(new Chara("FF06",
				     new Param("HP" , 100, 100),
				     new Param("STR",  50, 255),
				     new Param("DEF",  50, 255),
				     new Param("LUK", 200, 255),
				     new Param("MNY", 50, 500)));
    }

    public void addChara(Chara a) {
	charaCollectionList.add(a);
    }
    
    public Chara getNewChara() {
	int r = (int)(Math.random() * charaCollectionList.size());
	Chara cloneChara = charaCollectionList.get(r);

	Chara newChara = new Chara (cloneChara.getName(),
				    new Param(cloneChara.getName(),
					      cloneChara.getHp().getCurMax(),
					      cloneChara.getHp().getMax()),
				    new Param(cloneChara.getName(),
					      cloneChara.getStr().getCurMax(),
					      cloneChara.getStr().getMax()),
				    new Param(cloneChara.getName(),
					      cloneChara.getDef().getCurMax(),
					      cloneChara.getDef().getMax()),
				    new Param(cloneChara.getName(),
					      cloneChara.getLuk().getCurMax(),
					      cloneChara.getLuk().getMax()),
					new Param(cloneChara.getName(),
					      cloneChara.getMny().getCurMax(),
					      cloneChara.getMny().getMax()));
	return newChara;
    }
}

