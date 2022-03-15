package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

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

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        sheThique.setHasCandles(isChecked);
        looksGood.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        sheThique.setCandleNum(progress);
        looksGood.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
} //class CakeController
