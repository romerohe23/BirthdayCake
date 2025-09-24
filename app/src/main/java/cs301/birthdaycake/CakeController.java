package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {
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


}



