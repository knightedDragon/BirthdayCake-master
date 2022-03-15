package cs301.birthdaycake;

public class CakeModel {

    public boolean hasFrosting = true;
    public boolean hasCandles = true;
    public boolean isLit = true;
    public int candleNum = 2;

    public void flameOnOff() {
        if (isLit == true) {
            isLit = false;
        } else {
            isLit = true;
        }
    }
    public boolean setHasCandles(boolean isChecked) {
        if (isChecked) {
            hasCandles = true;
        } else {
            hasCandles = false;
        }
        return isChecked;
    }
    public void setCandleNum(int howMany) {
        candleNum = howMany;
    }

} //class CakeModel
