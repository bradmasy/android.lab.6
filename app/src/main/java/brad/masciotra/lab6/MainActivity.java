package brad.masciotra.lab6;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.ArrayList;
import java.util.List;
import brad.masciotra.lab6.firebase.Usage;
import brad.masciotra.lab6.transformers.ZoomOutTransformer;
import brad.masciotra.lab6.utilityClasses.SlideAdapter;

public class MainActivity extends FragmentActivity {

    final public static int numberOfPages = 3;
    private ViewPager2 pager;
    private FragmentStateAdapter FSA;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    final private List<Usage> usageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        // read database here if exists already
        pager = findViewById(R.id.pager);
        FSA = new SlideAdapter(this,databaseReference);
        pager.setAdapter(FSA);
        pager.setPageTransformer(new ZoomOutTransformer());
    }
}