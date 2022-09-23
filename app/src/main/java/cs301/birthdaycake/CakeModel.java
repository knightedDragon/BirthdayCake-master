package cs301.birthdaycake;

public class CakeModel {
    public boolean lit = true, frosted = true, candles = true;
    public int candleNum = 2;

    public void blowOut() {
        lit = !(lit);
    }
    public void candleBeGone() {
        candles = !(candles);
    }
    public void frostBeGone() {
        frosted = !(frosted);
    }


    public void setCandleNum(int progress) {
        candleNum = progress;
    }

}
