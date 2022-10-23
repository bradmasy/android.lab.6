package brad.masciotra.lab6.listeners;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

public class SwipeListener implements View.OnTouchListener {



    public SwipeListener(Context ctx){

    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
