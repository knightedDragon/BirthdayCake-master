package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
    }

    public void goodbye(View button){
        Log.i("button","Goodbye");
        finishAffinity();
    }
    //Bug is an IllegalStateException: Could not find method goodbye(View) in a parent or ancestor...
    //Step over is crooked blue arrow, resume is green button, value is 2131492869
}
