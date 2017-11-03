package jp.ac.uryukyu.ie.ex3.pair20;

public  class  ExDice  extends  Dice {
    private  int valMax;
    private  int valMin;
    public  ExDice ( int  valMax, int valMin ) {
        this . valMax = valMax;
        this . valMin = valMin;
    }

    public  int  getValMax () { return valMax;}
    public  int  getValMin () { return valMin;}

    @Override 
    public  void  play () {
        int value = (int)(Math.random()*(this.getValMax()-this.getValMin())+this.getValMin())+1;

        super . setVal (value);
    }
}