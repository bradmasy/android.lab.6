package brad.masciotra.lab6.fragments;

import brad.masciotra.lab6.firebase.Usage;
import brad.masciotra.lab6.random.*;

public class ViewOne extends FragmentImplementer {

    final private Usage usage;
    public ViewOne(int implementation, Usage usage) {
        super(implementation);
        this.usage = usage;
    }

    @Override
    public void onResume() {
        super.onResume();
        RandomColor.changeBackground(this);
        int count = usage.getCount();
        usage.setCount(++count);
    }
}
