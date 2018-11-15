public class Chara02 {
    public static void main(String[] args){
	Chara charaList[] = new Chara[3];
	System.out.println("count: " + Chara.getCount());
	charaList[0] = new Chara("DD01",
				 new Param("HP" ,  15, 50),
				 new Param("STR", 100, 255),
				 new Param("DEF", 100, 255),
				 new Param("LUK", 100, 255));
	System.out.println("count: " + Chara.getCount());
	
	charaList[1] = new Chara("BB01",
				 new Param("HP" ,  40, 100),
				 new Param("STR", 200, 255),
				 new Param("DEF", 200, 255),
				 new Param("LUK",  10,  40));
	System.out.println("count: " + Chara.getCount());

	charaList[2] = (Chara) new CharaAdd("FF01",
				       new Param("HP" ,  40, 100),
				       new Param("STR",  50, 100),
				       new Param("DEF",  50, 100),
				       new Param("LUK",  10,  40),
				       new Param("SPD",  10,  40));
	System.out.println("count: " + Chara.getCount());

	for(int i=0; i<3; i++){
	    System.out.println(charaList[i]);
	}
    }
}


