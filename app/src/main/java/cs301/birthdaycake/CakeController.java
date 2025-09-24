package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private final CakeView view;
    private final CakeModel model;


    public CakeController(CakeView view) {

        this.view  = view;
        this.model = view.getModel();

    }

    @Override
    public void onClick(View v) {
        Log.d("cake", "click!");
        model.candlesLit = false;  // extinguishes the flames
        view.invalidate();
    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.getId() == R.id.Candles_Switch) {  // Candle switch
            model.hasCandles = isChecked;
            view.invalidate();
        }
    }


}



