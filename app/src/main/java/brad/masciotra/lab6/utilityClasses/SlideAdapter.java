package brad.masciotra.lab6.utilityClasses;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import brad.masciotra.lab6.MainActivity;

public class SlideAdapter extends FragmentStateAdapter {


    public SlideAdapter(MainActivity main){
        super(main);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
