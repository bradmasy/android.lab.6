package brad.masciotra.lab6.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import brad.masciotra.lab6.firebase.Usage;
import brad.masciotra.lab6.random.RandomColor;

public class ViewTwo extends FragmentImplementer {

    final private Usage usage;

    public ViewTwo(int implementation, Usage usage) {
        super(implementation);
        this.usage = usage;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        RandomColor.changeBackground(this);
        int count = usage.getCount();
        usage.setCount(++count);
    }
}
