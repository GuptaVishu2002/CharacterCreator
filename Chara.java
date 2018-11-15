public class Chara {
    private static int count = 1;
    private int id;
    private String _name;
    private Param _hp;
    private Param _str;
    private Param _def;
    private Param _spd;
    private Param _luk;
    private Param _mny;

    Chara(String n, Param h, Param st, Param d, Param l, Param m) {
	this._name = n;
	this._hp   = h;
	this._str  = st;
	this._def  = d;
	this._luk  = l;
	this._mny  = m;
	this.id    = count;
	count++;
    }

    public String getName(){ return this._name; }
    public Param getHp()   { return this._hp; }
    public Param getStr()  { return this._str; }
    public Param getDef()  { return this._def; }
    public Param getLuk()  { return this._luk; }
    public Param getMny()  { return this._mny; }
    public int getId()     { return this.id; }
    public static int getCount() { return count; }

    public void setName(String name) { this._name = name; }
    public void setHp(Param hp)      { this._hp = hp; }
    public void setStr(Param str)    { this._str = str; }
    public void setDef(Param def)    { this._def = def; }
    public void setLuk(Param luk)    { this._luk = luk; }
    public void setMny(Param mny)    { this._mny = mny; }

    public String toString(){
	return "#" + ("00"+getId()).substring(0,3) + ": "
	    + getName() + ": \n"
	    + "   " + getHp() + "\n"
	    + "   " + getStr() + "\n"
	    + "   " + getDef() + "\n"
	    + "   " + getLuk() + "\n"
	    + "   " + getMny();
    }
}

