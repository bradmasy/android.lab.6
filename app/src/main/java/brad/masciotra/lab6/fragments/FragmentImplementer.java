package brad.masciotra.lab6.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import brad.masciotra.lab6.random.RandomColor;

public class FragmentImplementer extends Fragment {

    public FragmentImplementer(int implementation){
        super(implementation);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RandomColor.changeBackground(this);
    }
}
