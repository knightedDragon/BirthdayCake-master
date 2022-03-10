package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CakeView cake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        cake = findViewById(R.id.cakeview);
        CakeController nomNom = new CakeController(cake);

        Button blowButton = findViewById(R.id.blowButton);
        blowButton.setOnClickListener(nomNom);

        CompoundButton candlesMaybe = findViewById(R.id.candleSwitch);
        candlesMaybe.setOnCheckedChangeListener(nomNom);


    }


    public void goodbye(View button){
        Log.i("button","Goodbye");
        finishAffinity();
    }
    //Bug is an IllegalStateException: Could not find method goodbye(View) in a parent or ancestor...
    //Step over is crooked blue arrow, resume is green button, value is 2131492869
}
