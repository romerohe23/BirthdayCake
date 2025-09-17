package cs301.birthdaycake;

public class CakeController {
    private final CakeView view;
    private final CakeModel model;


    public CakeController(CakeView view) {

        this.view  = view;
        this.model = view.getModel();

    }





}