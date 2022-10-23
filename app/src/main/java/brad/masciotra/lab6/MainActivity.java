package brad.masciotra.lab6;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import brad.masciotra.lab6.utilityClasses.SlideAdapter;

public class MainActivity extends FragmentActivity {

    final public static int numberOfPages = 3;
    private ViewPager2 pager;
    private FragmentStateAdapter FSA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);
        FSA = new SlideAdapter(this);
        pager.setAdapter(FSA);


    }
}