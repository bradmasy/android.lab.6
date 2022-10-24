package brad.masciotra.lab6.firebase;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Usage {

    private int page;
    private int count;
    private String id;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    public Usage(final int page){
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        this.count = 0;
        this.page = page;
        this.id = databaseReference.push().getKey();
    }


    private void updateCount(int count){
        Task setValueTask = databaseReference.child("Usage").child(id).setValue(this);


    }

    public int getCount() {
        return count;
        // retrieve item
    }

    public void setCount(int count) {
        this.count = count;
        updateCount(count);
        // update here
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
