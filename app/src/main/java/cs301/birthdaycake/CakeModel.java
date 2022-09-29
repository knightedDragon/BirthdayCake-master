package cs301.birthdaycake;

public class CakeModel {
    public boolean lit = true, frosted = true, candles = true;
    public int candleNum = 2;
    public float X=0, Y=0;

    public void blowOut() {
        lit = !(lit);
    }
    public void candleBeGone() {
        candles = !(candles);
    }
    public void frostBeGone() {frosted = !(frosted);}


    public void setCandleNum(int progress) {
        candleNum = progress;
    }

    public void setX(float x){
        X=x;
    }

    public void setY(float y){
        Y=y;
    }

}
