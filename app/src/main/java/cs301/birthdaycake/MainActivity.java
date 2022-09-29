package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView view = findViewById(R.id.cakeview);
        CakeController cakeCon = new CakeController(view);
        
        view.setOnTouchListener(cakeCon);

        Button blow = findViewById(R.id.extinguish);
        blow.setOnClickListener(cakeCon);

        Switch candle = findViewById(R.id.candleSwitch);
        candle.setOnCheckedChangeListener(cakeCon);

        Switch frost = findViewById(R.id.frostSwitch);
        frost.setOnCheckedChangeListener(cakeCon);

        SeekBar candBar = findViewById(R.id.candleBar);
        candBar.setOnSeekBarChangeListener(cakeCon);
    }

    public void goodbye(View button) {
        Log.i("button","Goodbye!");
        finishAffinity();
    }
}
