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

} //class CakeModel
