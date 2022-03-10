package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {

    private CakeView looksGood;
    private CakeModel sheThique;

    CakeController(CakeView beautiful) {
        looksGood = beautiful;
        sheThique = beautiful.getCake();
    }

    @Override
    public void onClick(View v) {
        sheThique.flameOnOff();
        looksGood.invalidate();
    }

} //class CakeController
