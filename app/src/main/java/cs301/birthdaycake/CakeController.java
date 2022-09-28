package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener,
        View.OnTouchListener {

    private CakeView view;
    private CakeModel model;

    public CakeController(CakeView cakeView) {
        view = cakeView;
        model = view.getMod();
    }


    @Override
    public void onClick(View v) {
        Log.d("String", "Wooooooo");
        if (v.getId() == R.id.extinguish) {
            model.blowOut();
        }
        view.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton switchy, boolean isChecked) {
        if (switchy.getId() == R.id.candleSwitch) {
            Log.d("String", "Yeehaw!!!");
            model.candleBeGone();
        }
        if (switchy.getId() == R.id.frostSwitch) {
            Log.d("String", "Grrrrrrrr");
            model.frostBeGone();
        }
        view.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.d("String", "Aaaaaaa oh noooooo");
        if (seekBar.getId() == R.id.candleBar) {
            model.setCandleNum(progress);
        }
        view.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getActionMasked() == MotionEvent.ACTION_DOWN) {
            //Get touch location
            view.bX = event.getX();
            view.bY = event.getY();

            view.invalidate();
            return true;
        }

        return false;
    }
}
