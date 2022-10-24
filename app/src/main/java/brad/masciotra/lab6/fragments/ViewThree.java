package brad.masciotra.lab6.fragments;

import brad.masciotra.lab6.firebase.Usage;
import brad.masciotra.lab6.random.RandomColor;

public class ViewThree  extends FragmentImplementer {

    final private Usage usage;

    public ViewThree(int implementation, Usage usage) {
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
