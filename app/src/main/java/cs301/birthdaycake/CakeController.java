package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener {
    private CakeView view;
    private CakeModel model;

    public CakeController(CakeView cakeView) {
        view = cakeView;
        model = view.getMod();
    }


    @Override
    public void onClick(View v) {
        Log.d("String", "Wooooooo");
        if (v.getId() == R.id.blowButton) {
            model.blowOut();
        }
        view.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("String", "Yeehaw!!!");
        if (buttonView.getId() == R.id.candleSwitch) {
            model.candleBeGone();
        }
        view.invalidate();
    }
}
