package jp.ac.uryukyu.ie.ex3.pair20;

public  class  Dice {
    private  int val;

    public  Dice ( int  val ) {
        this . val = val;
  }

    public  Dice () {
    play ();
  }

    public  int  getVal () { return val;}
    public  void  setVal ( int  val ) { this . val = val;}

    public  void  play () {
        val = ( int ) ( Math . random () * 6 ) +  1 ;
  }
}