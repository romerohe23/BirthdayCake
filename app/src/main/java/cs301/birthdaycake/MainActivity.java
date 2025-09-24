package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(cakeView);


        Button blowOut = findViewById(R.id.button);
        blowOut.setOnClickListener(controller);

        Switch candlesSwitch = findViewById(R.id.Candles_Switch);
        candlesSwitch.setOnCheckedChangeListener(controller);

    }


    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
