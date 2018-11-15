public class Chara01 {
    public static void main(String[] args){
	System.out.println("count: " + Chara.getCount());
	Chara chara1 = new Chara("DD01",
				 new Param("HP" ,  15, 50),
				 new Param("STR", 100, 255),
				 new Param("DEF", 100, 255),
				 new Param("LUK", 100, 255));
	System.out.println("count: " + Chara.getCount());
	
	Chara chara2 = new Chara("BB01",
				 new Param("HP" ,  40, 100),
				 new Param("STR", 200, 255),
				 new Param("DEF", 200, 255),
				 new Param("LUK",  10,  40));
	System.out.println("count: " + Chara.getCount());

	CharaAdd chara3 = new CharaAdd("FF01",
				       new Param("HP" ,  40, 100),
				       new Param("STR",  50, 100),
				       new Param("DEF",  50, 100),
				       new Param("LUK",  10,  40),
				       new Param("SPD",  10,  40));
	System.out.println("count: " + Chara.getCount());

	System.out.println(chara1);
	System.out.println(chara2);
	System.out.println(chara3);
    }
}


