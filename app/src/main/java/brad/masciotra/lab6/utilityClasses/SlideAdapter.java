package brad.masciotra.lab6.utilityClasses;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import brad.masciotra.lab6.MainActivity.*;
import brad.masciotra.lab6.MainActivity;
import brad.masciotra.lab6.R;
import brad.masciotra.lab6.fragments.ViewOne;
import brad.masciotra.lab6.fragments.ViewThree;
import brad.masciotra.lab6.fragments.ViewTwo;
import brad.masciotra.lab6.interfaces.FragmentImplementer;

public class SlideAdapter extends FragmentStateAdapter {


    public SlideAdapter(MainActivity main){
        super(main);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        FragmentImplementer implementer = null;
        switch(position){
            case 0:
                implementer = new ViewOne(R.layout.frag_view_one);
                break;
            case 1:
                implementer = new ViewTwo(R.layout.frag_view_two);
                break;
            case 2:
                implementer = new ViewThree(R.layout.frag_view_three);
                break;
        }
        return implementer;
    }

    @Override
    public int getItemCount() {
        return MainActivity.numberOfPages;
    }
}
