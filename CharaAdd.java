public class CharaAdd extends Chara {
    private Param _spd;
    
    CharaAdd(String n, Param h, Param st, Param d, Param l, Param sp) {
	super(n, h, st, d, l);
	this._spd = sp;
    }

    public Param getSpd()  { return this._spd; }

    public void setSpd(Param sp)  { this._spd = sp; }

    
        public String toStringWrong(){
            return super.toString() + "\n"
                + "   " + getSpd(); 
        }
    }

