package brad.masciotra.lab6.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import brad.masciotra.lab6.R;
import brad.masciotra.lab6.random.*;

import brad.masciotra.lab6.interfaces.FragmentImplementer;

public class ViewOne extends FragmentImplementer {

    public ViewOne(int implementation) {
        super(implementation);
        List<Integer> color = RandomColor.generateRandomColor();


    }

}
