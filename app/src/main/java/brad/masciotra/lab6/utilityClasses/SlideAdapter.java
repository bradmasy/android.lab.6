package brad.masciotra.lab6.utilityClasses;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

import brad.masciotra.lab6.MainActivity;
import brad.masciotra.lab6.R;
import brad.masciotra.lab6.firebase.Usage;
import brad.masciotra.lab6.fragments.ViewOne;
import brad.masciotra.lab6.fragments.ViewThree;
import brad.masciotra.lab6.fragments.ViewTwo;
import brad.masciotra.lab6.fragments.FragmentImplementer;

public class SlideAdapter extends FragmentStateAdapter {

    final private List<Usage> usageList = new ArrayList<>();
    final private DatabaseReference database;

    public SlideAdapter(MainActivity main, DatabaseReference database) {
        super(main);
        this.database = database;
        // add usage objects

//        this.database.child("Usage").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<DataSnapshot> task) {
//
//                Log.d("info",String.valueOf(task.getResult().getValue()));
//            }
//        });
//
        for(int i = 0; i < getItemCount(); i++){
            usageList.add(new Usage(i + 1));
        }
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        FragmentImplementer implementer = null;
//        this.database.child("Usage").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<DataSnapshot> task) {
//
//                if (task.isSuccessful()) {
//                    Log.d("info", String.valueOf(task.getResult().getValue()));
//
//                } else {
//                    for (int i = 0; i < getItemCount(); i++) {
//                        usageList.add(new Usage(i + 1));
//                    }
//                }
//            }
//        });
        switch (position) {
            case 0:
                implementer = new ViewOne(R.layout.frag_view_one, usageList.get(0));
                break;
            case 1:
                implementer = new ViewTwo(R.layout.frag_view_two, usageList.get(1));
                break;
            case 2:
                implementer = new ViewThree(R.layout.frag_view_three, usageList.get(2));
                break;
        }
        return implementer;
    }

    @Override
    public int getItemCount() {
        return MainActivity.numberOfPages;
    }
}
