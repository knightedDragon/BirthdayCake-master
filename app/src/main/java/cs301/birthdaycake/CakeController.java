package cs301.birthdaycake;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, View.OnTouchListener,
        CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
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
        public boolean onTouch(View view, MotionEvent event) {
            // check that it was the first tap
            if (event.getActionMasked() == MotionEvent.ACTION_DOWN) { // action_down is when they click down (press on screen)
                //Get touch location
                model.moveBalloon(event.getX(), event.getY());
                return true; // "consumed" the event
            }
            view.invalidate();
            return false; // in this case we didn't do anything
        }
    };

